@isTest
private class OASAccessKeysTest {
    @isTest
    private static void equalsSameInstance() {
        OASAccessKeys accessKeys1 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys2 = accessKeys1;
        OASAccessKeys accessKeys3 = new OASAccessKeys();
        OASAccessKeys accessKeys4 = accessKeys3;

        System.assert(accessKeys1.equals(accessKeys2));
        System.assert(accessKeys2.equals(accessKeys1));
        System.assert(accessKeys1.equals(accessKeys1));
        System.assert(accessKeys3.equals(accessKeys4));
        System.assert(accessKeys4.equals(accessKeys3));
        System.assert(accessKeys3.equals(accessKeys3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAccessKeys accessKeys1 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys2 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys3 = new OASAccessKeys();
        OASAccessKeys accessKeys4 = new OASAccessKeys();

        System.assert(accessKeys1.equals(accessKeys2));
        System.assert(accessKeys2.equals(accessKeys1));
        System.assert(accessKeys3.equals(accessKeys4));
        System.assert(accessKeys4.equals(accessKeys3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAccessKeys accessKeys1 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys2 = new OASAccessKeys();

        System.assertEquals(false, accessKeys1.equals('foo'));
        System.assertEquals(false, accessKeys2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAccessKeys accessKeys1 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys2 = new OASAccessKeys();
        OASAccessKeys accessKeys3;

        System.assertEquals(false, accessKeys1.equals(accessKeys3));
        System.assertEquals(false, accessKeys2.equals(accessKeys3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAccessKeys accessKeys1 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys2 = new OASAccessKeys();

        System.assertEquals(accessKeys1.hashCode(), accessKeys1.hashCode());
        System.assertEquals(accessKeys2.hashCode(), accessKeys2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAccessKeys accessKeys1 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys2 = OASAccessKeys.getExample();
        OASAccessKeys accessKeys3 = new OASAccessKeys();
        OASAccessKeys accessKeys4 = new OASAccessKeys();

        System.assert(accessKeys1.equals(accessKeys2));
        System.assert(accessKeys3.equals(accessKeys4));
        System.assertEquals(accessKeys1.hashCode(), accessKeys2.hashCode());
        System.assertEquals(accessKeys3.hashCode(), accessKeys4.hashCode());
    }
}
