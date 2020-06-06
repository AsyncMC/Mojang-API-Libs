=begin
Mojang Session API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05
Generated by: https://github.com/openapitools/openapi-generator.git

=end
Rails.application.routes.draw do

  def add_openapi_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_openapi_route 'GET', '/blockedservers', controller_name: 'bans', action_name: 'get_blocked_server_hashes'
  add_openapi_route 'GET', '/session/minecraft/profile/{stripped_uuid}', controller_name: 'login', action_name: 'get_player_profile'
end