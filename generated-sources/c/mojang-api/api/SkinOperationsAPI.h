#include <stdlib.h>
#include <stdio.h>
#include "apiClient.h"
#include "cJSON.h"
#include "error.h"
#include "skin_model.h"


// Changes the player skin by URL
//
// This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
//
void
SkinOperationsAPI_changePlayerSkin(apiClient_t *apiClient,char* stripped_uuid ,char* url ,skin_model_t* model );



// Resets the player skin to default
//
void
SkinOperationsAPI_resetPlayerSkin(apiClient_t *apiClient,char* stripped_uuid );



// Changes the player skin by upload
//
// This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
//
void
SkinOperationsAPI_uploadPlayerSkin(apiClient_t *apiClient,char* stripped_uuid ,FILE* file ,skin_model_t* model );



