#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderStatisticsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderStatisticsRequest::OrderStatisticsRequest()
{
	//__init();
}

OrderStatisticsRequest::~OrderStatisticsRequest()
{
	//__cleanup();
}

void
OrderStatisticsRequest::__init()
{
	//new std::list()std::list> metricKeys;
}

void
OrderStatisticsRequest::__cleanup()
{
	//if(metricKeys != NULL) {
	//metricKeys.RemoveAll(true);
	//delete metricKeys;
	//metricKeys = NULL;
	//}
	//
}

void
OrderStatisticsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *metricKeysKey = "metricKeys";
	node = json_object_get_member(pJsonObject, metricKeysKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderStatistic> new_list;
			OrderStatistic inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderStatistic")) {
					jsonToValue(&inst, temp_json, "OrderStatistic", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			metricKeys = new_list;
		}
		
	}
}

OrderStatisticsRequest::OrderStatisticsRequest(char* json)
{
	this->fromJson(json);
}

char*
OrderStatisticsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderStatistic")) {
		list<OrderStatistic> new_list = static_cast<list <OrderStatistic> > (getMetricKeys());
		node = converttoJson(&new_list, "OrderStatistic", "array");
	} else {
		node = json_node_alloc();
		list<OrderStatistic> new_list = static_cast<list <OrderStatistic> > (getMetricKeys());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderStatistic>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderStatistic obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *metricKeysKey = "metricKeys";
	json_object_set_member(pJsonObject, metricKeysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OrderStatistic>
OrderStatisticsRequest::getMetricKeys()
{
	return metricKeys;
}

void
OrderStatisticsRequest::setMetricKeys(std::list <OrderStatistic> metricKeys)
{
	this->metricKeys = metricKeys;
}


