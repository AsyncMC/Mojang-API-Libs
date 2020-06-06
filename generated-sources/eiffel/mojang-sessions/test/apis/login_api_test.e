note
    description: "API tests for LOGIN_API"
    date: "$Date$"
    revision: "$Revision$"


class LOGIN_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_player_profile
            -- Gets the player&#39;s game profile
            -- 
            -- This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like. 
        local
            l_response: PLAYER_PROFILE
            l_stripped_uuid: STRING_32
            l_unsigned: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_stripped_uuid
                      
            -- l_response := api.player_profile(l_stripped_uuid, l_unsigned)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LOGIN_API
            -- Create an object instance of `LOGIN_API'.
        once            
            create { LOGIN_API } Result
        end

end
