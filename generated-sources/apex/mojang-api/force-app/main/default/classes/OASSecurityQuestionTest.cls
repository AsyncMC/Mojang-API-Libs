@isTest
private class OASSecurityQuestionTest {
    @isTest
    private static void equalsSameInstance() {
        OASSecurityQuestion securityQuestion1 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion2 = securityQuestion1;
        OASSecurityQuestion securityQuestion3 = new OASSecurityQuestion();
        OASSecurityQuestion securityQuestion4 = securityQuestion3;

        System.assert(securityQuestion1.equals(securityQuestion2));
        System.assert(securityQuestion2.equals(securityQuestion1));
        System.assert(securityQuestion1.equals(securityQuestion1));
        System.assert(securityQuestion3.equals(securityQuestion4));
        System.assert(securityQuestion4.equals(securityQuestion3));
        System.assert(securityQuestion3.equals(securityQuestion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSecurityQuestion securityQuestion1 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion2 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion3 = new OASSecurityQuestion();
        OASSecurityQuestion securityQuestion4 = new OASSecurityQuestion();

        System.assert(securityQuestion1.equals(securityQuestion2));
        System.assert(securityQuestion2.equals(securityQuestion1));
        System.assert(securityQuestion3.equals(securityQuestion4));
        System.assert(securityQuestion4.equals(securityQuestion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSecurityQuestion securityQuestion1 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion2 = new OASSecurityQuestion();

        System.assertEquals(false, securityQuestion1.equals('foo'));
        System.assertEquals(false, securityQuestion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSecurityQuestion securityQuestion1 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion2 = new OASSecurityQuestion();
        OASSecurityQuestion securityQuestion3;

        System.assertEquals(false, securityQuestion1.equals(securityQuestion3));
        System.assertEquals(false, securityQuestion2.equals(securityQuestion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSecurityQuestion securityQuestion1 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion2 = new OASSecurityQuestion();

        System.assertEquals(securityQuestion1.hashCode(), securityQuestion1.hashCode());
        System.assertEquals(securityQuestion2.hashCode(), securityQuestion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSecurityQuestion securityQuestion1 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion2 = OASSecurityQuestion.getExample();
        OASSecurityQuestion securityQuestion3 = new OASSecurityQuestion();
        OASSecurityQuestion securityQuestion4 = new OASSecurityQuestion();

        System.assert(securityQuestion1.equals(securityQuestion2));
        System.assert(securityQuestion3.equals(securityQuestion4));
        System.assertEquals(securityQuestion1.hashCode(), securityQuestion2.hashCode());
        System.assertEquals(securityQuestion3.hashCode(), securityQuestion4.hashCode());
    }
}
