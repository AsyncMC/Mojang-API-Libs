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
class CHANGE_SKIN_REQUEST 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    model: detachable SKIN_MODEL 
      
    url: detachable STRING_32 
      -- The URL which Mojang servers will download and apply the skin

feature -- Change Element  
 
    set_model (a_name: like model)
        -- Set 'model' with 'a_name'.
      do
        model := a_name
      ensure
        model_set: model = a_name		
      end

    set_url (a_name: like url)
        -- Set 'url' with 'a_name'.
      do
        url := a_name
      ensure
        url_set: url = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CHANGE_SKIN_REQUEST%N")
        if attached model as l_model then
          Result.append ("%Nmodel:")
          Result.append (l_model.out)
          Result.append ("%N")    
        end  
        if attached url as l_url then
          Result.append ("%Nurl:")
          Result.append (l_url.out)
          Result.append ("%N")    
        end  
      end
end

