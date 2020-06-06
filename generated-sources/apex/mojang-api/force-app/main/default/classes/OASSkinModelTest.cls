@isTest
private class OASSkinModelTest {
    @isTest
    private static void allowableValues() {
        Set<OASSkinModel> expected = new Set<OASSkinModel>{
            OASSkinModel.EMPTY,
            OASSkinModel.SLIM
        };
        Set<OASSkinModel> actual  = new Set<OASSkinModel>(OASSkinModel.values());
        System.assertEquals(expected, actual);
    }
}
