@isTest
private class OASPlayerProfileTexturePropertyValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue1 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue2 = playerProfileTexturePropertyValue1;
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue3 = new OASPlayerProfileTexturePropertyValue();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue4 = playerProfileTexturePropertyValue3;

        System.assert(playerProfileTexturePropertyValue1.equals(playerProfileTexturePropertyValue2));
        System.assert(playerProfileTexturePropertyValue2.equals(playerProfileTexturePropertyValue1));
        System.assert(playerProfileTexturePropertyValue1.equals(playerProfileTexturePropertyValue1));
        System.assert(playerProfileTexturePropertyValue3.equals(playerProfileTexturePropertyValue4));
        System.assert(playerProfileTexturePropertyValue4.equals(playerProfileTexturePropertyValue3));
        System.assert(playerProfileTexturePropertyValue3.equals(playerProfileTexturePropertyValue3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue1 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue2 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue3 = new OASPlayerProfileTexturePropertyValue();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue4 = new OASPlayerProfileTexturePropertyValue();

        System.assert(playerProfileTexturePropertyValue1.equals(playerProfileTexturePropertyValue2));
        System.assert(playerProfileTexturePropertyValue2.equals(playerProfileTexturePropertyValue1));
        System.assert(playerProfileTexturePropertyValue3.equals(playerProfileTexturePropertyValue4));
        System.assert(playerProfileTexturePropertyValue4.equals(playerProfileTexturePropertyValue3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue1 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue2 = new OASPlayerProfileTexturePropertyValue();

        System.assertEquals(false, playerProfileTexturePropertyValue1.equals('foo'));
        System.assertEquals(false, playerProfileTexturePropertyValue2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue1 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue2 = new OASPlayerProfileTexturePropertyValue();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue3;

        System.assertEquals(false, playerProfileTexturePropertyValue1.equals(playerProfileTexturePropertyValue3));
        System.assertEquals(false, playerProfileTexturePropertyValue2.equals(playerProfileTexturePropertyValue3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue1 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue2 = new OASPlayerProfileTexturePropertyValue();

        System.assertEquals(playerProfileTexturePropertyValue1.hashCode(), playerProfileTexturePropertyValue1.hashCode());
        System.assertEquals(playerProfileTexturePropertyValue2.hashCode(), playerProfileTexturePropertyValue2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue1 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue2 = OASPlayerProfileTexturePropertyValue.getExample();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue3 = new OASPlayerProfileTexturePropertyValue();
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue4 = new OASPlayerProfileTexturePropertyValue();

        System.assert(playerProfileTexturePropertyValue1.equals(playerProfileTexturePropertyValue2));
        System.assert(playerProfileTexturePropertyValue3.equals(playerProfileTexturePropertyValue4));
        System.assertEquals(playerProfileTexturePropertyValue1.hashCode(), playerProfileTexturePropertyValue2.hashCode());
        System.assertEquals(playerProfileTexturePropertyValue3.hashCode(), playerProfileTexturePropertyValue4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPlayerProfileTexturePropertyValue playerProfileTexturePropertyValue = new OASPlayerProfileTexturePropertyValue();
        System.assertEquals(false, playerProfileTexturePropertyValue.signatureRequired);
        System.assertEquals(null, playerProfileTexturePropertyValue.timestamp);
        System.assertEquals(null, playerProfileTexturePropertyValue.profileId);
        System.assertEquals(null, playerProfileTexturePropertyValue.profileName);
        System.assertEquals(null, playerProfileTexturePropertyValue.textures);
    }
}
