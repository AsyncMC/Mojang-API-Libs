@isTest
private class OASSessionApiErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASSessionApiError sessionApiError1 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError2 = sessionApiError1;
        OASSessionApiError sessionApiError3 = new OASSessionApiError();
        OASSessionApiError sessionApiError4 = sessionApiError3;

        System.assert(sessionApiError1.equals(sessionApiError2));
        System.assert(sessionApiError2.equals(sessionApiError1));
        System.assert(sessionApiError1.equals(sessionApiError1));
        System.assert(sessionApiError3.equals(sessionApiError4));
        System.assert(sessionApiError4.equals(sessionApiError3));
        System.assert(sessionApiError3.equals(sessionApiError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSessionApiError sessionApiError1 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError2 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError3 = new OASSessionApiError();
        OASSessionApiError sessionApiError4 = new OASSessionApiError();

        System.assert(sessionApiError1.equals(sessionApiError2));
        System.assert(sessionApiError2.equals(sessionApiError1));
        System.assert(sessionApiError3.equals(sessionApiError4));
        System.assert(sessionApiError4.equals(sessionApiError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSessionApiError sessionApiError1 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError2 = new OASSessionApiError();

        System.assertEquals(false, sessionApiError1.equals('foo'));
        System.assertEquals(false, sessionApiError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSessionApiError sessionApiError1 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError2 = new OASSessionApiError();
        OASSessionApiError sessionApiError3;

        System.assertEquals(false, sessionApiError1.equals(sessionApiError3));
        System.assertEquals(false, sessionApiError2.equals(sessionApiError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSessionApiError sessionApiError1 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError2 = new OASSessionApiError();

        System.assertEquals(sessionApiError1.hashCode(), sessionApiError1.hashCode());
        System.assertEquals(sessionApiError2.hashCode(), sessionApiError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSessionApiError sessionApiError1 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError2 = OASSessionApiError.getExample();
        OASSessionApiError sessionApiError3 = new OASSessionApiError();
        OASSessionApiError sessionApiError4 = new OASSessionApiError();

        System.assert(sessionApiError1.equals(sessionApiError2));
        System.assert(sessionApiError3.equals(sessionApiError4));
        System.assertEquals(sessionApiError1.hashCode(), sessionApiError2.hashCode());
        System.assertEquals(sessionApiError3.hashCode(), sessionApiError4.hashCode());
    }
}
