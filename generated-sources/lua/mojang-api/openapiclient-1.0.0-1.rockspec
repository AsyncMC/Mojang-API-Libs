package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by OpenAPI Generator",
	detailed = [[
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.miscellaneous_api"] = "openapiclient/api/miscellaneous_api.lua";
		["openapiclient.api.name_history_api"] = "openapiclient/api/name_history_api.lua";
		["openapiclient.api.security_question_answer_api"] = "openapiclient/api/security_question_answer_api.lua";
		["openapiclient.api.skin_operations_api"] = "openapiclient/api/skin_operations_api.lua";
		["openapiclient.model.current_player_i_ds"] = "openapiclient/model/current_player_i_ds.lua";
		["openapiclient.model.error"] = "openapiclient/model/error.lua";
		["openapiclient.model.inline_object"] = "openapiclient/model/inline_object.lua";
		["openapiclient.model.inline_object_1"] = "openapiclient/model/inline_object_1.lua";
		["openapiclient.model.name_change"] = "openapiclient/model/name_change.lua";
		["openapiclient.model.order_statistic"] = "openapiclient/model/order_statistic.lua";
		["openapiclient.model.order_statistics_request"] = "openapiclient/model/order_statistics_request.lua";
		["openapiclient.model.order_statistics_response"] = "openapiclient/model/order_statistics_response.lua";
		["openapiclient.model.security_answer"] = "openapiclient/model/security_answer.lua";
		["openapiclient.model.security_answer_id"] = "openapiclient/model/security_answer_id.lua";
		["openapiclient.model.security_challenge"] = "openapiclient/model/security_challenge.lua";
		["openapiclient.model.security_question"] = "openapiclient/model/security_question.lua";
		["openapiclient.model.skin_model"] = "openapiclient/model/skin_model.lua";
	}
}
