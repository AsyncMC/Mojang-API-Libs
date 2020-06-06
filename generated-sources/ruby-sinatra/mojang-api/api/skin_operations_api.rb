require 'json'


MyApp.add_route('POST', '/user/profile/{stripped_uuid}/skin', {
  "resourcePath" => "/SkinOperations",
  "summary" => "Changes the player skin by URL",
  "nickname" => "change_player_skin", 
  "responseClass" => "void",
  "endpoint" => "/user/profile/{stripped_uuid}/skin", 
  "notes" => "This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.",
  "parameters" => [
    {
      "name" => "stripped_uuid",
      "description" => "The player UUID without hyphens",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/user/profile/{stripped_uuid}/skin', {
  "resourcePath" => "/SkinOperations",
  "summary" => "Resets the player skin to default",
  "nickname" => "reset_player_skin", 
  "responseClass" => "void",
  "endpoint" => "/user/profile/{stripped_uuid}/skin", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "stripped_uuid",
      "description" => "The player UUID without hyphens",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/user/profile/{stripped_uuid}/skin', {
  "resourcePath" => "/SkinOperations",
  "summary" => "Changes the player skin by upload",
  "nickname" => "upload_player_skin", 
  "responseClass" => "void",
  "endpoint" => "/user/profile/{stripped_uuid}/skin", 
  "notes" => "This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.",
  "parameters" => [
    {
      "name" => "stripped_uuid",
      "description" => "The player UUID without hyphens",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

