import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/skin_model.dart';
part 'inline_object.jser.dart';

class InlineObject {
  
  @Alias('model')
  final SkinModel model;
   /* The skin image in PNG format */
  @Alias('file')
  final MultipartFile file;
  

  InlineObject(
    

{
     this.model = null,  
    
     this.file = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject[model=$model, file=$file, ]';
  }
}

@GenSerializer()
class InlineObjectSerializer extends Serializer<InlineObject> with _$InlineObjectSerializer {

}
