@isTest
private class OASGameProfileTest {
    @isTest
    private static void equalsSameInstance() {
        OASGameProfile gameProfile1 = OASGameProfile.getExample();
        OASGameProfile gameProfile2 = gameProfile1;
        OASGameProfile gameProfile3 = new OASGameProfile();
        OASGameProfile gameProfile4 = gameProfile3;

        System.assert(gameProfile1.equals(gameProfile2));
        System.assert(gameProfile2.equals(gameProfile1));
        System.assert(gameProfile1.equals(gameProfile1));
        System.assert(gameProfile3.equals(gameProfile4));
        System.assert(gameProfile4.equals(gameProfile3));
        System.assert(gameProfile3.equals(gameProfile3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGameProfile gameProfile1 = OASGameProfile.getExample();
        OASGameProfile gameProfile2 = OASGameProfile.getExample();
        OASGameProfile gameProfile3 = new OASGameProfile();
        OASGameProfile gameProfile4 = new OASGameProfile();

        System.assert(gameProfile1.equals(gameProfile2));
        System.assert(gameProfile2.equals(gameProfile1));
        System.assert(gameProfile3.equals(gameProfile4));
        System.assert(gameProfile4.equals(gameProfile3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGameProfile gameProfile1 = OASGameProfile.getExample();
        OASGameProfile gameProfile2 = new OASGameProfile();

        System.assertEquals(false, gameProfile1.equals('foo'));
        System.assertEquals(false, gameProfile2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGameProfile gameProfile1 = OASGameProfile.getExample();
        OASGameProfile gameProfile2 = new OASGameProfile();
        OASGameProfile gameProfile3;

        System.assertEquals(false, gameProfile1.equals(gameProfile3));
        System.assertEquals(false, gameProfile2.equals(gameProfile3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGameProfile gameProfile1 = OASGameProfile.getExample();
        OASGameProfile gameProfile2 = new OASGameProfile();

        System.assertEquals(gameProfile1.hashCode(), gameProfile1.hashCode());
        System.assertEquals(gameProfile2.hashCode(), gameProfile2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGameProfile gameProfile1 = OASGameProfile.getExample();
        OASGameProfile gameProfile2 = OASGameProfile.getExample();
        OASGameProfile gameProfile3 = new OASGameProfile();
        OASGameProfile gameProfile4 = new OASGameProfile();

        System.assert(gameProfile1.equals(gameProfile2));
        System.assert(gameProfile3.equals(gameProfile4));
        System.assertEquals(gameProfile1.hashCode(), gameProfile2.hashCode());
        System.assertEquals(gameProfile3.hashCode(), gameProfile4.hashCode());
    }
}
