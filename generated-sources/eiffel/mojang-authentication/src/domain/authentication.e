note
 description:"[
		Mojang Authentication API
 		No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
  		OpenAPI spec version: 2020-06-05
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class AUTHENTICATION 

inherit

  ANY
      redefine
          out 
      select
          out  
      end

  ACCESS_KEYS 
      rename
          out as out_accesskeys,
          is_equal as is_equal_accesskeys,
          copy as copy_accesskeys
      select
          is_equal_accesskeys,
          copy_accesskeys     
      end   

feature --Access


feature -- Change Element  
 

 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append(out_accesskeys)
        Result.append("%Nclass AUTHENTICATION%N")
      end
end


