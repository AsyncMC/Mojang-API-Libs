--[[
  Mojang API
 
  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 
  OpenAPI spec version: 2020-06-05
  
  Generated by: https://openapi-generator.tech
]]

-- skin_model class
local skin_model = {}
local skin_model_mt = {
	__name = "skin_model";
	__index = skin_model;
}

local function cast_skin_model(t)
	return setmetatable(t, skin_model_mt)
end

local function new_skin_model()
	return cast_skin_model({
	})
end

return {
	cast = cast_skin_model;
	new = new_skin_model;
}
