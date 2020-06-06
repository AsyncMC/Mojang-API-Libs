part of openapi.api;

@Entity()
class SkinModel {
  /// The underlying value of this enum member.
  final String value;

  const SkinModel._internal(this.value);

  /// Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
  static const SkinModel empty = const SkinModel._internal("");
  /// Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
  static const SkinModel slim_ = const SkinModel._internal("slim");
}

class SkinModelTypeTransformer extends TypeTransformer<SkinModel> {

  @override
  dynamic encode(SkinModel data) {
    return data.value;
  }

  @override
  SkinModel decode(dynamic data) {
    switch (data) {
      case "": return SkinModel.empty;
      case "slim": return SkinModel.slim_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

