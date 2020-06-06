# This file is auto-generated by OpenAPI Generator (https://openapi-generator.tech)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'Org.OpenAPITools SecurityQuestionAnswerApi' {
    Context 'SecurityQuestionAnswerApi' {
        It 'Invoke-SecurityQuestionAnswerApiCheckSecurityStatus' {
            $ret = Invoke-PetApiGetPetById
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'SecurityQuestionAnswerApi' {
        It 'Invoke-SecurityQuestionAnswerApiListPendingSecurityQuestions' {
            $ret = Invoke-PetApiGetPetById
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'SecurityQuestionAnswerApi' {
        It 'Invoke-SecurityQuestionAnswerApiSendSecurityQuestionAnswers' {
            $ret = Invoke-PetApiGetPetById -securityAnswer "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
