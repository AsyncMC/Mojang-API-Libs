@isTest
private class OASReducedUserDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASReducedUserData reducedUserData1 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData2 = reducedUserData1;
        OASReducedUserData reducedUserData3 = new OASReducedUserData();
        OASReducedUserData reducedUserData4 = reducedUserData3;

        System.assert(reducedUserData1.equals(reducedUserData2));
        System.assert(reducedUserData2.equals(reducedUserData1));
        System.assert(reducedUserData1.equals(reducedUserData1));
        System.assert(reducedUserData3.equals(reducedUserData4));
        System.assert(reducedUserData4.equals(reducedUserData3));
        System.assert(reducedUserData3.equals(reducedUserData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReducedUserData reducedUserData1 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData2 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData3 = new OASReducedUserData();
        OASReducedUserData reducedUserData4 = new OASReducedUserData();

        System.assert(reducedUserData1.equals(reducedUserData2));
        System.assert(reducedUserData2.equals(reducedUserData1));
        System.assert(reducedUserData3.equals(reducedUserData4));
        System.assert(reducedUserData4.equals(reducedUserData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReducedUserData reducedUserData1 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData2 = new OASReducedUserData();

        System.assertEquals(false, reducedUserData1.equals('foo'));
        System.assertEquals(false, reducedUserData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReducedUserData reducedUserData1 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData2 = new OASReducedUserData();
        OASReducedUserData reducedUserData3;

        System.assertEquals(false, reducedUserData1.equals(reducedUserData3));
        System.assertEquals(false, reducedUserData2.equals(reducedUserData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReducedUserData reducedUserData1 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData2 = new OASReducedUserData();

        System.assertEquals(reducedUserData1.hashCode(), reducedUserData1.hashCode());
        System.assertEquals(reducedUserData2.hashCode(), reducedUserData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReducedUserData reducedUserData1 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData2 = OASReducedUserData.getExample();
        OASReducedUserData reducedUserData3 = new OASReducedUserData();
        OASReducedUserData reducedUserData4 = new OASReducedUserData();

        System.assert(reducedUserData1.equals(reducedUserData2));
        System.assert(reducedUserData3.equals(reducedUserData4));
        System.assertEquals(reducedUserData1.hashCode(), reducedUserData2.hashCode());
        System.assertEquals(reducedUserData3.hashCode(), reducedUserData4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASReducedUserData reducedUserData = new OASReducedUserData();
        System.assertEquals(new List<OASGameProfileProperty>(), reducedUserData.properties);
        System.assertEquals(null, reducedUserData.id);
    }
}
