@isTest
private class OASProfileIdTest {
    @isTest
    private static void equalsSameInstance() {
        OASProfileId profileId1 = OASProfileId.getExample();
        OASProfileId profileId2 = profileId1;
        OASProfileId profileId3 = new OASProfileId();
        OASProfileId profileId4 = profileId3;

        System.assert(profileId1.equals(profileId2));
        System.assert(profileId2.equals(profileId1));
        System.assert(profileId1.equals(profileId1));
        System.assert(profileId3.equals(profileId4));
        System.assert(profileId4.equals(profileId3));
        System.assert(profileId3.equals(profileId3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProfileId profileId1 = OASProfileId.getExample();
        OASProfileId profileId2 = OASProfileId.getExample();
        OASProfileId profileId3 = new OASProfileId();
        OASProfileId profileId4 = new OASProfileId();

        System.assert(profileId1.equals(profileId2));
        System.assert(profileId2.equals(profileId1));
        System.assert(profileId3.equals(profileId4));
        System.assert(profileId4.equals(profileId3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProfileId profileId1 = OASProfileId.getExample();
        OASProfileId profileId2 = new OASProfileId();

        System.assertEquals(false, profileId1.equals('foo'));
        System.assertEquals(false, profileId2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProfileId profileId1 = OASProfileId.getExample();
        OASProfileId profileId2 = new OASProfileId();
        OASProfileId profileId3;

        System.assertEquals(false, profileId1.equals(profileId3));
        System.assertEquals(false, profileId2.equals(profileId3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProfileId profileId1 = OASProfileId.getExample();
        OASProfileId profileId2 = new OASProfileId();

        System.assertEquals(profileId1.hashCode(), profileId1.hashCode());
        System.assertEquals(profileId2.hashCode(), profileId2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProfileId profileId1 = OASProfileId.getExample();
        OASProfileId profileId2 = OASProfileId.getExample();
        OASProfileId profileId3 = new OASProfileId();
        OASProfileId profileId4 = new OASProfileId();

        System.assert(profileId1.equals(profileId2));
        System.assert(profileId3.equals(profileId4));
        System.assertEquals(profileId1.hashCode(), profileId2.hashCode());
        System.assertEquals(profileId3.hashCode(), profileId4.hashCode());
    }
}
