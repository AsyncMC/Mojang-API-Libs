@isTest
private class OASOrderStatisticsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderStatisticsRequest orderStatisticsRequest1 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest2 = orderStatisticsRequest1;
        OASOrderStatisticsRequest orderStatisticsRequest3 = new OASOrderStatisticsRequest();
        OASOrderStatisticsRequest orderStatisticsRequest4 = orderStatisticsRequest3;

        System.assert(orderStatisticsRequest1.equals(orderStatisticsRequest2));
        System.assert(orderStatisticsRequest2.equals(orderStatisticsRequest1));
        System.assert(orderStatisticsRequest1.equals(orderStatisticsRequest1));
        System.assert(orderStatisticsRequest3.equals(orderStatisticsRequest4));
        System.assert(orderStatisticsRequest4.equals(orderStatisticsRequest3));
        System.assert(orderStatisticsRequest3.equals(orderStatisticsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderStatisticsRequest orderStatisticsRequest1 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest2 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest3 = new OASOrderStatisticsRequest();
        OASOrderStatisticsRequest orderStatisticsRequest4 = new OASOrderStatisticsRequest();

        System.assert(orderStatisticsRequest1.equals(orderStatisticsRequest2));
        System.assert(orderStatisticsRequest2.equals(orderStatisticsRequest1));
        System.assert(orderStatisticsRequest3.equals(orderStatisticsRequest4));
        System.assert(orderStatisticsRequest4.equals(orderStatisticsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderStatisticsRequest orderStatisticsRequest1 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest2 = new OASOrderStatisticsRequest();

        System.assertEquals(false, orderStatisticsRequest1.equals('foo'));
        System.assertEquals(false, orderStatisticsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderStatisticsRequest orderStatisticsRequest1 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest2 = new OASOrderStatisticsRequest();
        OASOrderStatisticsRequest orderStatisticsRequest3;

        System.assertEquals(false, orderStatisticsRequest1.equals(orderStatisticsRequest3));
        System.assertEquals(false, orderStatisticsRequest2.equals(orderStatisticsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderStatisticsRequest orderStatisticsRequest1 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest2 = new OASOrderStatisticsRequest();

        System.assertEquals(orderStatisticsRequest1.hashCode(), orderStatisticsRequest1.hashCode());
        System.assertEquals(orderStatisticsRequest2.hashCode(), orderStatisticsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderStatisticsRequest orderStatisticsRequest1 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest2 = OASOrderStatisticsRequest.getExample();
        OASOrderStatisticsRequest orderStatisticsRequest3 = new OASOrderStatisticsRequest();
        OASOrderStatisticsRequest orderStatisticsRequest4 = new OASOrderStatisticsRequest();

        System.assert(orderStatisticsRequest1.equals(orderStatisticsRequest2));
        System.assert(orderStatisticsRequest3.equals(orderStatisticsRequest4));
        System.assertEquals(orderStatisticsRequest1.hashCode(), orderStatisticsRequest2.hashCode());
        System.assertEquals(orderStatisticsRequest3.hashCode(), orderStatisticsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderStatisticsRequest orderStatisticsRequest = new OASOrderStatisticsRequest();
        System.assertEquals(new List<OASOrderStatistic>(), orderStatisticsRequest.metricKeys);
    }
}
