@isTest
private class OASSecurityAnswerIdTest {
    @isTest
    private static void equalsSameInstance() {
        OASSecurityAnswerId securityAnswerId1 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId2 = securityAnswerId1;
        OASSecurityAnswerId securityAnswerId3 = new OASSecurityAnswerId();
        OASSecurityAnswerId securityAnswerId4 = securityAnswerId3;

        System.assert(securityAnswerId1.equals(securityAnswerId2));
        System.assert(securityAnswerId2.equals(securityAnswerId1));
        System.assert(securityAnswerId1.equals(securityAnswerId1));
        System.assert(securityAnswerId3.equals(securityAnswerId4));
        System.assert(securityAnswerId4.equals(securityAnswerId3));
        System.assert(securityAnswerId3.equals(securityAnswerId3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSecurityAnswerId securityAnswerId1 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId2 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId3 = new OASSecurityAnswerId();
        OASSecurityAnswerId securityAnswerId4 = new OASSecurityAnswerId();

        System.assert(securityAnswerId1.equals(securityAnswerId2));
        System.assert(securityAnswerId2.equals(securityAnswerId1));
        System.assert(securityAnswerId3.equals(securityAnswerId4));
        System.assert(securityAnswerId4.equals(securityAnswerId3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSecurityAnswerId securityAnswerId1 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId2 = new OASSecurityAnswerId();

        System.assertEquals(false, securityAnswerId1.equals('foo'));
        System.assertEquals(false, securityAnswerId2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSecurityAnswerId securityAnswerId1 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId2 = new OASSecurityAnswerId();
        OASSecurityAnswerId securityAnswerId3;

        System.assertEquals(false, securityAnswerId1.equals(securityAnswerId3));
        System.assertEquals(false, securityAnswerId2.equals(securityAnswerId3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSecurityAnswerId securityAnswerId1 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId2 = new OASSecurityAnswerId();

        System.assertEquals(securityAnswerId1.hashCode(), securityAnswerId1.hashCode());
        System.assertEquals(securityAnswerId2.hashCode(), securityAnswerId2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSecurityAnswerId securityAnswerId1 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId2 = OASSecurityAnswerId.getExample();
        OASSecurityAnswerId securityAnswerId3 = new OASSecurityAnswerId();
        OASSecurityAnswerId securityAnswerId4 = new OASSecurityAnswerId();

        System.assert(securityAnswerId1.equals(securityAnswerId2));
        System.assert(securityAnswerId3.equals(securityAnswerId4));
        System.assertEquals(securityAnswerId1.hashCode(), securityAnswerId2.hashCode());
        System.assertEquals(securityAnswerId3.hashCode(), securityAnswerId4.hashCode());
    }
}
