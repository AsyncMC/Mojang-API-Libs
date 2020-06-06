part of openapi.api;

class UploadSkinRequest {
  
  SkinModel model = null;
  /* The skin image in PNG format */
  MultipartFile file = null;
  UploadSkinRequest();

  @override
  String toString() {
    return 'UploadSkinRequest[model=$model, file=$file, ]';
  }

  UploadSkinRequest.fromJson(Map<String, dynamic> json) {
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

  static List<UploadSkinRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<UploadSkinRequest>() : json.map((value) => new UploadSkinRequest.fromJson(value)).toList();
  }

  static Map<String, UploadSkinRequest> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, UploadSkinRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new UploadSkinRequest.fromJson(value));
    }
    return map;
  }
}

