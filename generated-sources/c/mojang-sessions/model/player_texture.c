#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "player_texture.h"
#include "player_skin_url.h"
#include "player_texture_url.h"


player_texture_t *player_texture_create(
    player_skin_url_t *SKIN,
    player_texture_url_t *CAPE
    ) {
	player_texture_t *player_texture = malloc(sizeof(player_texture_t));
	player_texture->SKIN = SKIN;
	player_texture->CAPE = CAPE;

	return player_texture;
}


void player_texture_free(player_texture_t *player_texture) {
    listEntry_t *listEntry;
	player_skin_url_free(player_texture->SKIN);
	player_texture_url_free(player_texture->CAPE);

	free(player_texture);
}

cJSON *player_texture_convertToJSON(player_texture_t *player_texture) {
	cJSON *item = cJSON_CreateObject();
	// player_texture->SKIN
	cJSON *SKIN = player_skin_url_convertToJSON(player_texture->SKIN);
	if(SKIN == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "SKIN", SKIN);
	if(item->child == NULL) {
		goto fail;
	}

	// player_texture->CAPE
	cJSON *CAPE = player_texture_url_convertToJSON(player_texture->CAPE);
	if(CAPE == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "CAPE", CAPE);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

player_texture_t *player_texture_parseFromJSON(char *jsonString){

    player_texture_t *player_texture = NULL;
    cJSON *player_textureJSON = cJSON_Parse(jsonString);
    if(player_textureJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // player_texture->SKIN
    player_skin_url_t *SKIN;
    cJSON *SKINJSON = cJSON_GetObjectItemCaseSensitive(player_textureJSON, "SKIN");
    if(player_textureJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *SKINJSONData = cJSON_Print(SKINJSON);
    SKIN = player_skin_url_parseFromJSON(SKINJSONData);

    // player_texture->CAPE
    player_texture_url_t *CAPE;
    cJSON *CAPEJSON = cJSON_GetObjectItemCaseSensitive(player_textureJSON, "CAPE");
    if(player_textureJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *CAPEJSONData = cJSON_Print(CAPEJSON);
    CAPE = player_texture_url_parseFromJSON(CAPEJSONData);


    player_texture = player_texture_create (
        SKIN,
        CAPE
        );
        free(SKINJSONData);
        free(CAPEJSONData);
 cJSON_Delete(player_textureJSON);
    return player_texture;
end:
    cJSON_Delete(player_textureJSON);
    return NULL;

}

