#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "SecurityQuestionAnswerManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


SecurityQuestionAnswerManager::SecurityQuestionAnswerManager()
{

}

SecurityQuestionAnswerManager::~SecurityQuestionAnswerManager()
{

}

static gboolean __SecurityQuestionAnswerManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __SecurityQuestionAnswerManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__SecurityQuestionAnswerManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool checkSecurityStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool checkSecurityStatusHelper(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user/security/location");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SecurityQuestionAnswerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = checkSecurityStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (SecurityQuestionAnswerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), checkSecurityStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SecurityQuestionAnswerManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SecurityQuestionAnswerManager::checkSecurityStatusAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData)
{
	return checkSecurityStatusHelper(accessToken,
	
	handler, userData, true);
}

bool SecurityQuestionAnswerManager::checkSecurityStatusSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData)
{
	return checkSecurityStatusHelper(accessToken,
	
	handler, userData, false);
}

static bool listPendingSecurityQuestionsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<SecurityChallenge>, Error, void* )
	= reinterpret_cast<void(*)(std::list<SecurityChallenge>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<SecurityChallenge> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			SecurityChallenge singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool listPendingSecurityQuestionsHelper(char * accessToken,
	
	void(* handler)(std::list<SecurityChallenge>, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user/security/challenges");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SecurityQuestionAnswerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listPendingSecurityQuestionsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (SecurityQuestionAnswerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listPendingSecurityQuestionsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SecurityQuestionAnswerManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SecurityQuestionAnswerManager::listPendingSecurityQuestionsAsync(char * accessToken,
	
	void(* handler)(std::list<SecurityChallenge>, Error, void* )
	, void* userData)
{
	return listPendingSecurityQuestionsHelper(accessToken,
	
	handler, userData, true);
}

bool SecurityQuestionAnswerManager::listPendingSecurityQuestionsSync(char * accessToken,
	
	void(* handler)(std::list<SecurityChallenge>, Error, void* )
	, void* userData)
{
	return listPendingSecurityQuestionsHelper(accessToken,
	
	handler, userData, false);
}

static bool sendSecurityQuestionAnswersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool sendSecurityQuestionAnswersHelper(char * accessToken,
	std::list<std::list> securityAnswer, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;
	//TODO: Map Container
	if (isprimitive("std::list")) {
		node = converttoJson(&securityAnswer, "std::list", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<std::list>::iterator bodyIter = securityAnswer.begin(); bodyIter != securityAnswer.end(); ++bodyIter) {
			std::list itemAt = (*bodyIter);
			char *jsonStr =  itemAt.toJson();
			JsonNode *node_temp = json_from_string(jsonStr, NULL);
			g_free(static_cast<gpointer>(jsonStr));
			json_array_add_element(json_array, node_temp);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
	}
	




	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/user/security/location");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SecurityQuestionAnswerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = sendSecurityQuestionAnswersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (SecurityQuestionAnswerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), sendSecurityQuestionAnswersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SecurityQuestionAnswerManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SecurityQuestionAnswerManager::sendSecurityQuestionAnswersAsync(char * accessToken,
	std::list<std::list> securityAnswer, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return sendSecurityQuestionAnswersHelper(accessToken,
	securityAnswer, 
	handler, userData, true);
}

bool SecurityQuestionAnswerManager::sendSecurityQuestionAnswersSync(char * accessToken,
	std::list<std::list> securityAnswer, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return sendSecurityQuestionAnswersHelper(accessToken,
	securityAnswer, 
	handler, userData, false);
}

