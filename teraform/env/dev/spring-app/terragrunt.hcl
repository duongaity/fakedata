include {
  path = find_in_parent_folders()
}

terraform {
  source = "../../modules/spring-app"
}

inputs = {
  docker_image = "674059452637.dkr.ecr.us-east-1.amazonaws.com/fakedata:latest"
}