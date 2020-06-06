=begin
Mojang Authentication API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05
Generated by: https://github.com/openapitools/openapi-generator.git

=end
Rails.application.routes.draw do

  def add_openapi_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_openapi_route 'POST', '/authenticate', controller_name: 'default', action_name: 'authenticate'
  add_openapi_route 'POST', '/invalidate', controller_name: 'default', action_name: 'invalidate'
  add_openapi_route 'POST', '/refresh', controller_name: 'default', action_name: 'refresh'
  add_openapi_route 'POST', '/signout', controller_name: 'default', action_name: 'siginout'
  add_openapi_route 'POST', '/validate', controller_name: 'default', action_name: 'validate'
end
