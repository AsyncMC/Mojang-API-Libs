part of openapi.api;

class ChangeSkinRequest {
  
  SkinModel model = null;
  /* The URL which Mojang servers will download and apply the skin */
  String url = null;
  ChangeSkinRequest();

  @override
  String toString() {
    return 'ChangeSkinRequest[model=$model, url=$url, ]';
  }

  ChangeSkinRequest.fromJson(Map<String, dynamic> json) {
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

  static List<ChangeSkinRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<ChangeSkinRequest>() : json.map((value) => new ChangeSkinRequest.fromJson(value)).toList();
  }

  static Map<String, ChangeSkinRequest> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, ChangeSkinRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new ChangeSkinRequest.fromJson(value));
    }
    return map;
  }
}

