#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "player_skin_url.h"
#include "player_texture_url.h"


player_skin_url_t *player_skin_url_create(
    char *url
    ) {
	player_skin_url_t *player_skin_url = malloc(sizeof(player_skin_url_t));
	player_skin_url->url = url;

	return player_skin_url;
}


void player_skin_url_free(player_skin_url_t *player_skin_url) {
    listEntry_t *listEntry;
    free(player_skin_url->url);

	free(player_skin_url);
}

cJSON *player_skin_url_convertToJSON(player_skin_url_t *player_skin_url) {
	cJSON *item = cJSON_CreateObject();
	// player_skin_url->url
    if(cJSON_AddStringToObject(item, "url", player_skin_url->url) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

player_skin_url_t *player_skin_url_parseFromJSON(char *jsonString){

    player_skin_url_t *player_skin_url = NULL;
    cJSON *player_skin_urlJSON = cJSON_Parse(jsonString);
    if(player_skin_urlJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // player_skin_url->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(player_skin_urlJSON, "url");
    if(!cJSON_IsString(url) || (url->valuestring == NULL)){
    goto end; //String
    }


    player_skin_url = player_skin_url_create (
        strdup(url->valuestring)
        );
 cJSON_Delete(player_skin_urlJSON);
    return player_skin_url;
end:
    cJSON_Delete(player_skin_urlJSON);
    return NULL;

}

