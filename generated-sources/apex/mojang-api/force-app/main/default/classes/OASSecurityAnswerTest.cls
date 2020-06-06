@isTest
private class OASSecurityAnswerTest {
    @isTest
    private static void equalsSameInstance() {
        OASSecurityAnswer securityAnswer1 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer2 = securityAnswer1;
        OASSecurityAnswer securityAnswer3 = new OASSecurityAnswer();
        OASSecurityAnswer securityAnswer4 = securityAnswer3;

        System.assert(securityAnswer1.equals(securityAnswer2));
        System.assert(securityAnswer2.equals(securityAnswer1));
        System.assert(securityAnswer1.equals(securityAnswer1));
        System.assert(securityAnswer3.equals(securityAnswer4));
        System.assert(securityAnswer4.equals(securityAnswer3));
        System.assert(securityAnswer3.equals(securityAnswer3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSecurityAnswer securityAnswer1 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer2 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer3 = new OASSecurityAnswer();
        OASSecurityAnswer securityAnswer4 = new OASSecurityAnswer();

        System.assert(securityAnswer1.equals(securityAnswer2));
        System.assert(securityAnswer2.equals(securityAnswer1));
        System.assert(securityAnswer3.equals(securityAnswer4));
        System.assert(securityAnswer4.equals(securityAnswer3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSecurityAnswer securityAnswer1 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer2 = new OASSecurityAnswer();

        System.assertEquals(false, securityAnswer1.equals('foo'));
        System.assertEquals(false, securityAnswer2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSecurityAnswer securityAnswer1 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer2 = new OASSecurityAnswer();
        OASSecurityAnswer securityAnswer3;

        System.assertEquals(false, securityAnswer1.equals(securityAnswer3));
        System.assertEquals(false, securityAnswer2.equals(securityAnswer3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSecurityAnswer securityAnswer1 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer2 = new OASSecurityAnswer();

        System.assertEquals(securityAnswer1.hashCode(), securityAnswer1.hashCode());
        System.assertEquals(securityAnswer2.hashCode(), securityAnswer2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSecurityAnswer securityAnswer1 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer2 = OASSecurityAnswer.getExample();
        OASSecurityAnswer securityAnswer3 = new OASSecurityAnswer();
        OASSecurityAnswer securityAnswer4 = new OASSecurityAnswer();

        System.assert(securityAnswer1.equals(securityAnswer2));
        System.assert(securityAnswer3.equals(securityAnswer4));
        System.assertEquals(securityAnswer1.hashCode(), securityAnswer2.hashCode());
        System.assertEquals(securityAnswer3.hashCode(), securityAnswer4.hashCode());
    }
}
