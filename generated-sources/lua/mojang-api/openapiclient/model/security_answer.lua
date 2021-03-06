--[[
  Mojang API
 
  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 
  OpenAPI spec version: 2020-06-05
  
  Generated by: https://openapi-generator.tech
]]

-- security_answer class
local security_answer = {}
local security_answer_mt = {
	__name = "security_answer";
	__index = security_answer;
}

local function cast_security_answer(t)
	return setmetatable(t, security_answer_mt)
end

local function new_security_answer(id)
	return cast_security_answer({
		["id"] = id;
	})
end

return {
	cast = cast_security_answer;
	new = new_security_answer;
}
