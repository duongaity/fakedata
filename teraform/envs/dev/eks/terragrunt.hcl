include {
  path = find_in_parent_folders()
}

terraform {
  source = "../../modules/eks"
}

inputs = {
  cluster_name = "fakedata-dev-cluster"
}