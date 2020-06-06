--  Mojang Session API
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  OpenAPI spec version: 2020_06_05
--  
--
--  NOTE: This package is auto generated by the swagger code generator 3.3.4.
--  https://openapi-generator.tech
--  Do not edit the class manually.
with Swagger.Servers;
with com.github.asyncmc.mojang.sessions.ada.server.model.Models;
with Security.Permissions;
package com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons is
   use com.github.asyncmc.mojang.sessions.ada.server.model.Models;
   type Server_Type is limited interface;



   --  A list of SHA1 hashes of banned servers
   --  Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect.
   --  Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*.
   --  This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)
   procedure Get_Blocked_Server_Hashes
      (Server : in out Server_Type
       ;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  Gets the player's game profile
   --  This will return the player's username plus any additional information about them (e.g. skins).
   --  This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
   procedure Get_Player_Profile
      (Server : in out Server_Type;
       Stripped_Uuid : in Swagger.UString;
       Unsigned : in Swagger.Nullable_Boolean;
       Result  : out com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerProfile_Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Skeleton is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  A list of SHA1 hashes of banned servers
      procedure Get_Blocked_Server_Hashes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  Gets the player's game profile
      procedure Get_Player_Profile
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);

   end Skeleton;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Shared_Instance is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  A list of SHA1 hashes of banned servers
      procedure Get_Blocked_Server_Hashes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  Gets the player's game profile
      procedure Get_Player_Profile
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


   private
      protected Server is

         --  A list of SHA1 hashes of banned servers
         procedure Get_Blocked_Server_Hashes
            (Result  : out Swagger.UString;
             Context : in out Swagger.Servers.Context_Type);

         --  Gets the player's game profile
         procedure Get_Player_Profile
            (Stripped_Uuid : in Swagger.UString;
             Unsigned : in Swagger.Nullable_Boolean;
             Result  : out com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerProfile_Type;
             Context : in out Swagger.Servers.Context_Type);

      private
         Impl : Implementation_Type;
      end Server;
   end Shared_Instance;

end com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons;
