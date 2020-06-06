@isTest
private class OASCurrentPlayerIDsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCurrentPlayerIDs currentPlayerIDs1 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs2 = currentPlayerIDs1;
        OASCurrentPlayerIDs currentPlayerIDs3 = new OASCurrentPlayerIDs();
        OASCurrentPlayerIDs currentPlayerIDs4 = currentPlayerIDs3;

        System.assert(currentPlayerIDs1.equals(currentPlayerIDs2));
        System.assert(currentPlayerIDs2.equals(currentPlayerIDs1));
        System.assert(currentPlayerIDs1.equals(currentPlayerIDs1));
        System.assert(currentPlayerIDs3.equals(currentPlayerIDs4));
        System.assert(currentPlayerIDs4.equals(currentPlayerIDs3));
        System.assert(currentPlayerIDs3.equals(currentPlayerIDs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCurrentPlayerIDs currentPlayerIDs1 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs2 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs3 = new OASCurrentPlayerIDs();
        OASCurrentPlayerIDs currentPlayerIDs4 = new OASCurrentPlayerIDs();

        System.assert(currentPlayerIDs1.equals(currentPlayerIDs2));
        System.assert(currentPlayerIDs2.equals(currentPlayerIDs1));
        System.assert(currentPlayerIDs3.equals(currentPlayerIDs4));
        System.assert(currentPlayerIDs4.equals(currentPlayerIDs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCurrentPlayerIDs currentPlayerIDs1 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs2 = new OASCurrentPlayerIDs();

        System.assertEquals(false, currentPlayerIDs1.equals('foo'));
        System.assertEquals(false, currentPlayerIDs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCurrentPlayerIDs currentPlayerIDs1 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs2 = new OASCurrentPlayerIDs();
        OASCurrentPlayerIDs currentPlayerIDs3;

        System.assertEquals(false, currentPlayerIDs1.equals(currentPlayerIDs3));
        System.assertEquals(false, currentPlayerIDs2.equals(currentPlayerIDs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCurrentPlayerIDs currentPlayerIDs1 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs2 = new OASCurrentPlayerIDs();

        System.assertEquals(currentPlayerIDs1.hashCode(), currentPlayerIDs1.hashCode());
        System.assertEquals(currentPlayerIDs2.hashCode(), currentPlayerIDs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCurrentPlayerIDs currentPlayerIDs1 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs2 = OASCurrentPlayerIDs.getExample();
        OASCurrentPlayerIDs currentPlayerIDs3 = new OASCurrentPlayerIDs();
        OASCurrentPlayerIDs currentPlayerIDs4 = new OASCurrentPlayerIDs();

        System.assert(currentPlayerIDs1.equals(currentPlayerIDs2));
        System.assert(currentPlayerIDs3.equals(currentPlayerIDs4));
        System.assertEquals(currentPlayerIDs1.hashCode(), currentPlayerIDs2.hashCode());
        System.assertEquals(currentPlayerIDs3.hashCode(), currentPlayerIDs4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCurrentPlayerIDs currentPlayerIDs = new OASCurrentPlayerIDs();
        System.assertEquals(false, currentPlayerIDs.legacy);
        System.assertEquals(false, currentPlayerIDs.demo);
        System.assertEquals(null, currentPlayerIDs.id);
        System.assertEquals(null, currentPlayerIDs.name);
    }
}
