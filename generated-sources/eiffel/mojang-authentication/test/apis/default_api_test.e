note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_authenticate
            -- 
            -- 
            --  
        local
            l_response: AUTHENTICATION
            l_authentication_request: AUTHENTICATION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_authentication_request
                      
            -- l_response := api.authenticate(l_authentication_request)
            assert ("not_implemented", False)
        end
    
    test_invalidate
            -- 
            -- 
            --  
        local
            l_access_keys: ACCESS_KEYS
        do
            -- TODO: Initialize required params.
            -- l_access_keys
                      
            -- api.invalidate(l_access_keys)
            assert ("not_implemented", False)
        end
    
    test_refresh
            -- 
            -- 
            --  
        local
            l_response: REFRESH_RESPONSE
            l_refresh_request: REFRESH_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_refresh_request
                      
            -- l_response := api.refresh(l_refresh_request)
            assert ("not_implemented", False)
        end
    
    test_siginout
            -- 
            -- 
            --  
        local
            l_username_password: USERNAME_PASSWORD
        do
            -- TODO: Initialize required params.
            -- l_username_password
                      
            -- api.siginout(l_username_password)
            assert ("not_implemented", False)
        end
    
    test_validate
            -- 
            -- 
            --  
        local
            l_access_keys: ACCESS_KEYS
        do
            -- TODO: Initialize required params.
            -- l_access_keys
                      
            -- api.validate(l_access_keys)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once            
            create { DEFAULT_API } Result
        end

end
