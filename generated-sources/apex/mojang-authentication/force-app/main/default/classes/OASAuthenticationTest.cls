@isTest
private class OASAuthenticationTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuthentication authentication1 = OASAuthentication.getExample();
        OASAuthentication authentication2 = authentication1;
        OASAuthentication authentication3 = new OASAuthentication();
        OASAuthentication authentication4 = authentication3;

        System.assert(authentication1.equals(authentication2));
        System.assert(authentication2.equals(authentication1));
        System.assert(authentication1.equals(authentication1));
        System.assert(authentication3.equals(authentication4));
        System.assert(authentication4.equals(authentication3));
        System.assert(authentication3.equals(authentication3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuthentication authentication1 = OASAuthentication.getExample();
        OASAuthentication authentication2 = OASAuthentication.getExample();
        OASAuthentication authentication3 = new OASAuthentication();
        OASAuthentication authentication4 = new OASAuthentication();

        System.assert(authentication1.equals(authentication2));
        System.assert(authentication2.equals(authentication1));
        System.assert(authentication3.equals(authentication4));
        System.assert(authentication4.equals(authentication3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuthentication authentication1 = OASAuthentication.getExample();
        OASAuthentication authentication2 = new OASAuthentication();

        System.assertEquals(false, authentication1.equals('foo'));
        System.assertEquals(false, authentication2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuthentication authentication1 = OASAuthentication.getExample();
        OASAuthentication authentication2 = new OASAuthentication();
        OASAuthentication authentication3;

        System.assertEquals(false, authentication1.equals(authentication3));
        System.assertEquals(false, authentication2.equals(authentication3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuthentication authentication1 = OASAuthentication.getExample();
        OASAuthentication authentication2 = new OASAuthentication();

        System.assertEquals(authentication1.hashCode(), authentication1.hashCode());
        System.assertEquals(authentication2.hashCode(), authentication2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuthentication authentication1 = OASAuthentication.getExample();
        OASAuthentication authentication2 = OASAuthentication.getExample();
        OASAuthentication authentication3 = new OASAuthentication();
        OASAuthentication authentication4 = new OASAuthentication();

        System.assert(authentication1.equals(authentication2));
        System.assert(authentication3.equals(authentication4));
        System.assertEquals(authentication1.hashCode(), authentication2.hashCode());
        System.assertEquals(authentication3.hashCode(), authentication4.hashCode());
    }
}
