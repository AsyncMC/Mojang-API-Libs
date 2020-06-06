# Documentation for Mojang Session API 2020-06-05 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Mojang Session API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to https://sessionserver.mojang.comhttps://sessionserver.mojang.com

### BansManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getBlockedServerHashesSync* | *GET* /blockedservers | A list of SHA1 hashes of banned servers.
*getBlockedServerHashesASync* | *GET* /blockedservers | A list of SHA1 hashes of banned servers.

### LoginManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getPlayerProfileSync* | *GET* /session/minecraft/profile/{stripped_uuid} | Gets the player's game profile.
*getPlayerProfileASync* | *GET* /session/minecraft/profile/{stripped_uuid} | Gets the player's game profile.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *PlayerProfile* | 
 *PlayerProfileProperty* | A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 *PlayerProfileTexturePropertyValue* | This is obtained by decoding the \"textures\" property
 *PlayerSkinMetadata* | Contains details about the skin
 *PlayerSkinURL* | Wraps the URL to the texture and configures the player's model
 *PlayerTexture* | Provide links to the player's skin and cape
 *PlayerTextureURL* | Wraps the URL to the texture
 *SessionApiError* | An object describing giving a bit of information about the error

