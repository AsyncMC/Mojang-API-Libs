# This file is auto-generated by OpenAPI Generator (https://openapi-generator.tech)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'Org.OpenAPITools DefaultApi' {
    Context 'DefaultApi' {
        It 'Invoke-DefaultApiAuthenticate' {
            $ret = Invoke-PetApiGetPetById -authenticationRequest "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'DefaultApi' {
        It 'Invoke-DefaultApiInvalidate' {
            $ret = Invoke-PetApiGetPetById -accessKeys "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'DefaultApi' {
        It 'Invoke-DefaultApiRefresh' {
            $ret = Invoke-PetApiGetPetById -refreshRequest "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'DefaultApi' {
        It 'Invoke-DefaultApiSiginout' {
            $ret = Invoke-PetApiGetPetById -usernamePassword "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'DefaultApi' {
        It 'Invoke-DefaultApiValidate' {
            $ret = Invoke-PetApiGetPetById -accessKeys "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
