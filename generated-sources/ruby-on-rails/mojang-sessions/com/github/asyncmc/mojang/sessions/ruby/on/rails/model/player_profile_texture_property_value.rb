=begin
Mojang Session API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class PlayerProfileTexturePropertyValue < ApplicationRecord
  validates_presence_of :timestamp
  validates_presence_of :profile_id
  validates_presence_of :profile_name

end
