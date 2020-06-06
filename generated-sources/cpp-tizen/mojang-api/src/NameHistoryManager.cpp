#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "NameHistoryManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


NameHistoryManager::NameHistoryManager()
{

}

NameHistoryManager::~NameHistoryManager()
{

}

static gboolean __NameHistoryManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __NameHistoryManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__NameHistoryManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool findUniqueIdsByNameProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<CurrentPlayerIDs>, Error, void* )
	= reinterpret_cast<void(*)(std::list<CurrentPlayerIDs>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<CurrentPlayerIDs> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			CurrentPlayerIDs singlemodel;
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

static bool findUniqueIdsByNameHelper(char * accessToken,
	std::list<std::list> requestBody, 
	void(* handler)(std::list<CurrentPlayerIDs>, Error, void* )
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
	//TODO: Map Container
	if (isprimitive("std::list")) {
		node = converttoJson(&requestBody, "std::list", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<std::list>::iterator bodyIter = requestBody.begin(); bodyIter != requestBody.end(); ++bodyIter) {
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

	string url("/profiles/minecraft");
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
		NetClient::easycurl(NameHistoryManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = findUniqueIdsByNameProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (NameHistoryManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), findUniqueIdsByNameProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __NameHistoryManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool NameHistoryManager::findUniqueIdsByNameAsync(char * accessToken,
	std::list<std::list> requestBody, 
	void(* handler)(std::list<CurrentPlayerIDs>, Error, void* )
	, void* userData)
{
	return findUniqueIdsByNameHelper(accessToken,
	requestBody, 
	handler, userData, true);
}

bool NameHistoryManager::findUniqueIdsByNameSync(char * accessToken,
	std::list<std::list> requestBody, 
	void(* handler)(std::list<CurrentPlayerIDs>, Error, void* )
	, void* userData)
{
	return findUniqueIdsByNameHelper(accessToken,
	requestBody, 
	handler, userData, false);
}

static bool getNameHistoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<NameChange>, Error, void* )
	= reinterpret_cast<void(*)(std::list<NameChange>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<NameChange> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			NameChange singlemodel;
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

static bool getNameHistoryHelper(char * accessToken,
	std::string strippedUuid, 
	void(* handler)(std::list<NameChange>, Error, void* )
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

	string url("/user/profiles/{stripped_uuid}/names");
	int pos;

	string s_strippedUuid("{");
	s_strippedUuid.append("stripped_uuid");
	s_strippedUuid.append("}");
	pos = url.find(s_strippedUuid);
	url.erase(pos, s_strippedUuid.length());
	url.insert(pos, stringify(&strippedUuid, "std::string"));

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
		NetClient::easycurl(NameHistoryManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getNameHistoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (NameHistoryManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getNameHistoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __NameHistoryManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool NameHistoryManager::getNameHistoryAsync(char * accessToken,
	std::string strippedUuid, 
	void(* handler)(std::list<NameChange>, Error, void* )
	, void* userData)
{
	return getNameHistoryHelper(accessToken,
	strippedUuid, 
	handler, userData, true);
}

bool NameHistoryManager::getNameHistorySync(char * accessToken,
	std::string strippedUuid, 
	void(* handler)(std::list<NameChange>, Error, void* )
	, void* userData)
{
	return getNameHistoryHelper(accessToken,
	strippedUuid, 
	handler, userData, false);
}

static bool getUniqueIdByNameProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CurrentPlayerIDs, Error, void* )
	= reinterpret_cast<void(*)(CurrentPlayerIDs, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CurrentPlayerIDs out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CurrentPlayerIDs")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CurrentPlayerIDs", "CurrentPlayerIDs");
			json_node_free(pJson);

			if ("CurrentPlayerIDs" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

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

static bool getUniqueIdByNameHelper(char * accessToken,
	std::string username, long long at, 
	void(* handler)(CurrentPlayerIDs, Error, void* )
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
	

	itemAtq = stringify(&at, "long long");
	queryParams.insert(pair<string, string>("at", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("at");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/users/profiles/minecraft/{username}");
	int pos;

	string s_username("{");
	s_username.append("username");
	s_username.append("}");
	pos = url.find(s_username);
	url.erase(pos, s_username.length());
	url.insert(pos, stringify(&username, "std::string"));

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
		NetClient::easycurl(NameHistoryManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getUniqueIdByNameProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (NameHistoryManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getUniqueIdByNameProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __NameHistoryManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool NameHistoryManager::getUniqueIdByNameAsync(char * accessToken,
	std::string username, long long at, 
	void(* handler)(CurrentPlayerIDs, Error, void* )
	, void* userData)
{
	return getUniqueIdByNameHelper(accessToken,
	username, at, 
	handler, userData, true);
}

bool NameHistoryManager::getUniqueIdByNameSync(char * accessToken,
	std::string username, long long at, 
	void(* handler)(CurrentPlayerIDs, Error, void* )
	, void* userData)
{
	return getUniqueIdByNameHelper(accessToken,
	username, at, 
	handler, userData, false);
}

