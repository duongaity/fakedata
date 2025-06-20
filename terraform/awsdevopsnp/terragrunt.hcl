locals {
  env         = "prod"
  region      = "us-east-1"
  aws_profile = "awsdevops"
}

terraform {
  source = "../modules//"
}

inputs = {
  env         = local.env
  region      = local.region
  aws_profile = local.aws_profile
}
