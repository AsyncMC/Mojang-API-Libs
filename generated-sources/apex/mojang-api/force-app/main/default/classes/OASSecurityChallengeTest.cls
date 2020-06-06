@isTest
private class OASSecurityChallengeTest {
    @isTest
    private static void equalsSameInstance() {
        OASSecurityChallenge securityChallenge1 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge2 = securityChallenge1;
        OASSecurityChallenge securityChallenge3 = new OASSecurityChallenge();
        OASSecurityChallenge securityChallenge4 = securityChallenge3;

        System.assert(securityChallenge1.equals(securityChallenge2));
        System.assert(securityChallenge2.equals(securityChallenge1));
        System.assert(securityChallenge1.equals(securityChallenge1));
        System.assert(securityChallenge3.equals(securityChallenge4));
        System.assert(securityChallenge4.equals(securityChallenge3));
        System.assert(securityChallenge3.equals(securityChallenge3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSecurityChallenge securityChallenge1 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge2 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge3 = new OASSecurityChallenge();
        OASSecurityChallenge securityChallenge4 = new OASSecurityChallenge();

        System.assert(securityChallenge1.equals(securityChallenge2));
        System.assert(securityChallenge2.equals(securityChallenge1));
        System.assert(securityChallenge3.equals(securityChallenge4));
        System.assert(securityChallenge4.equals(securityChallenge3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSecurityChallenge securityChallenge1 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge2 = new OASSecurityChallenge();

        System.assertEquals(false, securityChallenge1.equals('foo'));
        System.assertEquals(false, securityChallenge2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSecurityChallenge securityChallenge1 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge2 = new OASSecurityChallenge();
        OASSecurityChallenge securityChallenge3;

        System.assertEquals(false, securityChallenge1.equals(securityChallenge3));
        System.assertEquals(false, securityChallenge2.equals(securityChallenge3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSecurityChallenge securityChallenge1 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge2 = new OASSecurityChallenge();

        System.assertEquals(securityChallenge1.hashCode(), securityChallenge1.hashCode());
        System.assertEquals(securityChallenge2.hashCode(), securityChallenge2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSecurityChallenge securityChallenge1 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge2 = OASSecurityChallenge.getExample();
        OASSecurityChallenge securityChallenge3 = new OASSecurityChallenge();
        OASSecurityChallenge securityChallenge4 = new OASSecurityChallenge();

        System.assert(securityChallenge1.equals(securityChallenge2));
        System.assert(securityChallenge3.equals(securityChallenge4));
        System.assertEquals(securityChallenge1.hashCode(), securityChallenge2.hashCode());
        System.assertEquals(securityChallenge3.hashCode(), securityChallenge4.hashCode());
    }
}
