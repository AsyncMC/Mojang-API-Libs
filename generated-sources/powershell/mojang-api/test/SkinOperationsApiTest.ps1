# This file is auto-generated by OpenAPI Generator (https://openapi-generator.tech)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'Org.OpenAPITools SkinOperationsApi' {
    Context 'SkinOperationsApi' {
        It 'Invoke-SkinOperationsApiChangePlayerSkin' {
            $ret = Invoke-PetApiGetPetById -strippedUuid "TEST_VALUE" -url "TEST_VALUE" -model "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'SkinOperationsApi' {
        It 'Invoke-SkinOperationsApiResetPlayerSkin' {
            $ret = Invoke-PetApiGetPetById -strippedUuid "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'SkinOperationsApi' {
        It 'Invoke-SkinOperationsApiUploadPlayerSkin' {
            $ret = Invoke-PetApiGetPetById -strippedUuid "TEST_VALUE" -file "TEST_VALUE" -model "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
