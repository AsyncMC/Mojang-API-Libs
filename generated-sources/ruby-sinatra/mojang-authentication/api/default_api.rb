require 'json'


MyApp.add_route('POST', '/authenticate', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "authenticate", 
  "responseClass" => "Authentication",
  "endpoint" => "/authenticate", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "AuthenticationRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/invalidate', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "invalidate", 
  "responseClass" => "void",
  "endpoint" => "/invalidate", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "AccessKeys",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/refresh', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "refresh", 
  "responseClass" => "RefreshResponse",
  "endpoint" => "/refresh", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "RefreshRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/signout', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "siginout", 
  "responseClass" => "void",
  "endpoint" => "/signout", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "UsernamePassword",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/validate', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "validate", 
  "responseClass" => "void",
  "endpoint" => "/validate", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "AccessKeys",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

