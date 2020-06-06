#include <stdlib.h>
#include <stdio.h>
#include "apiClient.h"
#include "cJSON.h"
#include "current_player_i_ds.h"
#include "error.h"
#include "list.h"
#include "name_change.h"


// Find the current UUID of multiple players at once
//
// Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
//
list_t*
NameHistoryAPI_findUniqueIdsByName(apiClient_t *apiClient,list_t* request_body );



// Gets the full player's name history
//
list_t*
NameHistoryAPI_getNameHistory(apiClient_t *apiClient,char* stripped_uuid );



// Find the UUID by name
//
// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
//
current_player_i_ds_t*
NameHistoryAPI_getUniqueIdByName(apiClient_t *apiClient,char* username ,long at );



