note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_check_statuses
            -- Checks the Mojang service statuses
            -- 
            --  
        local
            l_response: LIST [STRING_TABLE[API_STATUS]]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.check_statuses
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once            
            create { DEFAULT_API } Result
        end

end
