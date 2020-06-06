part of openapi.api;

class InlineObject {
  
  SkinModel model = null;
  /* The skin image in PNG format */
  MultipartFile file = null;
  InlineObject();

  @override
  String toString() {
    return 'InlineObject[model=$model, file=$file, ]';
  }

  InlineObject.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    model = new SkinModel.fromJson(json['model']);
    file = new File.fromJson(json['file']);
  }

  Map<String, dynamic> toJson() {
    return {
      'model': model,
      'file': file
    };
  }

  static List<InlineObject> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject>() : json.map((value) => new InlineObject.fromJson(value)).toList();
  }

  static Map<String, InlineObject> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject.fromJson(value));
    }
    return map;
  }
}

