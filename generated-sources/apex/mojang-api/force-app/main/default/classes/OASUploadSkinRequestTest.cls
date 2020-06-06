@isTest
private class OASUploadSkinRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUploadSkinRequest uploadSkinRequest1 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest2 = uploadSkinRequest1;
        OASUploadSkinRequest uploadSkinRequest3 = new OASUploadSkinRequest();
        OASUploadSkinRequest uploadSkinRequest4 = uploadSkinRequest3;

        System.assert(uploadSkinRequest1.equals(uploadSkinRequest2));
        System.assert(uploadSkinRequest2.equals(uploadSkinRequest1));
        System.assert(uploadSkinRequest1.equals(uploadSkinRequest1));
        System.assert(uploadSkinRequest3.equals(uploadSkinRequest4));
        System.assert(uploadSkinRequest4.equals(uploadSkinRequest3));
        System.assert(uploadSkinRequest3.equals(uploadSkinRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUploadSkinRequest uploadSkinRequest1 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest2 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest3 = new OASUploadSkinRequest();
        OASUploadSkinRequest uploadSkinRequest4 = new OASUploadSkinRequest();

        System.assert(uploadSkinRequest1.equals(uploadSkinRequest2));
        System.assert(uploadSkinRequest2.equals(uploadSkinRequest1));
        System.assert(uploadSkinRequest3.equals(uploadSkinRequest4));
        System.assert(uploadSkinRequest4.equals(uploadSkinRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUploadSkinRequest uploadSkinRequest1 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest2 = new OASUploadSkinRequest();

        System.assertEquals(false, uploadSkinRequest1.equals('foo'));
        System.assertEquals(false, uploadSkinRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUploadSkinRequest uploadSkinRequest1 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest2 = new OASUploadSkinRequest();
        OASUploadSkinRequest uploadSkinRequest3;

        System.assertEquals(false, uploadSkinRequest1.equals(uploadSkinRequest3));
        System.assertEquals(false, uploadSkinRequest2.equals(uploadSkinRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUploadSkinRequest uploadSkinRequest1 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest2 = new OASUploadSkinRequest();

        System.assertEquals(uploadSkinRequest1.hashCode(), uploadSkinRequest1.hashCode());
        System.assertEquals(uploadSkinRequest2.hashCode(), uploadSkinRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUploadSkinRequest uploadSkinRequest1 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest2 = OASUploadSkinRequest.getExample();
        OASUploadSkinRequest uploadSkinRequest3 = new OASUploadSkinRequest();
        OASUploadSkinRequest uploadSkinRequest4 = new OASUploadSkinRequest();

        System.assert(uploadSkinRequest1.equals(uploadSkinRequest2));
        System.assert(uploadSkinRequest3.equals(uploadSkinRequest4));
        System.assertEquals(uploadSkinRequest1.hashCode(), uploadSkinRequest2.hashCode());
        System.assertEquals(uploadSkinRequest3.hashCode(), uploadSkinRequest4.hashCode());
    }
}
