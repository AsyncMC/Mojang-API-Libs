# This file is auto-generated by OpenAPI Generator (https://openapi-generator.tech)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'Org.OpenAPITools NameHistoryApi' {
    Context 'NameHistoryApi' {
        It 'Invoke-NameHistoryApiFindUniqueIdsByName' {
            $ret = Invoke-PetApiGetPetById -requestBody "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'NameHistoryApi' {
        It 'Invoke-NameHistoryApiGetNameHistory' {
            $ret = Invoke-PetApiGetPetById -strippedUuid "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'NameHistoryApi' {
        It 'Invoke-NameHistoryApiGetUniqueIdByName' {
            $ret = Invoke-PetApiGetPetById -username "TEST_VALUE" -at "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
