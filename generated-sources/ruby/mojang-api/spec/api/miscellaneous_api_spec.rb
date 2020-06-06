=begin
#Mojang API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::MiscellaneousApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'MiscellaneousApi' do
  before do
    # run before each test
    @instance = OpenapiClient::MiscellaneousApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MiscellaneousApi' do
    it 'should create an instance of MiscellaneousApi' do
      expect(@instance).to be_instance_of(OpenapiClient::MiscellaneousApi)
    end
  end

  # unit tests for get_orders_statistics
  # Get statistics on the sales of Minecraft.
  # @param order_statistics_request The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
  # @param [Hash] opts the optional parameters
  # @return [OrderStatisticsResponse]
  describe 'get_orders_statistics test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end