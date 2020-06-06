#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "username_password.h"


username_password_t *username_password_create(
    char *username,
    char *password
    ) {
	username_password_t *username_password = malloc(sizeof(username_password_t));
	username_password->username = username;
	username_password->password = password;

	return username_password;
}


void username_password_free(username_password_t *username_password) {
    listEntry_t *listEntry;
    free(username_password->username);
    free(username_password->password);

	free(username_password);
}

cJSON *username_password_convertToJSON(username_password_t *username_password) {
	cJSON *item = cJSON_CreateObject();
	// username_password->username
    if(cJSON_AddStringToObject(item, "username", username_password->username) == NULL) {
    goto fail; //String
    }

	// username_password->password
    if(cJSON_AddStringToObject(item, "password", username_password->password) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

username_password_t *username_password_parseFromJSON(char *jsonString){

    username_password_t *username_password = NULL;
    cJSON *username_passwordJSON = cJSON_Parse(jsonString);
    if(username_passwordJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // username_password->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(username_passwordJSON, "username");
    if(!cJSON_IsString(username) || (username->valuestring == NULL)){
    goto end; //String
    }

    // username_password->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(username_passwordJSON, "password");
    if(!cJSON_IsString(password) || (password->valuestring == NULL)){
    goto end; //String
    }


    username_password = username_password_create (
        strdup(username->valuestring),
        strdup(password->valuestring)
        );
 cJSON_Delete(username_passwordJSON);
    return username_password;
end:
    cJSON_Delete(username_passwordJSON);
    return NULL;

}

