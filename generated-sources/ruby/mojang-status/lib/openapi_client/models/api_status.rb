=begin
#Mojang API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'date'

module OpenapiClient
  class ApiStatus
    
    GREEN = 'green'.freeze
    YELLOW = 'yellow'.freeze
    RED = 'red'.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = ApiStatus.constants.select { |c| ApiStatus::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #ApiStatus" if constantValues.empty?
      value
    end
  end
end