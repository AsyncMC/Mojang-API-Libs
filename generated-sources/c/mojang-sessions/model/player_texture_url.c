#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "player_texture_url.h"


player_texture_url_t *player_texture_url_create(
    char *url
    ) {
	player_texture_url_t *player_texture_url = malloc(sizeof(player_texture_url_t));
	player_texture_url->url = url;

	return player_texture_url;
}


void player_texture_url_free(player_texture_url_t *player_texture_url) {
    listEntry_t *listEntry;
    free(player_texture_url->url);

	free(player_texture_url);
}

cJSON *player_texture_url_convertToJSON(player_texture_url_t *player_texture_url) {
	cJSON *item = cJSON_CreateObject();
	// player_texture_url->url
    if(cJSON_AddStringToObject(item, "url", player_texture_url->url) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

player_texture_url_t *player_texture_url_parseFromJSON(char *jsonString){

    player_texture_url_t *player_texture_url = NULL;
    cJSON *player_texture_urlJSON = cJSON_Parse(jsonString);
    if(player_texture_urlJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // player_texture_url->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(player_texture_urlJSON, "url");
    if(!cJSON_IsString(url) || (url->valuestring == NULL)){
    goto end; //String
    }


    player_texture_url = player_texture_url_create (
        strdup(url->valuestring)
        );
 cJSON_Delete(player_texture_urlJSON);
    return player_texture_url;
end:
    cJSON_Delete(player_texture_urlJSON);
    return NULL;

}

