--[[
  Mojang Session API
 
  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 
  OpenAPI spec version: 2020-06-05
  
  Generated by: https://openapi-generator.tech
]]

-- player_texture_url class
local player_texture_url = {}
local player_texture_url_mt = {
	__name = "player_texture_url";
	__index = player_texture_url;
}

local function cast_player_texture_url(t)
	return setmetatable(t, player_texture_url_mt)
end

local function new_player_texture_url(url)
	return cast_player_texture_url({
		["url"] = url;
	})
end

return {
	cast = cast_player_texture_url;
	new = new_player_texture_url;
}
