=begin
#Mojang API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::NameHistoryApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'NameHistoryApi' do
  before do
    # run before each test
    @instance = OpenapiClient::NameHistoryApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of NameHistoryApi' do
    it 'should create an instance of NameHistoryApi' do
      expect(@instance).to be_instance_of(OpenapiClient::NameHistoryApi)
    end
  end

  # unit tests for find_unique_ids_by_name
  # Find the current UUID of multiple players at once
  # Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
  # @param request_body Array with the player names
  # @param [Hash] opts the optional parameters
  # @return [Array<CurrentPlayerIDs>]
  describe 'find_unique_ids_by_name test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_name_history
  # Gets the full player&#39;s name history
  # @param stripped_uuid The player UUID without hyphens
  # @param [Hash] opts the optional parameters
  # @return [Array<NameChange>]
  describe 'get_name_history test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_unique_id_by_name
  # Find the UUID by name
  # Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
  # @param username The username in a given time, or in present if \&quot;at\&quot; is not sent
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
  # @return [CurrentPlayerIDs]
  describe 'get_unique_id_by_name test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
