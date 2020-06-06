#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SecurityChallenge.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SecurityChallenge::SecurityChallenge()
{
	//__init();
}

SecurityChallenge::~SecurityChallenge()
{
	//__cleanup();
}

void
SecurityChallenge::__init()
{
	//question = new SecurityQuestion();
	//answer = new SecurityAnswerId();
}

void
SecurityChallenge::__cleanup()
{
	//if(question != NULL) {
	//
	//delete question;
	//question = NULL;
	//}
	//if(answer != NULL) {
	//
	//delete answer;
	//answer = NULL;
	//}
	//
}

void
SecurityChallenge::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *questionKey = "question";
	node = json_object_get_member(pJsonObject, questionKey);
	if (node !=NULL) {
	

		if (isprimitive("SecurityQuestion")) {
			jsonToValue(&question, node, "SecurityQuestion", "SecurityQuestion");
		} else {
			
			SecurityQuestion* obj = static_cast<SecurityQuestion*> (&question);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *answerKey = "answer";
	node = json_object_get_member(pJsonObject, answerKey);
	if (node !=NULL) {
	

		if (isprimitive("SecurityAnswerId")) {
			jsonToValue(&answer, node, "SecurityAnswerId", "SecurityAnswerId");
		} else {
			
			SecurityAnswerId* obj = static_cast<SecurityAnswerId*> (&answer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SecurityChallenge::SecurityChallenge(char* json)
{
	this->fromJson(json);
}

char*
SecurityChallenge::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SecurityQuestion")) {
		SecurityQuestion obj = getQuestion();
		node = converttoJson(&obj, "SecurityQuestion", "");
	}
	else {
		
		SecurityQuestion obj = static_cast<SecurityQuestion> (getQuestion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *questionKey = "question";
	json_object_set_member(pJsonObject, questionKey, node);
	if (isprimitive("SecurityAnswerId")) {
		SecurityAnswerId obj = getAnswer();
		node = converttoJson(&obj, "SecurityAnswerId", "");
	}
	else {
		
		SecurityAnswerId obj = static_cast<SecurityAnswerId> (getAnswer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *answerKey = "answer";
	json_object_set_member(pJsonObject, answerKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

SecurityQuestion
SecurityChallenge::getQuestion()
{
	return question;
}

void
SecurityChallenge::setQuestion(SecurityQuestion  question)
{
	this->question = question;
}

SecurityAnswerId
SecurityChallenge::getAnswer()
{
	return answer;
}

void
SecurityChallenge::setAnswer(SecurityAnswerId  answer)
{
	this->answer = answer;
}


