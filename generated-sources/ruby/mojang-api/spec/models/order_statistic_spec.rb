=begin
#Mojang API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OpenapiClient::OrderStatistic
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'OrderStatistic' do
  before do
    # run before each test
    @instance = OpenapiClient::OrderStatistic.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of OrderStatistic' do
    it 'should create an instance of OrderStatistic' do
      expect(@instance).to be_instance_of(OpenapiClient::OrderStatistic)
    end
  end
end
