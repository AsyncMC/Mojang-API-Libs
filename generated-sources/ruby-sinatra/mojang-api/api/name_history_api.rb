require 'json'


MyApp.add_route('POST', '/profiles/minecraft', {
  "resourcePath" => "/NameHistory",
  "summary" => "Find the current UUID of multiple players at once",
  "nickname" => "find_unique_ids_by_name", 
  "responseClass" => "Array<CurrentPlayerIDs>",
  "endpoint" => "/profiles/minecraft", 
  "notes" => "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Array with the player names",
      "dataType" => "Array<String>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/profiles/{stripped_uuid}/names', {
  "resourcePath" => "/NameHistory",
  "summary" => "Gets the full player's name history",
  "nickname" => "get_name_history", 
  "responseClass" => "Array<NameChange>",
  "endpoint" => "/user/profiles/{stripped_uuid}/names", 
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


MyApp.add_route('GET', '/users/profiles/minecraft/{username}', {
  "resourcePath" => "/NameHistory",
  "summary" => "Find the UUID by name",
  "nickname" => "get_unique_id_by_name", 
  "responseClass" => "CurrentPlayerIDs",
  "endpoint" => "/users/profiles/minecraft/{username}", 
  "notes" => "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.",
  "parameters" => [
    {
      "name" => "at",
      "description" => "Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "username",
      "description" => "The username in a given time, or in present if \&quot;at\&quot; is not sent",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

