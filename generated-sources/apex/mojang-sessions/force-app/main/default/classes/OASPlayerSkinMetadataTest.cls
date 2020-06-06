@isTest
private class OASPlayerSkinMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlayerSkinMetadata playerSkinMetadata1 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata2 = playerSkinMetadata1;
        OASPlayerSkinMetadata playerSkinMetadata3 = new OASPlayerSkinMetadata();
        OASPlayerSkinMetadata playerSkinMetadata4 = playerSkinMetadata3;

        System.assert(playerSkinMetadata1.equals(playerSkinMetadata2));
        System.assert(playerSkinMetadata2.equals(playerSkinMetadata1));
        System.assert(playerSkinMetadata1.equals(playerSkinMetadata1));
        System.assert(playerSkinMetadata3.equals(playerSkinMetadata4));
        System.assert(playerSkinMetadata4.equals(playerSkinMetadata3));
        System.assert(playerSkinMetadata3.equals(playerSkinMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlayerSkinMetadata playerSkinMetadata1 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata2 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata3 = new OASPlayerSkinMetadata();
        OASPlayerSkinMetadata playerSkinMetadata4 = new OASPlayerSkinMetadata();

        System.assert(playerSkinMetadata1.equals(playerSkinMetadata2));
        System.assert(playerSkinMetadata2.equals(playerSkinMetadata1));
        System.assert(playerSkinMetadata3.equals(playerSkinMetadata4));
        System.assert(playerSkinMetadata4.equals(playerSkinMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlayerSkinMetadata playerSkinMetadata1 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata2 = new OASPlayerSkinMetadata();

        System.assertEquals(false, playerSkinMetadata1.equals('foo'));
        System.assertEquals(false, playerSkinMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlayerSkinMetadata playerSkinMetadata1 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata2 = new OASPlayerSkinMetadata();
        OASPlayerSkinMetadata playerSkinMetadata3;

        System.assertEquals(false, playerSkinMetadata1.equals(playerSkinMetadata3));
        System.assertEquals(false, playerSkinMetadata2.equals(playerSkinMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlayerSkinMetadata playerSkinMetadata1 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata2 = new OASPlayerSkinMetadata();

        System.assertEquals(playerSkinMetadata1.hashCode(), playerSkinMetadata1.hashCode());
        System.assertEquals(playerSkinMetadata2.hashCode(), playerSkinMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlayerSkinMetadata playerSkinMetadata1 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata2 = OASPlayerSkinMetadata.getExample();
        OASPlayerSkinMetadata playerSkinMetadata3 = new OASPlayerSkinMetadata();
        OASPlayerSkinMetadata playerSkinMetadata4 = new OASPlayerSkinMetadata();

        System.assert(playerSkinMetadata1.equals(playerSkinMetadata2));
        System.assert(playerSkinMetadata3.equals(playerSkinMetadata4));
        System.assertEquals(playerSkinMetadata1.hashCode(), playerSkinMetadata2.hashCode());
        System.assertEquals(playerSkinMetadata3.hashCode(), playerSkinMetadata4.hashCode());
    }
}
