@isTest
private class OASPlayerProfileTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlayerProfile playerProfile1 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile2 = playerProfile1;
        OASPlayerProfile playerProfile3 = new OASPlayerProfile();
        OASPlayerProfile playerProfile4 = playerProfile3;

        System.assert(playerProfile1.equals(playerProfile2));
        System.assert(playerProfile2.equals(playerProfile1));
        System.assert(playerProfile1.equals(playerProfile1));
        System.assert(playerProfile3.equals(playerProfile4));
        System.assert(playerProfile4.equals(playerProfile3));
        System.assert(playerProfile3.equals(playerProfile3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlayerProfile playerProfile1 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile2 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile3 = new OASPlayerProfile();
        OASPlayerProfile playerProfile4 = new OASPlayerProfile();

        System.assert(playerProfile1.equals(playerProfile2));
        System.assert(playerProfile2.equals(playerProfile1));
        System.assert(playerProfile3.equals(playerProfile4));
        System.assert(playerProfile4.equals(playerProfile3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlayerProfile playerProfile1 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile2 = new OASPlayerProfile();

        System.assertEquals(false, playerProfile1.equals('foo'));
        System.assertEquals(false, playerProfile2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlayerProfile playerProfile1 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile2 = new OASPlayerProfile();
        OASPlayerProfile playerProfile3;

        System.assertEquals(false, playerProfile1.equals(playerProfile3));
        System.assertEquals(false, playerProfile2.equals(playerProfile3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlayerProfile playerProfile1 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile2 = new OASPlayerProfile();

        System.assertEquals(playerProfile1.hashCode(), playerProfile1.hashCode());
        System.assertEquals(playerProfile2.hashCode(), playerProfile2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlayerProfile playerProfile1 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile2 = OASPlayerProfile.getExample();
        OASPlayerProfile playerProfile3 = new OASPlayerProfile();
        OASPlayerProfile playerProfile4 = new OASPlayerProfile();

        System.assert(playerProfile1.equals(playerProfile2));
        System.assert(playerProfile3.equals(playerProfile4));
        System.assertEquals(playerProfile1.hashCode(), playerProfile2.hashCode());
        System.assertEquals(playerProfile3.hashCode(), playerProfile4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPlayerProfile playerProfile = new OASPlayerProfile();
        System.assertEquals(false, playerProfile.legacy);
        System.assertEquals(new List<OASPlayerProfileProperty>(), playerProfile.properties);
        System.assertEquals(null, playerProfile.id);
        System.assertEquals(null, playerProfile.name);
    }
}
