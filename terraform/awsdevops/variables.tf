variable "region" {
  description = "AWS region"
  type        = string
}

variable "aws_profile" {
  description = "AWS CLI profile name"
  type        = string
  default     = "default"
}

variable "env" {
  description = "Environment name (dev, staging, prod...)"
  type        = string
}
