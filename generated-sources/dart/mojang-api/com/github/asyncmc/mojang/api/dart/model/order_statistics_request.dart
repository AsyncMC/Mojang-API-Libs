part of openapi.api;

class OrderStatisticsRequest {
  
  List<OrderStatistic> metricKeys = [];
  OrderStatisticsRequest();

  @override
  String toString() {
    return 'OrderStatisticsRequest[metricKeys=$metricKeys, ]';
  }

  OrderStatisticsRequest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    metricKeys = OrderStatistic.listFromJson(json['metricKeys']);
  }

  Map<String, dynamic> toJson() {
    return {
      'metricKeys': metricKeys
    };
  }

  static List<OrderStatisticsRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<OrderStatisticsRequest>() : json.map((value) => new OrderStatisticsRequest.fromJson(value)).toList();
  }

  static Map<String, OrderStatisticsRequest> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, OrderStatisticsRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new OrderStatisticsRequest.fromJson(value));
    }
    return map;
  }
}

