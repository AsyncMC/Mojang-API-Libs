=begin
Mojang Authentication API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class AccessKeys < ApplicationRecord
  validates_presence_of :access_token

end
