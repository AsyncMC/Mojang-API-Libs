part of openapi.api;

class OrderStatisticsResponse {
  /* total amount sold */
  int total = null;
  /* total sold in last 24 hours */
  int last24h = null;
  /* decimal average sales per second */
  double saleVelocityPerSeconds = null;
  OrderStatisticsResponse();

  @override
  String toString() {
    return 'OrderStatisticsResponse[total=$total, last24h=$last24h, saleVelocityPerSeconds=$saleVelocityPerSeconds, ]';
  }

  OrderStatisticsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    total = json['total'];
    last24h = json['last24h'];
    saleVelocityPerSeconds = json['saleVelocityPerSeconds'];
  }

  Map<String, dynamic> toJson() {
    return {
      'total': total,
      'last24h': last24h,
      'saleVelocityPerSeconds': saleVelocityPerSeconds
    };
  }

  static List<OrderStatisticsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<OrderStatisticsResponse>() : json.map((value) => new OrderStatisticsResponse.fromJson(value)).toList();
  }

  static Map<String, OrderStatisticsResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, OrderStatisticsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new OrderStatisticsResponse.fromJson(value));
    }
    return map;
  }
}

