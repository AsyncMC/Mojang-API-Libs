--[[
  Mojang Session API
 
  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 
  OpenAPI spec version: 2020-06-05
  
  Generated by: https://openapi-generator.tech
]]

-- session_api_error class
local session_api_error = {}
local session_api_error_mt = {
	__name = "session_api_error";
	__index = session_api_error;
}

local function cast_session_api_error(t)
	return setmetatable(t, session_api_error_mt)
end

local function new_session_api_error(error, path)
	return cast_session_api_error({
		["error"] = error;
		["path"] = path;
	})
end

return {
	cast = cast_session_api_error;
	new = new_session_api_error;
}
