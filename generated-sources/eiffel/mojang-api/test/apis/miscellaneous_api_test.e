note
    description: "API tests for MISCELLANEOUS_API"
    date: "$Date$"
    revision: "$Revision$"


class MISCELLANEOUS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_orders_statistics
            -- Get statistics on the sales of Minecraft.
            -- 
            --  
        local
            l_response: ORDER_STATISTICS_RESPONSE
            l_order_statistics_request: ORDER_STATISTICS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_order_statistics_request
                      
            -- l_response := api.orders_statistics(l_order_statistics_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MISCELLANEOUS_API
            -- Create an object instance of `MISCELLANEOUS_API'.
        once            
            create { MISCELLANEOUS_API } Result
        end

end
