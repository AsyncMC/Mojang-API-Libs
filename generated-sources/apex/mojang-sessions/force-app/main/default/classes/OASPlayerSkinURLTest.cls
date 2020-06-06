@isTest
private class OASPlayerSkinURLTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlayerSkinURL playerSkinURL1 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL2 = playerSkinURL1;
        OASPlayerSkinURL playerSkinURL3 = new OASPlayerSkinURL();
        OASPlayerSkinURL playerSkinURL4 = playerSkinURL3;

        System.assert(playerSkinURL1.equals(playerSkinURL2));
        System.assert(playerSkinURL2.equals(playerSkinURL1));
        System.assert(playerSkinURL1.equals(playerSkinURL1));
        System.assert(playerSkinURL3.equals(playerSkinURL4));
        System.assert(playerSkinURL4.equals(playerSkinURL3));
        System.assert(playerSkinURL3.equals(playerSkinURL3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlayerSkinURL playerSkinURL1 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL2 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL3 = new OASPlayerSkinURL();
        OASPlayerSkinURL playerSkinURL4 = new OASPlayerSkinURL();

        System.assert(playerSkinURL1.equals(playerSkinURL2));
        System.assert(playerSkinURL2.equals(playerSkinURL1));
        System.assert(playerSkinURL3.equals(playerSkinURL4));
        System.assert(playerSkinURL4.equals(playerSkinURL3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlayerSkinURL playerSkinURL1 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL2 = new OASPlayerSkinURL();

        System.assertEquals(false, playerSkinURL1.equals('foo'));
        System.assertEquals(false, playerSkinURL2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlayerSkinURL playerSkinURL1 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL2 = new OASPlayerSkinURL();
        OASPlayerSkinURL playerSkinURL3;

        System.assertEquals(false, playerSkinURL1.equals(playerSkinURL3));
        System.assertEquals(false, playerSkinURL2.equals(playerSkinURL3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlayerSkinURL playerSkinURL1 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL2 = new OASPlayerSkinURL();

        System.assertEquals(playerSkinURL1.hashCode(), playerSkinURL1.hashCode());
        System.assertEquals(playerSkinURL2.hashCode(), playerSkinURL2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlayerSkinURL playerSkinURL1 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL2 = OASPlayerSkinURL.getExample();
        OASPlayerSkinURL playerSkinURL3 = new OASPlayerSkinURL();
        OASPlayerSkinURL playerSkinURL4 = new OASPlayerSkinURL();

        System.assert(playerSkinURL1.equals(playerSkinURL2));
        System.assert(playerSkinURL3.equals(playerSkinURL4));
        System.assertEquals(playerSkinURL1.hashCode(), playerSkinURL2.hashCode());
        System.assertEquals(playerSkinURL3.hashCode(), playerSkinURL4.hashCode());
    }
}
