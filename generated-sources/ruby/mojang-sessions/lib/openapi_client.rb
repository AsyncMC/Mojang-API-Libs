=begin
#Mojang Session API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

# Common files
require 'openapi_client/api_client'
require 'openapi_client/api_error'
require 'openapi_client/version'
require 'openapi_client/configuration'

# Models
require 'openapi_client/models/player_profile'
require 'openapi_client/models/player_profile_property'
require 'openapi_client/models/player_profile_texture_property_value'
require 'openapi_client/models/player_skin_metadata'
require 'openapi_client/models/player_skin_url'
require 'openapi_client/models/player_texture'
require 'openapi_client/models/player_texture_url'
require 'openapi_client/models/session_api_error'

# APIs
require 'openapi_client/api/bans_api'
require 'openapi_client/api/login_api'

module OpenapiClient
  class << self
    # Customize default settings for the SDK using block.
    #   OpenapiClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end