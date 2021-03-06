--  Mojang Authentication API
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
package com.github.asyncmc.mojang.authentication.ada.model.Models is



   type Error_Type is
     record
       Error : Swagger.Nullable_UString;
       Error_Message : Swagger.Nullable_UString;
     end record;

   package Error_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Error_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Error_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Error_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Error_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Error_Type_Vectors.Vector);




   type GameProfileProperty_Type is
     record
       Name : Swagger.Nullable_UString;
       Value : Swagger.Nullable_UString;
     end record;

   package GameProfileProperty_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => GameProfileProperty_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GameProfileProperty_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GameProfileProperty_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out GameProfileProperty_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out GameProfileProperty_Type_Vectors.Vector);




   type PrivateUserData_Type is
     record
       Id : Swagger.Nullable_UString;
       Properties : com.github.asyncmc.mojang.authentication.ada.model.Models.GameProfileProperty_Type_Vectors.Vector;
     end record;

   package PrivateUserData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PrivateUserData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PrivateUserData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PrivateUserData_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PrivateUserData_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PrivateUserData_Type_Vectors.Vector);




   type ReducedUserData_Type is
     record
       Id : Swagger.Nullable_UString;
       Properties : com.github.asyncmc.mojang.authentication.ada.model.Models.GameProfileProperty_Type_Vectors.Vector;
     end record;

   package ReducedUserData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => ReducedUserData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ReducedUserData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ReducedUserData_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ReducedUserData_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ReducedUserData_Type_Vectors.Vector);




   type Agent_Type is
     record
       Name : Swagger.Nullable_UString;
       Version : Swagger.Nullable_Integer;
     end record;

   package Agent_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Agent_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Agent_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Agent_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Agent_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Agent_Type_Vectors.Vector);




   type ProfileId_Type is
     record
       Id : Swagger.UString;
       Name : Swagger.UString;
     end record;

   package ProfileId_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => ProfileId_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ProfileId_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ProfileId_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ProfileId_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ProfileId_Type_Vectors.Vector);




   type RefreshRequest_Type is
     record
       Access_Token : Swagger.UString;
       Client_Token : Swagger.Nullable_UString;
     end record;

   package RefreshRequest_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => RefreshRequest_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in RefreshRequest_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in RefreshRequest_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out RefreshRequest_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out RefreshRequest_Type_Vectors.Vector);




   type AccessKeys_Type is
     record
       Access_Token : Swagger.UString;
       Client_Token : Swagger.Nullable_UString;
     end record;

   package AccessKeys_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AccessKeys_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AccessKeys_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AccessKeys_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AccessKeys_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AccessKeys_Type_Vectors.Vector);




   type UsernamePassword_Type is
     record
       Username : Swagger.UString;
       Password : Swagger.UString;
     end record;

   package UsernamePassword_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => UsernamePassword_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UsernamePassword_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UsernamePassword_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UsernamePassword_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UsernamePassword_Type_Vectors.Vector);




   type RefreshResponse_Type is
     record
       Access_Token : Swagger.UString;
       Client_Token : Swagger.Nullable_UString;
     end record;

   package RefreshResponse_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => RefreshResponse_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in RefreshResponse_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in RefreshResponse_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out RefreshResponse_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out RefreshResponse_Type_Vectors.Vector);




   type AuthenticationRequest_Type is
     record
       Username : Swagger.UString;
       Password : Swagger.UString;
     end record;

   package AuthenticationRequest_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AuthenticationRequest_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuthenticationRequest_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuthenticationRequest_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuthenticationRequest_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuthenticationRequest_Type_Vectors.Vector);




   type Authentication_Type is
     record
       Access_Token : Swagger.UString;
       Client_Token : Swagger.Nullable_UString;
     end record;

   package Authentication_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Authentication_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Authentication_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Authentication_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Authentication_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Authentication_Type_Vectors.Vector);




   type GameProfile_Type is
     record
       Agent : Swagger.Nullable_UString;
       Id : Swagger.Nullable_UString;
       Name : Swagger.Nullable_UString;
       User_Id : Swagger.Nullable_UString;
       Created_At : Swagger.Nullable_Long;
       Legacy_Profile : Swagger.Nullable_Boolean;
       Suspended : Swagger.Nullable_Boolean;
       Paid : Swagger.Nullable_Boolean;
       Migrated : Swagger.Nullable_Boolean;
       Legacy : Swagger.Nullable_Boolean;
     end record;

   package GameProfile_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => GameProfile_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GameProfile_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GameProfile_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out GameProfile_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out GameProfile_Type_Vectors.Vector);



end com.github.asyncmc.mojang.authentication.ada.model.Models;
