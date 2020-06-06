import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/skin_model.dart';
part 'upload_skin_request.jser.dart';

class UploadSkinRequest {
  
  @Alias('model')
  final SkinModel model;
   /* The skin image in PNG format */
  @Alias('file')
  final MultipartFile file;
  

  UploadSkinRequest(
    

{
     this.model = null,  
    
     this.file = null 
    }
  );

  @override
  String toString() {
    return 'UploadSkinRequest[model=$model, file=$file, ]';
  }
}

@GenSerializer()
class UploadSkinRequestSerializer extends Serializer<UploadSkinRequest> with _$UploadSkinRequestSerializer {

}
