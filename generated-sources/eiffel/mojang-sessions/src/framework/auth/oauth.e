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
	OAUTH

inherit

	AUTHENTICATION

feature -- Access

	access_token: detachable STRING_32

feature -- Change Element

	set_access_token (a_token: STRING_32)
			-- Set `access_token' with `a_token'.
		do
			access_token := a_token
		ensure
			access_token_set: access_token = a_token
		end

	apply_to_params(a_query_params: LIST [TUPLE [name:STRING; value:STRING]]; a_header_params: STRING_TABLE [STRING])
   			-- <Precursor>.
		do
			if attached access_token as l_access_token then
				a_header_params.force ("Bearer " + l_access_token,"Authorization" )
			end
		end
end
