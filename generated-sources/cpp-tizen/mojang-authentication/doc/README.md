# Documentation for Mojang Authentication API 2020-06-05 Tizen Client SDK

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
├── SDK                       \\Documentation for all classes in Mojang Authentication API Tizen Client SDK. See ./html/index.html
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
All URIs are relative to https://authserver.mojang.comhttps://authserver.mojang.com

### DefaultManager
Method | HTTP request | Description
------------- | ------------- | -------------
*authenticateSync* | *POST* /authenticate | .
*authenticateASync* | *POST* /authenticate | .
*invalidateSync* | *POST* /invalidate | .
*invalidateASync* | *POST* /invalidate | .
*refreshSync* | *POST* /refresh | .
*refreshASync* | *POST* /refresh | .
*siginoutSync* | *POST* /signout | .
*siginoutASync* | *POST* /signout | .
*validateSync* | *POST* /validate | .
*validateASync* | *POST* /validate | .


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *AccessKeys* | 
 *Agent* | Identifies the software doing the request
 *Authentication* | 
 *AuthenticationRequest* | Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 *Error* | This is returned when the request fails
 *GameProfile* | 
 *GameProfileProperty* | 
 *PrivateUserData* | 
 *ProfileId* | 
 *ReducedUserData* | 
 *RefreshRequest* | 
 *RefreshResponse* | 
 *UsernamePassword* | 

