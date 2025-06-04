provider "kubernetes" {
  config_path = "~/.kube/config"
}

resource "kubernetes_deployment" "spring_app" {
  metadata {
    name      = "fakedata"
    namespace = "default"
    labels = {
      app = "fakedata"
    }
  }

  spec {
    replicas = 2

    selector {
      match_labels = {
        app = "fakedata"
      }
    }

    template {
      metadata {
        labels = {
          app = "fakedata"
        }
      }
      spec {
        container {
          image = var.docker_image
          name  = "fakedata"
          ports {
            container_port = 8080
          }
        }
      }
    }
  }
}

resource "kubernetes_service" "spring_service" {
  metadata {
    name      = "fakedata-service"
    namespace = "default"
  }
  spec {
    selector = {
      app = "fakedata"
    }
    port {
      port        = 80
      target_port = 8080
    }
    type = "LoadBalancer"
  }
}