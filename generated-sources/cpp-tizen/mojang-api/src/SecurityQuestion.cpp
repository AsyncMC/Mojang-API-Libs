#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SecurityQuestion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SecurityQuestion::SecurityQuestion()
{
	//__init();
}

SecurityQuestion::~SecurityQuestion()
{
	//__cleanup();
}

void
SecurityQuestion::__init()
{
	//id = int(0);
	//question = std::string();
}

void
SecurityQuestion::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(question != NULL) {
	//
	//delete question;
	//question = NULL;
	//}
	//
}

void
SecurityQuestion::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *questionKey = "question";
	node = json_object_get_member(pJsonObject, questionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&question, node, "std::string", "");
		} else {
			
		}
	}
}

SecurityQuestion::SecurityQuestion(char* json)
{
	this->fromJson(json);
}

char*
SecurityQuestion::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getQuestion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *questionKey = "question";
	json_object_set_member(pJsonObject, questionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
SecurityQuestion::getId()
{
	return id;
}

void
SecurityQuestion::setId(int  id)
{
	this->id = id;
}

std::string
SecurityQuestion::getQuestion()
{
	return question;
}

void
SecurityQuestion::setQuestion(std::string  question)
{
	this->question = question;
}


