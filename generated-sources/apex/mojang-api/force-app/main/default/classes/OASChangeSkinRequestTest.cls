@isTest
private class OASChangeSkinRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASChangeSkinRequest changeSkinRequest1 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest2 = changeSkinRequest1;
        OASChangeSkinRequest changeSkinRequest3 = new OASChangeSkinRequest();
        OASChangeSkinRequest changeSkinRequest4 = changeSkinRequest3;

        System.assert(changeSkinRequest1.equals(changeSkinRequest2));
        System.assert(changeSkinRequest2.equals(changeSkinRequest1));
        System.assert(changeSkinRequest1.equals(changeSkinRequest1));
        System.assert(changeSkinRequest3.equals(changeSkinRequest4));
        System.assert(changeSkinRequest4.equals(changeSkinRequest3));
        System.assert(changeSkinRequest3.equals(changeSkinRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChangeSkinRequest changeSkinRequest1 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest2 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest3 = new OASChangeSkinRequest();
        OASChangeSkinRequest changeSkinRequest4 = new OASChangeSkinRequest();

        System.assert(changeSkinRequest1.equals(changeSkinRequest2));
        System.assert(changeSkinRequest2.equals(changeSkinRequest1));
        System.assert(changeSkinRequest3.equals(changeSkinRequest4));
        System.assert(changeSkinRequest4.equals(changeSkinRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChangeSkinRequest changeSkinRequest1 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest2 = new OASChangeSkinRequest();

        System.assertEquals(false, changeSkinRequest1.equals('foo'));
        System.assertEquals(false, changeSkinRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChangeSkinRequest changeSkinRequest1 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest2 = new OASChangeSkinRequest();
        OASChangeSkinRequest changeSkinRequest3;

        System.assertEquals(false, changeSkinRequest1.equals(changeSkinRequest3));
        System.assertEquals(false, changeSkinRequest2.equals(changeSkinRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChangeSkinRequest changeSkinRequest1 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest2 = new OASChangeSkinRequest();

        System.assertEquals(changeSkinRequest1.hashCode(), changeSkinRequest1.hashCode());
        System.assertEquals(changeSkinRequest2.hashCode(), changeSkinRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChangeSkinRequest changeSkinRequest1 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest2 = OASChangeSkinRequest.getExample();
        OASChangeSkinRequest changeSkinRequest3 = new OASChangeSkinRequest();
        OASChangeSkinRequest changeSkinRequest4 = new OASChangeSkinRequest();

        System.assert(changeSkinRequest1.equals(changeSkinRequest2));
        System.assert(changeSkinRequest3.equals(changeSkinRequest4));
        System.assertEquals(changeSkinRequest1.hashCode(), changeSkinRequest2.hashCode());
        System.assertEquals(changeSkinRequest3.hashCode(), changeSkinRequest4.hashCode());
    }
}
