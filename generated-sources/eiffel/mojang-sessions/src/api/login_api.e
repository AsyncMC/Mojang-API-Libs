note
 description:"[
		Mojang Session API
 		No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
  		OpenAPI spec version: 2020-06-05
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	LOGIN_API

inherit

    API_I


feature -- API Access


	player_profile (stripped_uuid: STRING_32; unsigned: BOOLEAN): detachable PLAYER_PROFILE
			-- Gets the player&#39;s game profile
			-- This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
			-- 
			-- argument: stripped_uuid The player UUID without hyphens (required)
			-- 
			-- argument: unsigned When set to false, the signature data are sent (optional, default to null)
			-- 
			-- 
			-- Result PLAYER_PROFILE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/session/minecraft/profile/{stripped_uuid}"
			l_path.replace_substring_all ("{"+"stripped_uuid"+"}", api_client.url_encode (stripped_uuid.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "unsigned", unsigned));


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { PLAYER_PROFILE } l_response.data ({ PLAYER_PROFILE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end
