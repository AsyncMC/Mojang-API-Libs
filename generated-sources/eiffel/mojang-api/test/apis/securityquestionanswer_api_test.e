note
    description: "API tests for SECURITYQUESTIONANSWER_API"
    date: "$Date$"
    revision: "$Revision$"


class SECURITYQUESTIONANSWER_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_check_security_status
            -- Check if security questions are needed
            -- 
            --  
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.check_security_status
            assert ("not_implemented", False)
        end
    
    test_list_pending_security_questions
            -- Get list of questions
            -- 
            --  
        local
            l_response: LIST [SECURITY_CHALLENGE]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.list_pending_security_questions
            assert ("not_implemented", False)
        end
    
    test_send_security_question_answers
            -- Send back the answers
            -- 
            --  
        local
            l_security_answer: LIST [SECURITY_ANSWER]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [SECURITY_ANSWER]} l_security_answer.make (2)
                      
            -- api.send_security_question_answers(l_security_answer)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SECURITYQUESTIONANSWER_API
            -- Create an object instance of `SECURITYQUESTIONANSWER_API'.
        once            
            create { SECURITYQUESTIONANSWER_API } Result
        end

end
