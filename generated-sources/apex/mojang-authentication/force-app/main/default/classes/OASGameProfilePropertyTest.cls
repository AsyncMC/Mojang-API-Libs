@isTest
private class OASGameProfilePropertyTest {
    @isTest
    private static void equalsSameInstance() {
        OASGameProfileProperty gameProfileProperty1 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty2 = gameProfileProperty1;
        OASGameProfileProperty gameProfileProperty3 = new OASGameProfileProperty();
        OASGameProfileProperty gameProfileProperty4 = gameProfileProperty3;

        System.assert(gameProfileProperty1.equals(gameProfileProperty2));
        System.assert(gameProfileProperty2.equals(gameProfileProperty1));
        System.assert(gameProfileProperty1.equals(gameProfileProperty1));
        System.assert(gameProfileProperty3.equals(gameProfileProperty4));
        System.assert(gameProfileProperty4.equals(gameProfileProperty3));
        System.assert(gameProfileProperty3.equals(gameProfileProperty3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGameProfileProperty gameProfileProperty1 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty2 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty3 = new OASGameProfileProperty();
        OASGameProfileProperty gameProfileProperty4 = new OASGameProfileProperty();

        System.assert(gameProfileProperty1.equals(gameProfileProperty2));
        System.assert(gameProfileProperty2.equals(gameProfileProperty1));
        System.assert(gameProfileProperty3.equals(gameProfileProperty4));
        System.assert(gameProfileProperty4.equals(gameProfileProperty3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGameProfileProperty gameProfileProperty1 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty2 = new OASGameProfileProperty();

        System.assertEquals(false, gameProfileProperty1.equals('foo'));
        System.assertEquals(false, gameProfileProperty2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGameProfileProperty gameProfileProperty1 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty2 = new OASGameProfileProperty();
        OASGameProfileProperty gameProfileProperty3;

        System.assertEquals(false, gameProfileProperty1.equals(gameProfileProperty3));
        System.assertEquals(false, gameProfileProperty2.equals(gameProfileProperty3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGameProfileProperty gameProfileProperty1 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty2 = new OASGameProfileProperty();

        System.assertEquals(gameProfileProperty1.hashCode(), gameProfileProperty1.hashCode());
        System.assertEquals(gameProfileProperty2.hashCode(), gameProfileProperty2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGameProfileProperty gameProfileProperty1 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty2 = OASGameProfileProperty.getExample();
        OASGameProfileProperty gameProfileProperty3 = new OASGameProfileProperty();
        OASGameProfileProperty gameProfileProperty4 = new OASGameProfileProperty();

        System.assert(gameProfileProperty1.equals(gameProfileProperty2));
        System.assert(gameProfileProperty3.equals(gameProfileProperty4));
        System.assertEquals(gameProfileProperty1.hashCode(), gameProfileProperty2.hashCode());
        System.assertEquals(gameProfileProperty3.hashCode(), gameProfileProperty4.hashCode());
    }
}
