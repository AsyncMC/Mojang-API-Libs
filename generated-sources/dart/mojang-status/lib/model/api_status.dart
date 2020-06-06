part of openapi.api;

@Entity()
class ApiStatus {
  /// The underlying value of this enum member.
  final String value;

  const ApiStatus._internal(this.value);

  /// The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
  static const ApiStatus green_ = const ApiStatus._internal("green");
  /// The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
  static const ApiStatus yellow_ = const ApiStatus._internal("yellow");
  /// The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
  static const ApiStatus red_ = const ApiStatus._internal("red");
}

class ApiStatusTypeTransformer extends TypeTransformer<ApiStatus> {

  @override
  dynamic encode(ApiStatus data) {
    return data.value;
  }

  @override
  ApiStatus decode(dynamic data) {
    switch (data) {
      case "green": return ApiStatus.green_;
      case "yellow": return ApiStatus.yellow_;
      case "red": return ApiStatus.red_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

