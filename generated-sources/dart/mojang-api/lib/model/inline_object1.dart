part of openapi.api;

class InlineObject1 {
  
  SkinModel model = null;
  /* The URL which Mojang servers will download and apply the skin */
  String url = null;
  InlineObject1();

  @override
  String toString() {
    return 'InlineObject1[model=$model, url=$url, ]';
  }

  InlineObject1.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    model = new SkinModel.fromJson(json['model']);
    url = json['url'];
  }

  Map<String, dynamic> toJson() {
    return {
      'model': model,
      'url': url
    };
  }

  static List<InlineObject1> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject1>() : json.map((value) => new InlineObject1.fromJson(value)).toList();
  }

  static Map<String, InlineObject1> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject1>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject1.fromJson(value));
    }
    return map;
  }
}

