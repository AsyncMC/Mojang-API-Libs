@isTest
private class OASPlayerTextureURLTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlayerTextureURL playerTextureURL1 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL2 = playerTextureURL1;
        OASPlayerTextureURL playerTextureURL3 = new OASPlayerTextureURL();
        OASPlayerTextureURL playerTextureURL4 = playerTextureURL3;

        System.assert(playerTextureURL1.equals(playerTextureURL2));
        System.assert(playerTextureURL2.equals(playerTextureURL1));
        System.assert(playerTextureURL1.equals(playerTextureURL1));
        System.assert(playerTextureURL3.equals(playerTextureURL4));
        System.assert(playerTextureURL4.equals(playerTextureURL3));
        System.assert(playerTextureURL3.equals(playerTextureURL3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlayerTextureURL playerTextureURL1 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL2 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL3 = new OASPlayerTextureURL();
        OASPlayerTextureURL playerTextureURL4 = new OASPlayerTextureURL();

        System.assert(playerTextureURL1.equals(playerTextureURL2));
        System.assert(playerTextureURL2.equals(playerTextureURL1));
        System.assert(playerTextureURL3.equals(playerTextureURL4));
        System.assert(playerTextureURL4.equals(playerTextureURL3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlayerTextureURL playerTextureURL1 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL2 = new OASPlayerTextureURL();

        System.assertEquals(false, playerTextureURL1.equals('foo'));
        System.assertEquals(false, playerTextureURL2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlayerTextureURL playerTextureURL1 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL2 = new OASPlayerTextureURL();
        OASPlayerTextureURL playerTextureURL3;

        System.assertEquals(false, playerTextureURL1.equals(playerTextureURL3));
        System.assertEquals(false, playerTextureURL2.equals(playerTextureURL3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlayerTextureURL playerTextureURL1 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL2 = new OASPlayerTextureURL();

        System.assertEquals(playerTextureURL1.hashCode(), playerTextureURL1.hashCode());
        System.assertEquals(playerTextureURL2.hashCode(), playerTextureURL2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlayerTextureURL playerTextureURL1 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL2 = OASPlayerTextureURL.getExample();
        OASPlayerTextureURL playerTextureURL3 = new OASPlayerTextureURL();
        OASPlayerTextureURL playerTextureURL4 = new OASPlayerTextureURL();

        System.assert(playerTextureURL1.equals(playerTextureURL2));
        System.assert(playerTextureURL3.equals(playerTextureURL4));
        System.assertEquals(playerTextureURL1.hashCode(), playerTextureURL2.hashCode());
        System.assertEquals(playerTextureURL3.hashCode(), playerTextureURL4.hashCode());
    }
}
