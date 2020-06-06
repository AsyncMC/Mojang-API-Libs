note
    description: "API tests for NAMEHISTORY_API"
    date: "$Date$"
    revision: "$Revision$"


class NAMEHISTORY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_find_unique_ids_by_name
            -- Find the current UUID of multiple players at once
            -- 
            -- Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned. 
        local
            l_response: LIST [CURRENT_PLAYER_I_DS]
            l_s_tr_in_g_32: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [STRING_32]} l_s_tr_in_g_32.make (2)
                      
            -- l_response := api.find_unique_ids_by_name(l_s_tr_in_g_32)
            assert ("not_implemented", False)
        end
    
    test_name_history
            -- Gets the full player&#39;s name history
            -- 
            --  
        local
            l_response: LIST [NAME_CHANGE]
            l_stripped_uuid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_stripped_uuid
                      
            -- l_response := api.name_history(l_stripped_uuid)
            assert ("not_implemented", False)
        end
    
    test_unique_id_by_name
            -- Find the UUID by name
            -- 
            -- Find the current player name, UUID, demo status and migration flag by the current player name or at a given time. 
        local
            l_response: CURRENT_PLAYER_I_DS
            l_username: STRING_32
            l_at: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_username
                      
            -- l_response := api.unique_id_by_name(l_username, l_at)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: NAMEHISTORY_API
            -- Create an object instance of `NAMEHISTORY_API'.
        once            
            create { NAMEHISTORY_API } Result
        end

end
