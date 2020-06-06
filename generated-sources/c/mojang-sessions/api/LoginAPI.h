#include <stdlib.h>
#include <stdio.h>
#include "apiClient.h"
#include "cJSON.h"
#include "player_profile.h"
#include "session_api_error.h"


// Gets the player's game profile
//
// This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
//
player_profile_t*
LoginAPI_getPlayerProfile(apiClient_t *apiClient,char* stripped_uuid ,int unsigned );



