require 'json'


MyApp.add_route('GET', '/check', {
  "resourcePath" => "/Default",
  "summary" => "Checks the Mojang service statuses",
  "nickname" => "check_statuses", 
  "responseClass" => "Array<Hash<String, ApiStatus>>",
  "endpoint" => "/check", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

