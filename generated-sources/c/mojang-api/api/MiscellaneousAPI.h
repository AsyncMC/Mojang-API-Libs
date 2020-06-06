#include <stdlib.h>
#include <stdio.h>
#include "apiClient.h"
#include "cJSON.h"
#include "order_statistics_request.h"
#include "order_statistics_response.h"


// Get statistics on the sales of Minecraft.
//
order_statistics_response_t*
MiscellaneousAPI_getOrdersStatistics(apiClient_t *apiClient,order_statistics_request_t* order_statistics_request );



