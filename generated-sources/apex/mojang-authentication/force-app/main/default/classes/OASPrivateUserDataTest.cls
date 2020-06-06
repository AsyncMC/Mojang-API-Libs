@isTest
private class OASPrivateUserDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASPrivateUserData privateUserData1 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData2 = privateUserData1;
        OASPrivateUserData privateUserData3 = new OASPrivateUserData();
        OASPrivateUserData privateUserData4 = privateUserData3;

        System.assert(privateUserData1.equals(privateUserData2));
        System.assert(privateUserData2.equals(privateUserData1));
        System.assert(privateUserData1.equals(privateUserData1));
        System.assert(privateUserData3.equals(privateUserData4));
        System.assert(privateUserData4.equals(privateUserData3));
        System.assert(privateUserData3.equals(privateUserData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPrivateUserData privateUserData1 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData2 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData3 = new OASPrivateUserData();
        OASPrivateUserData privateUserData4 = new OASPrivateUserData();

        System.assert(privateUserData1.equals(privateUserData2));
        System.assert(privateUserData2.equals(privateUserData1));
        System.assert(privateUserData3.equals(privateUserData4));
        System.assert(privateUserData4.equals(privateUserData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPrivateUserData privateUserData1 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData2 = new OASPrivateUserData();

        System.assertEquals(false, privateUserData1.equals('foo'));
        System.assertEquals(false, privateUserData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPrivateUserData privateUserData1 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData2 = new OASPrivateUserData();
        OASPrivateUserData privateUserData3;

        System.assertEquals(false, privateUserData1.equals(privateUserData3));
        System.assertEquals(false, privateUserData2.equals(privateUserData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPrivateUserData privateUserData1 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData2 = new OASPrivateUserData();

        System.assertEquals(privateUserData1.hashCode(), privateUserData1.hashCode());
        System.assertEquals(privateUserData2.hashCode(), privateUserData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPrivateUserData privateUserData1 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData2 = OASPrivateUserData.getExample();
        OASPrivateUserData privateUserData3 = new OASPrivateUserData();
        OASPrivateUserData privateUserData4 = new OASPrivateUserData();

        System.assert(privateUserData1.equals(privateUserData2));
        System.assert(privateUserData3.equals(privateUserData4));
        System.assertEquals(privateUserData1.hashCode(), privateUserData2.hashCode());
        System.assertEquals(privateUserData3.hashCode(), privateUserData4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPrivateUserData privateUserData = new OASPrivateUserData();
        System.assertEquals(new List<OASGameProfileProperty>(), privateUserData.properties);
        System.assertEquals(null, privateUserData.id);
    }
}
