=begin
Mojang API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CurrentPlayerIDs < ApplicationRecord
  validates_presence_of :id
  validates_presence_of :name

end