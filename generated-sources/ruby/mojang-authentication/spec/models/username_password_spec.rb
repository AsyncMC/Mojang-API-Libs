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

# Unit tests for OpenapiClient::UsernamePassword
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'UsernamePassword' do
  before do
    # run before each test
    @instance = OpenapiClient::UsernamePassword.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UsernamePassword' do
    it 'should create an instance of UsernamePassword' do
      expect(@instance).to be_instance_of(OpenapiClient::UsernamePassword)
    end
  end
  describe 'test attribute "username"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "password"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
