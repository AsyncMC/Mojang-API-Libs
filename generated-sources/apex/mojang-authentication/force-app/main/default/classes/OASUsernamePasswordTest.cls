@isTest
private class OASUsernamePasswordTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsernamePassword usernamePassword1 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword2 = usernamePassword1;
        OASUsernamePassword usernamePassword3 = new OASUsernamePassword();
        OASUsernamePassword usernamePassword4 = usernamePassword3;

        System.assert(usernamePassword1.equals(usernamePassword2));
        System.assert(usernamePassword2.equals(usernamePassword1));
        System.assert(usernamePassword1.equals(usernamePassword1));
        System.assert(usernamePassword3.equals(usernamePassword4));
        System.assert(usernamePassword4.equals(usernamePassword3));
        System.assert(usernamePassword3.equals(usernamePassword3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsernamePassword usernamePassword1 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword2 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword3 = new OASUsernamePassword();
        OASUsernamePassword usernamePassword4 = new OASUsernamePassword();

        System.assert(usernamePassword1.equals(usernamePassword2));
        System.assert(usernamePassword2.equals(usernamePassword1));
        System.assert(usernamePassword3.equals(usernamePassword4));
        System.assert(usernamePassword4.equals(usernamePassword3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsernamePassword usernamePassword1 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword2 = new OASUsernamePassword();

        System.assertEquals(false, usernamePassword1.equals('foo'));
        System.assertEquals(false, usernamePassword2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsernamePassword usernamePassword1 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword2 = new OASUsernamePassword();
        OASUsernamePassword usernamePassword3;

        System.assertEquals(false, usernamePassword1.equals(usernamePassword3));
        System.assertEquals(false, usernamePassword2.equals(usernamePassword3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsernamePassword usernamePassword1 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword2 = new OASUsernamePassword();

        System.assertEquals(usernamePassword1.hashCode(), usernamePassword1.hashCode());
        System.assertEquals(usernamePassword2.hashCode(), usernamePassword2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsernamePassword usernamePassword1 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword2 = OASUsernamePassword.getExample();
        OASUsernamePassword usernamePassword3 = new OASUsernamePassword();
        OASUsernamePassword usernamePassword4 = new OASUsernamePassword();

        System.assert(usernamePassword1.equals(usernamePassword2));
        System.assert(usernamePassword3.equals(usernamePassword4));
        System.assertEquals(usernamePassword1.hashCode(), usernamePassword2.hashCode());
        System.assertEquals(usernamePassword3.hashCode(), usernamePassword4.hashCode());
    }
}
