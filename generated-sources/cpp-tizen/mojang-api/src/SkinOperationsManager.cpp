#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "SkinOperationsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


SkinOperationsManager::SkinOperationsManager()
{

}

SkinOperationsManager::~SkinOperationsManager()
{

}

static gboolean __SkinOperationsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __SkinOperationsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__SkinOperationsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool changePlayerSkinProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool changePlayerSkinHelper(char * accessToken,
	std::string strippedUuid, std::string url, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/x-www-form-urlencoded");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user/profile/{stripped_uuid}/skin");
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SkinOperationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = changePlayerSkinProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SkinOperationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), changePlayerSkinProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SkinOperationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SkinOperationsManager::changePlayerSkinAsync(char * accessToken,
	std::string strippedUuid, std::string url, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return changePlayerSkinHelper(accessToken,
	strippedUuid, url, model, 
	handler, userData, true);
}

bool SkinOperationsManager::changePlayerSkinSync(char * accessToken,
	std::string strippedUuid, std::string url, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return changePlayerSkinHelper(accessToken,
	strippedUuid, url, model, 
	handler, userData, false);
}

static bool resetPlayerSkinProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool resetPlayerSkinHelper(char * accessToken,
	std::string strippedUuid, 
	
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

	string url("/user/profile/{stripped_uuid}/skin");
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SkinOperationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = resetPlayerSkinProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SkinOperationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), resetPlayerSkinProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SkinOperationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SkinOperationsManager::resetPlayerSkinAsync(char * accessToken,
	std::string strippedUuid, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return resetPlayerSkinHelper(accessToken,
	strippedUuid, 
	handler, userData, true);
}

bool SkinOperationsManager::resetPlayerSkinSync(char * accessToken,
	std::string strippedUuid, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return resetPlayerSkinHelper(accessToken,
	strippedUuid, 
	handler, userData, false);
}

static bool uploadPlayerSkinProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool uploadPlayerSkinHelper(char * accessToken,
	std::string strippedUuid, std::string file, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/user/profile/{stripped_uuid}/skin");
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
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SkinOperationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = uploadPlayerSkinProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SkinOperationsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), uploadPlayerSkinProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SkinOperationsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SkinOperationsManager::uploadPlayerSkinAsync(char * accessToken,
	std::string strippedUuid, std::string file, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return uploadPlayerSkinHelper(accessToken,
	strippedUuid, file, model, 
	handler, userData, true);
}

bool SkinOperationsManager::uploadPlayerSkinSync(char * accessToken,
	std::string strippedUuid, std::string file, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return uploadPlayerSkinHelper(accessToken,
	strippedUuid, file, model, 
	handler, userData, false);
}

