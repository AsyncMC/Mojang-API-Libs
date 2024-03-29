--[[
  Mojang Authentication API
 
  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 
  OpenAPI spec version: 2020-06-05
  
  Generated by: https://openapi-generator.tech
]]

-- access_keys class
local access_keys = {}
local access_keys_mt = {
	__name = "access_keys";
	__index = access_keys;
}

local function cast_access_keys(t)
	return setmetatable(t, access_keys_mt)
end

local function new_access_keys(access_token, client_token)
	return cast_access_keys({
		["accessToken"] = access_token;
		["clientToken"] = client_token;
	})
end

return {
	cast = cast_access_keys;
	new = new_access_keys;
}
