require 'json'


MyApp.add_route('GET', '/session/minecraft/profile/{stripped_uuid}', {
  "resourcePath" => "/Login",
  "summary" => "Gets the player's game profile",
  "nickname" => "get_player_profile", 
  "responseClass" => "PlayerProfile",
  "endpoint" => "/session/minecraft/profile/{stripped_uuid}", 
  "notes" => "This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.",
  "parameters" => [
    {
      "name" => "unsigned",
      "description" => "When set to false, the signature data are sent",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
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

