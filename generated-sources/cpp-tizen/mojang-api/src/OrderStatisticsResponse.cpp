#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderStatisticsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderStatisticsResponse::OrderStatisticsResponse()
{
	//__init();
}

OrderStatisticsResponse::~OrderStatisticsResponse()
{
	//__cleanup();
}

void
OrderStatisticsResponse::__init()
{
	//total = long(0);
	//last24h = long(0);
	//saleVelocityPerSeconds = double(0);
}

void
OrderStatisticsResponse::__cleanup()
{
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//if(last24h != NULL) {
	//
	//delete last24h;
	//last24h = NULL;
	//}
	//if(saleVelocityPerSeconds != NULL) {
	//
	//delete saleVelocityPerSeconds;
	//saleVelocityPerSeconds = NULL;
	//}
	//
}

void
OrderStatisticsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&total, node, "long long", "");
		} else {
			
		}
	}
	const gchar *last24hKey = "last24h";
	node = json_object_get_member(pJsonObject, last24hKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&last24h, node, "long long", "");
		} else {
			
		}
	}
	const gchar *saleVelocityPerSecondsKey = "saleVelocityPerSeconds";
	node = json_object_get_member(pJsonObject, saleVelocityPerSecondsKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&saleVelocityPerSeconds, node, "double", "");
		} else {
			
		}
	}
}

OrderStatisticsResponse::OrderStatisticsResponse(char* json)
{
	this->fromJson(json);
}

char*
OrderStatisticsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	if (isprimitive("long long")) {
		long long obj = getLast24h();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *last24hKey = "last24h";
	json_object_set_member(pJsonObject, last24hKey, node);
	if (isprimitive("double")) {
		double obj = getSaleVelocityPerSeconds();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *saleVelocityPerSecondsKey = "saleVelocityPerSeconds";
	json_object_set_member(pJsonObject, saleVelocityPerSecondsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderStatisticsResponse::getTotal()
{
	return total;
}

void
OrderStatisticsResponse::setTotal(long long  total)
{
	this->total = total;
}

long long
OrderStatisticsResponse::getLast24h()
{
	return last24h;
}

void
OrderStatisticsResponse::setLast24h(long long  last24h)
{
	this->last24h = last24h;
}

double
OrderStatisticsResponse::getSaleVelocityPerSeconds()
{
	return saleVelocityPerSeconds;
}

void
OrderStatisticsResponse::setSaleVelocityPerSeconds(double  saleVelocityPerSeconds)
{
	this->saleVelocityPerSeconds = saleVelocityPerSeconds;
}


