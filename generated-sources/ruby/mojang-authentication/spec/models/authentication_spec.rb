=begin
#Mojang Authentication API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OpenapiClient::Authentication
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'Authentication' do
  before do
    # run before each test
    @instance = OpenapiClient::Authentication.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of Authentication' do
    it 'should create an instance of Authentication' do
      expect(@instance).to be_instance_of(OpenapiClient::Authentication)
    end
  end
  describe 'test attribute "access_token"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "client_token"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
