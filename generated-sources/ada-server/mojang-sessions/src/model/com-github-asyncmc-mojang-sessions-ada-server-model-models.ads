--  Mojang Session API
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  OpenAPI spec version: 2020_06_05
--  
--
--  NOTE: This package is auto generated by the swagger code generator 3.3.4.
--  https://openapi-generator.tech
--  Do not edit the class manually.
with Swagger.Streams;
with Ada.Containers.Vectors;
package com.github.asyncmc.mojang.sessions.ada.server.model.Models is



   type SessionApiError_Type is
     record
       Error : Swagger.Nullable_UString;
       Path : Swagger.Nullable_UString;
     end record;

   package SessionApiError_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => SessionApiError_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SessionApiError_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SessionApiError_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SessionApiError_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SessionApiError_Type_Vectors.Vector);




   type PlayerSkinURL_Type is
     record
       Url : Swagger.UString;
     end record;

   package PlayerSkinURL_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PlayerSkinURL_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerSkinURL_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerSkinURL_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerSkinURL_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerSkinURL_Type_Vectors.Vector);




   type PlayerTextureURL_Type is
     record
       Url : Swagger.UString;
     end record;

   package PlayerTextureURL_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PlayerTextureURL_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerTextureURL_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerTextureURL_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerTextureURL_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerTextureURL_Type_Vectors.Vector);




   type PlayerTexture_Type is
     record
       S_K_I_N : com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerSkinURL_Type;
       C_A_P_E : com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerTextureURL_Type;
     end record;

   package PlayerTexture_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PlayerTexture_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerTexture_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerTexture_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerTexture_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerTexture_Type_Vectors.Vector);




   type PlayerProfileTexturePropertyValue_Type is
     record
       Timestamp : Swagger.Long;
       Profile_Id : Swagger.UString;
       Profile_Name : Swagger.UString;
       Signature_Required : Swagger.Nullable_Boolean;
       Textures : com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerTexture_Type;
     end record;

   package PlayerProfileTexturePropertyValue_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PlayerProfileTexturePropertyValue_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerProfileTexturePropertyValue_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerProfileTexturePropertyValue_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerProfileTexturePropertyValue_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerProfileTexturePropertyValue_Type_Vectors.Vector);




   type PlayerSkinMetadata_Type is
     record
       Model : Swagger.Nullable_UString;
     end record;

   package PlayerSkinMetadata_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PlayerSkinMetadata_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerSkinMetadata_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerSkinMetadata_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerSkinMetadata_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerSkinMetadata_Type_Vectors.Vector);




   type PlayerProfile_Type is
     record
       Id : Swagger.UString;
       Name : Swagger.UString;
       Legacy : Swagger.Nullable_Boolean;
       Properties : com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerProfileProperty_Type_Vectors.Vector;
     end record;

   package PlayerProfile_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PlayerProfile_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerProfile_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerProfile_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerProfile_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerProfile_Type_Vectors.Vector);




   type PlayerProfileProperty_Type is
     record
       Name : Swagger.UString;
       Value : ByteArray_Type;
       Signature : ByteArray_Type;
     end record;

   package PlayerProfileProperty_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PlayerProfileProperty_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerProfileProperty_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PlayerProfileProperty_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerProfileProperty_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PlayerProfileProperty_Type_Vectors.Vector);



end com.github.asyncmc.mojang.sessions.ada.server.model.Models;
