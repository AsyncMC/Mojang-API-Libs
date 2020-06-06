--[[
  Mojang Authentication API
 
  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 
  OpenAPI spec version: 2020-06-05
  
  Generated by: https://openapi-generator.tech
]]

-- error class
local error = {}
local error_mt = {
	__name = "error";
	__index = error;
}

local function cast_error(t)
	return setmetatable(t, error_mt)
end

local function new_error(error, error_message)
	return cast_error({
		["error"] = error;
		["errorMessage"] = error_message;
	})
end

return {
	cast = cast_error;
	new = new_error;
}