--  Mojang API
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;
package .Servers is
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  Get statistics on the sales of Minecraft.
   overriding
   procedure Get_Orders_Statistics
      (Server : in out Server_Type;
       Order_Statistics_Request_Type : in OrderStatisticsRequest_Type;
       Result  : out .Models.OrderStatisticsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Find the current UUID of multiple players at once
   --  Find the current players name, UUID, demo status and migration flag by the current players name. The "at" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
   overriding
   procedure Find_Unique_Ids_By_Name
      (Server : in out Server_Type;
       String : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.CurrentPlayerIDs_Type_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type);

   --  Gets the full player's name history
   overriding
   procedure Get_Name_History
      (Server : in out Server_Type;
       Stripped_Uuid : in Swagger.UString;
       Result  : out .Models.NameChange_Type_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type);

   --  Find the UUID by name
   --  Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
   overriding
   procedure Get_Unique_Id_By_Name
      (Server : in out Server_Type;
       Username : in Swagger.UString;
       P_At : in Swagger.Nullable_Long;
       Result  : out .Models.CurrentPlayerIDs_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Check if security questions are needed
   overriding
   procedure Check_Security_Status
      (Server : in out Server_Type
       ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get list of questions
   overriding
   procedure List_Pending_Security_Questions
      (Server : in out Server_Type
       ;
       Result  : out .Models.SecurityChallenge_Type_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type);

   --  Send back the answers
   overriding
   procedure Send_Security_Question_Answers
      (Server : in out Server_Type;
       Security_Answer : in .Models.SecurityAnswer_Type_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type);

   --  Changes the player skin by URL
   --  This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
   overriding
   procedure Change_Player_Skin
      (Server : in out Server_Type;
       Stripped_Uuid : in Swagger.UString;
       Url : in Swagger.UString;
       Model : in .Models.SkinModel_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Resets the player skin to default
   overriding
   procedure Reset_Player_Skin
      (Server : in out Server_Type;
       Stripped_Uuid : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  Changes the player skin by upload
   --  This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
   overriding
   procedure Upload_Player_Skin
      (Server : in out Server_Type;
       Stripped_Uuid : in Swagger.UString;
       File : in Swagger.File_Part_Type;
       Model : in .Models.SkinModel_Type;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
