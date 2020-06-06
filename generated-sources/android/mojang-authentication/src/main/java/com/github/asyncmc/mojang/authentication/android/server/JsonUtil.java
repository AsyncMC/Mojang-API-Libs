/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.authentication.android.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import com.github.asyncmc.mojang.authentication.android.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccessKeys".equalsIgnoreCase(className)) {
      return new TypeToken<List<AccessKeys>>(){}.getType();
    }
    
    if ("Agent".equalsIgnoreCase(className)) {
      return new TypeToken<List<Agent>>(){}.getType();
    }
    
    if ("Authentication".equalsIgnoreCase(className)) {
      return new TypeToken<List<Authentication>>(){}.getType();
    }
    
    if ("AuthenticationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthenticationRequest>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("GameProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<GameProfile>>(){}.getType();
    }
    
    if ("GameProfileProperty".equalsIgnoreCase(className)) {
      return new TypeToken<List<GameProfileProperty>>(){}.getType();
    }
    
    if ("PrivateUserData".equalsIgnoreCase(className)) {
      return new TypeToken<List<PrivateUserData>>(){}.getType();
    }
    
    if ("ProfileId".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProfileId>>(){}.getType();
    }
    
    if ("ReducedUserData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReducedUserData>>(){}.getType();
    }
    
    if ("RefreshRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<RefreshRequest>>(){}.getType();
    }
    
    if ("RefreshResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RefreshResponse>>(){}.getType();
    }
    
    if ("UsernamePassword".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsernamePassword>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccessKeys".equalsIgnoreCase(className)) {
      return new TypeToken<AccessKeys>(){}.getType();
    }
    
    if ("Agent".equalsIgnoreCase(className)) {
      return new TypeToken<Agent>(){}.getType();
    }
    
    if ("Authentication".equalsIgnoreCase(className)) {
      return new TypeToken<Authentication>(){}.getType();
    }
    
    if ("AuthenticationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AuthenticationRequest>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("GameProfile".equalsIgnoreCase(className)) {
      return new TypeToken<GameProfile>(){}.getType();
    }
    
    if ("GameProfileProperty".equalsIgnoreCase(className)) {
      return new TypeToken<GameProfileProperty>(){}.getType();
    }
    
    if ("PrivateUserData".equalsIgnoreCase(className)) {
      return new TypeToken<PrivateUserData>(){}.getType();
    }
    
    if ("ProfileId".equalsIgnoreCase(className)) {
      return new TypeToken<ProfileId>(){}.getType();
    }
    
    if ("ReducedUserData".equalsIgnoreCase(className)) {
      return new TypeToken<ReducedUserData>(){}.getType();
    }
    
    if ("RefreshRequest".equalsIgnoreCase(className)) {
      return new TypeToken<RefreshRequest>(){}.getType();
    }
    
    if ("RefreshResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RefreshResponse>(){}.getType();
    }
    
    if ("UsernamePassword".equalsIgnoreCase(className)) {
      return new TypeToken<UsernamePassword>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};