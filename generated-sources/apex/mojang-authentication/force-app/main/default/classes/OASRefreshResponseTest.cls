@isTest
private class OASRefreshResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASRefreshResponse refreshResponse1 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse2 = refreshResponse1;
        OASRefreshResponse refreshResponse3 = new OASRefreshResponse();
        OASRefreshResponse refreshResponse4 = refreshResponse3;

        System.assert(refreshResponse1.equals(refreshResponse2));
        System.assert(refreshResponse2.equals(refreshResponse1));
        System.assert(refreshResponse1.equals(refreshResponse1));
        System.assert(refreshResponse3.equals(refreshResponse4));
        System.assert(refreshResponse4.equals(refreshResponse3));
        System.assert(refreshResponse3.equals(refreshResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRefreshResponse refreshResponse1 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse2 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse3 = new OASRefreshResponse();
        OASRefreshResponse refreshResponse4 = new OASRefreshResponse();

        System.assert(refreshResponse1.equals(refreshResponse2));
        System.assert(refreshResponse2.equals(refreshResponse1));
        System.assert(refreshResponse3.equals(refreshResponse4));
        System.assert(refreshResponse4.equals(refreshResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRefreshResponse refreshResponse1 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse2 = new OASRefreshResponse();

        System.assertEquals(false, refreshResponse1.equals('foo'));
        System.assertEquals(false, refreshResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRefreshResponse refreshResponse1 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse2 = new OASRefreshResponse();
        OASRefreshResponse refreshResponse3;

        System.assertEquals(false, refreshResponse1.equals(refreshResponse3));
        System.assertEquals(false, refreshResponse2.equals(refreshResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRefreshResponse refreshResponse1 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse2 = new OASRefreshResponse();

        System.assertEquals(refreshResponse1.hashCode(), refreshResponse1.hashCode());
        System.assertEquals(refreshResponse2.hashCode(), refreshResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRefreshResponse refreshResponse1 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse2 = OASRefreshResponse.getExample();
        OASRefreshResponse refreshResponse3 = new OASRefreshResponse();
        OASRefreshResponse refreshResponse4 = new OASRefreshResponse();

        System.assert(refreshResponse1.equals(refreshResponse2));
        System.assert(refreshResponse3.equals(refreshResponse4));
        System.assertEquals(refreshResponse1.hashCode(), refreshResponse2.hashCode());
        System.assertEquals(refreshResponse3.hashCode(), refreshResponse4.hashCode());
    }
}
