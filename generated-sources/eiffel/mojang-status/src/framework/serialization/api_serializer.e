note
 description:"[
		Mojang API
 		No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
  		OpenAPI spec version: 2020-06-05
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	API_SERIALIZER


feature -- Access

	serializer (f: FUNCTION [TUPLE [content_type:STRING; type:ANY],STRING]; a_content_type: STRING; a_type: ANY): STRING
			-- Serialize an object of type `a_type' using the content type `a_content_type'.
		do
			Result := f.item ([a_content_type, a_type])
		end
end
