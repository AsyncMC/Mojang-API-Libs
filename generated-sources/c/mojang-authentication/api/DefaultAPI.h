#include <stdlib.h>
#include <stdio.h>
#include "apiClient.h"
#include "cJSON.h"
#include "access_keys.h"
#include "authentication.h"
#include "authentication_request.h"
#include "error.h"
#include "refresh_request.h"
#include "refresh_response.h"
#include "username_password.h"


authentication_t*
DefaultAPI_authenticate(apiClient_t *apiClient,authentication_request_t* authentication_request );



void
DefaultAPI_invalidate(apiClient_t *apiClient,access_keys_t* access_keys );



refresh_response_t*
DefaultAPI_refresh(apiClient_t *apiClient,refresh_request_t* refresh_request );



void
DefaultAPI_siginout(apiClient_t *apiClient,username_password_t* username_password );



void
DefaultAPI_validate(apiClient_t *apiClient,access_keys_t* access_keys );



