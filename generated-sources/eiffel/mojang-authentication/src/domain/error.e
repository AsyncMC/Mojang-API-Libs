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
class ERROR 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    error: detachable STRING_32 
      
    error_message: detachable STRING_32 
      

feature -- Change Element  
 
    set_error (a_name: like error)
        -- Set 'error' with 'a_name'.
      do
        error := a_name
      ensure
        error_set: error = a_name		
      end

    set_error_message (a_name: like error_message)
        -- Set 'error_message' with 'a_name'.
      do
        error_message := a_name
      ensure
        error_message_set: error_message = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ERROR%N")
        if attached error as l_error then
          Result.append ("%Nerror:")
          Result.append (l_error.out)
          Result.append ("%N")    
        end  
        if attached error_message as l_error_message then
          Result.append ("%Nerror_message:")
          Result.append (l_error_message.out)
          Result.append ("%N")    
        end  
      end
end


