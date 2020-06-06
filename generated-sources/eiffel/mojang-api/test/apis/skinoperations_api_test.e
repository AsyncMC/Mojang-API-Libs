note
    description: "API tests for SKINOPERATIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class SKINOPERATIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_change_player_skin
            -- Changes the player skin by URL
            -- 
            -- This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts. 
        local
            l_stripped_uuid: STRING_32
            l_url: STRING_32
            l_model: SKIN_MODEL
        do
            -- TODO: Initialize required params.
            -- l_stripped_uuid
            -- l_url
                      
            -- api.change_player_skin(l_stripped_uuid, l_url, l_model)
            assert ("not_implemented", False)
        end
    
    test_reset_player_skin
            -- Resets the player skin to default
            -- 
            --  
        local
            l_stripped_uuid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_stripped_uuid
                      
            -- api.reset_player_skin(l_stripped_uuid)
            assert ("not_implemented", False)
        end
    
    test_upload_player_skin
            -- Changes the player skin by upload
            -- 
            -- This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well. 
        local
            l_stripped_uuid: STRING_32
            l_file: FILE
            l_model: SKIN_MODEL
        do
            -- TODO: Initialize required params.
            -- l_stripped_uuid
            -- l_file
                      
            -- api.upload_player_skin(l_stripped_uuid, l_file, l_model)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SKINOPERATIONS_API
            -- Create an object instance of `SKINOPERATIONS_API'.
        once            
            create { SKINOPERATIONS_API } Result
        end

end
