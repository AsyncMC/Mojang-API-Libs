@isTest
private class OASPlayerTextureTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlayerTexture playerTexture1 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture2 = playerTexture1;
        OASPlayerTexture playerTexture3 = new OASPlayerTexture();
        OASPlayerTexture playerTexture4 = playerTexture3;

        System.assert(playerTexture1.equals(playerTexture2));
        System.assert(playerTexture2.equals(playerTexture1));
        System.assert(playerTexture1.equals(playerTexture1));
        System.assert(playerTexture3.equals(playerTexture4));
        System.assert(playerTexture4.equals(playerTexture3));
        System.assert(playerTexture3.equals(playerTexture3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlayerTexture playerTexture1 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture2 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture3 = new OASPlayerTexture();
        OASPlayerTexture playerTexture4 = new OASPlayerTexture();

        System.assert(playerTexture1.equals(playerTexture2));
        System.assert(playerTexture2.equals(playerTexture1));
        System.assert(playerTexture3.equals(playerTexture4));
        System.assert(playerTexture4.equals(playerTexture3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlayerTexture playerTexture1 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture2 = new OASPlayerTexture();

        System.assertEquals(false, playerTexture1.equals('foo'));
        System.assertEquals(false, playerTexture2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlayerTexture playerTexture1 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture2 = new OASPlayerTexture();
        OASPlayerTexture playerTexture3;

        System.assertEquals(false, playerTexture1.equals(playerTexture3));
        System.assertEquals(false, playerTexture2.equals(playerTexture3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlayerTexture playerTexture1 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture2 = new OASPlayerTexture();

        System.assertEquals(playerTexture1.hashCode(), playerTexture1.hashCode());
        System.assertEquals(playerTexture2.hashCode(), playerTexture2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlayerTexture playerTexture1 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture2 = OASPlayerTexture.getExample();
        OASPlayerTexture playerTexture3 = new OASPlayerTexture();
        OASPlayerTexture playerTexture4 = new OASPlayerTexture();

        System.assert(playerTexture1.equals(playerTexture2));
        System.assert(playerTexture3.equals(playerTexture4));
        System.assertEquals(playerTexture1.hashCode(), playerTexture2.hashCode());
        System.assertEquals(playerTexture3.hashCode(), playerTexture4.hashCode());
    }
}
