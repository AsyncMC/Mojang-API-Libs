@isTest
private class OASRefreshRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASRefreshRequest refreshRequest1 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest2 = refreshRequest1;
        OASRefreshRequest refreshRequest3 = new OASRefreshRequest();
        OASRefreshRequest refreshRequest4 = refreshRequest3;

        System.assert(refreshRequest1.equals(refreshRequest2));
        System.assert(refreshRequest2.equals(refreshRequest1));
        System.assert(refreshRequest1.equals(refreshRequest1));
        System.assert(refreshRequest3.equals(refreshRequest4));
        System.assert(refreshRequest4.equals(refreshRequest3));
        System.assert(refreshRequest3.equals(refreshRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRefreshRequest refreshRequest1 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest2 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest3 = new OASRefreshRequest();
        OASRefreshRequest refreshRequest4 = new OASRefreshRequest();

        System.assert(refreshRequest1.equals(refreshRequest2));
        System.assert(refreshRequest2.equals(refreshRequest1));
        System.assert(refreshRequest3.equals(refreshRequest4));
        System.assert(refreshRequest4.equals(refreshRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRefreshRequest refreshRequest1 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest2 = new OASRefreshRequest();

        System.assertEquals(false, refreshRequest1.equals('foo'));
        System.assertEquals(false, refreshRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRefreshRequest refreshRequest1 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest2 = new OASRefreshRequest();
        OASRefreshRequest refreshRequest3;

        System.assertEquals(false, refreshRequest1.equals(refreshRequest3));
        System.assertEquals(false, refreshRequest2.equals(refreshRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRefreshRequest refreshRequest1 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest2 = new OASRefreshRequest();

        System.assertEquals(refreshRequest1.hashCode(), refreshRequest1.hashCode());
        System.assertEquals(refreshRequest2.hashCode(), refreshRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRefreshRequest refreshRequest1 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest2 = OASRefreshRequest.getExample();
        OASRefreshRequest refreshRequest3 = new OASRefreshRequest();
        OASRefreshRequest refreshRequest4 = new OASRefreshRequest();

        System.assert(refreshRequest1.equals(refreshRequest2));
        System.assert(refreshRequest3.equals(refreshRequest4));
        System.assertEquals(refreshRequest1.hashCode(), refreshRequest2.hashCode());
        System.assertEquals(refreshRequest3.hashCode(), refreshRequest4.hashCode());
    }
}
