@isTest
private class OASPlayerProfilePropertyTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlayerProfileProperty playerProfileProperty1 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty2 = playerProfileProperty1;
        OASPlayerProfileProperty playerProfileProperty3 = new OASPlayerProfileProperty();
        OASPlayerProfileProperty playerProfileProperty4 = playerProfileProperty3;

        System.assert(playerProfileProperty1.equals(playerProfileProperty2));
        System.assert(playerProfileProperty2.equals(playerProfileProperty1));
        System.assert(playerProfileProperty1.equals(playerProfileProperty1));
        System.assert(playerProfileProperty3.equals(playerProfileProperty4));
        System.assert(playerProfileProperty4.equals(playerProfileProperty3));
        System.assert(playerProfileProperty3.equals(playerProfileProperty3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlayerProfileProperty playerProfileProperty1 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty2 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty3 = new OASPlayerProfileProperty();
        OASPlayerProfileProperty playerProfileProperty4 = new OASPlayerProfileProperty();

        System.assert(playerProfileProperty1.equals(playerProfileProperty2));
        System.assert(playerProfileProperty2.equals(playerProfileProperty1));
        System.assert(playerProfileProperty3.equals(playerProfileProperty4));
        System.assert(playerProfileProperty4.equals(playerProfileProperty3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlayerProfileProperty playerProfileProperty1 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty2 = new OASPlayerProfileProperty();

        System.assertEquals(false, playerProfileProperty1.equals('foo'));
        System.assertEquals(false, playerProfileProperty2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlayerProfileProperty playerProfileProperty1 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty2 = new OASPlayerProfileProperty();
        OASPlayerProfileProperty playerProfileProperty3;

        System.assertEquals(false, playerProfileProperty1.equals(playerProfileProperty3));
        System.assertEquals(false, playerProfileProperty2.equals(playerProfileProperty3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlayerProfileProperty playerProfileProperty1 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty2 = new OASPlayerProfileProperty();

        System.assertEquals(playerProfileProperty1.hashCode(), playerProfileProperty1.hashCode());
        System.assertEquals(playerProfileProperty2.hashCode(), playerProfileProperty2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlayerProfileProperty playerProfileProperty1 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty2 = OASPlayerProfileProperty.getExample();
        OASPlayerProfileProperty playerProfileProperty3 = new OASPlayerProfileProperty();
        OASPlayerProfileProperty playerProfileProperty4 = new OASPlayerProfileProperty();

        System.assert(playerProfileProperty1.equals(playerProfileProperty2));
        System.assert(playerProfileProperty3.equals(playerProfileProperty4));
        System.assertEquals(playerProfileProperty1.hashCode(), playerProfileProperty2.hashCode());
        System.assertEquals(playerProfileProperty3.hashCode(), playerProfileProperty4.hashCode());
    }
}
