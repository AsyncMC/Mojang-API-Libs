@isTest
private class OASOrderStatisticsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderStatisticsResponse orderStatisticsResponse1 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse2 = orderStatisticsResponse1;
        OASOrderStatisticsResponse orderStatisticsResponse3 = new OASOrderStatisticsResponse();
        OASOrderStatisticsResponse orderStatisticsResponse4 = orderStatisticsResponse3;

        System.assert(orderStatisticsResponse1.equals(orderStatisticsResponse2));
        System.assert(orderStatisticsResponse2.equals(orderStatisticsResponse1));
        System.assert(orderStatisticsResponse1.equals(orderStatisticsResponse1));
        System.assert(orderStatisticsResponse3.equals(orderStatisticsResponse4));
        System.assert(orderStatisticsResponse4.equals(orderStatisticsResponse3));
        System.assert(orderStatisticsResponse3.equals(orderStatisticsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderStatisticsResponse orderStatisticsResponse1 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse2 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse3 = new OASOrderStatisticsResponse();
        OASOrderStatisticsResponse orderStatisticsResponse4 = new OASOrderStatisticsResponse();

        System.assert(orderStatisticsResponse1.equals(orderStatisticsResponse2));
        System.assert(orderStatisticsResponse2.equals(orderStatisticsResponse1));
        System.assert(orderStatisticsResponse3.equals(orderStatisticsResponse4));
        System.assert(orderStatisticsResponse4.equals(orderStatisticsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderStatisticsResponse orderStatisticsResponse1 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse2 = new OASOrderStatisticsResponse();

        System.assertEquals(false, orderStatisticsResponse1.equals('foo'));
        System.assertEquals(false, orderStatisticsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderStatisticsResponse orderStatisticsResponse1 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse2 = new OASOrderStatisticsResponse();
        OASOrderStatisticsResponse orderStatisticsResponse3;

        System.assertEquals(false, orderStatisticsResponse1.equals(orderStatisticsResponse3));
        System.assertEquals(false, orderStatisticsResponse2.equals(orderStatisticsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderStatisticsResponse orderStatisticsResponse1 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse2 = new OASOrderStatisticsResponse();

        System.assertEquals(orderStatisticsResponse1.hashCode(), orderStatisticsResponse1.hashCode());
        System.assertEquals(orderStatisticsResponse2.hashCode(), orderStatisticsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderStatisticsResponse orderStatisticsResponse1 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse2 = OASOrderStatisticsResponse.getExample();
        OASOrderStatisticsResponse orderStatisticsResponse3 = new OASOrderStatisticsResponse();
        OASOrderStatisticsResponse orderStatisticsResponse4 = new OASOrderStatisticsResponse();

        System.assert(orderStatisticsResponse1.equals(orderStatisticsResponse2));
        System.assert(orderStatisticsResponse3.equals(orderStatisticsResponse4));
        System.assertEquals(orderStatisticsResponse1.hashCode(), orderStatisticsResponse2.hashCode());
        System.assertEquals(orderStatisticsResponse3.hashCode(), orderStatisticsResponse4.hashCode());
    }
}
