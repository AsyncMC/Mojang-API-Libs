@isTest
private class OASOrderStatisticTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderStatistic> expected = new Set<OASOrderStatistic>{
            OASOrderStatistic.ITEM_SOLD_MINECRAFT,
            OASOrderStatistic.PREPAID_CARD_REDEEMED_MINECRAFT,
            OASOrderStatistic.ITEM_SOLD_COBALT,
            OASOrderStatistic.ITEM_SOLD_SCROLLS,
            OASOrderStatistic.PREPAID_CARD_REDEEMED_COBALT,
            OASOrderStatistic.ITEM_SOLD_DUNGEONS
        };
        Set<OASOrderStatistic> actual  = new Set<OASOrderStatistic>(OASOrderStatistic.values());
        System.assertEquals(expected, actual);
    }
}
