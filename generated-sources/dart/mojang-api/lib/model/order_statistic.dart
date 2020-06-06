part of openapi.api;

@Entity()
class OrderStatistic {
  /// The underlying value of this enum member.
  final String value;

  const OrderStatistic._internal(this.value);

  /// Valid options to query the order statistics
  static const OrderStatistic itemSoldMinecraft_ = const OrderStatistic._internal("item_sold_minecraft");
  /// Valid options to query the order statistics
  static const OrderStatistic prepaidCardRedeemedMinecraft_ = const OrderStatistic._internal("prepaid_card_redeemed_minecraft");
  /// Valid options to query the order statistics
  static const OrderStatistic itemSoldCobalt_ = const OrderStatistic._internal("item_sold_cobalt");
  /// Valid options to query the order statistics
  static const OrderStatistic itemSoldScrolls_ = const OrderStatistic._internal("item_sold_scrolls");
  /// Valid options to query the order statistics
  static const OrderStatistic prepaidCardRedeemedCobalt_ = const OrderStatistic._internal("prepaid_card_redeemed_cobalt");
  /// Valid options to query the order statistics
  static const OrderStatistic itemSoldDungeons_ = const OrderStatistic._internal("item_sold_dungeons");
}

class OrderStatisticTypeTransformer extends TypeTransformer<OrderStatistic> {

  @override
  dynamic encode(OrderStatistic data) {
    return data.value;
  }

  @override
  OrderStatistic decode(dynamic data) {
    switch (data) {
      case "item_sold_minecraft": return OrderStatistic.itemSoldMinecraft_;
      case "prepaid_card_redeemed_minecraft": return OrderStatistic.prepaidCardRedeemedMinecraft_;
      case "item_sold_cobalt": return OrderStatistic.itemSoldCobalt_;
      case "item_sold_scrolls": return OrderStatistic.itemSoldScrolls_;
      case "prepaid_card_redeemed_cobalt": return OrderStatistic.prepaidCardRedeemedCobalt_;
      case "item_sold_dungeons": return OrderStatistic.itemSoldDungeons_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

