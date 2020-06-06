@isTest
private class OASApiStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASApiStatus> expected = new Set<OASApiStatus>{
            OASApiStatus.GREEN,
            OASApiStatus.YELLOW,
            OASApiStatus.RED
        };
        Set<OASApiStatus> actual  = new Set<OASApiStatus>(OASApiStatus.values());
        System.assertEquals(expected, actual);
    }
}
