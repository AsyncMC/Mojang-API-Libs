#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "LoginManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


LoginManager::LoginManager()
{

}

LoginManager::~LoginManager()
{

}

static gboolean __LoginManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __LoginManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__LoginManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getPlayerProfileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PlayerProfile, Error, void* )
	= reinterpret_cast<void(*)(PlayerProfile, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PlayerProfile out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PlayerProfile")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PlayerProfile", "PlayerProfile");
			json_node_free(pJson);

			if ("PlayerProfile" == "std::string") {
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

static bool getPlayerProfileHelper(char * accessToken,
	std::string strippedUuid, bool _unsigned, 
	void(* handler)(PlayerProfile, Error, void* )
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
	

	itemAtq = stringify(&_unsigned, "bool");
	queryParams.insert(pair<string, string>("unsigned", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("unsigned");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/session/minecraft/profile/{stripped_uuid}");
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
		NetClient::easycurl(LoginManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPlayerProfileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LoginManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPlayerProfileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LoginManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LoginManager::getPlayerProfileAsync(char * accessToken,
	std::string strippedUuid, bool _unsigned, 
	void(* handler)(PlayerProfile, Error, void* )
	, void* userData)
{
	return getPlayerProfileHelper(accessToken,
	strippedUuid, _unsigned, 
	handler, userData, true);
}

bool LoginManager::getPlayerProfileSync(char * accessToken,
	std::string strippedUuid, bool _unsigned, 
	void(* handler)(PlayerProfile, Error, void* )
	, void* userData)
{
	return getPlayerProfileHelper(accessToken,
	strippedUuid, _unsigned, 
	handler, userData, false);
}

