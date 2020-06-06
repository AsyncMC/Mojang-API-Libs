/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.api.android.server;

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
import com.github.asyncmc.mojang.api.android.model.*;

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
    
    if ("ChangeSkinRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChangeSkinRequest>>(){}.getType();
    }
    
    if ("CurrentPlayerIDs".equalsIgnoreCase(className)) {
      return new TypeToken<List<CurrentPlayerIDs>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("NameChange".equalsIgnoreCase(className)) {
      return new TypeToken<List<NameChange>>(){}.getType();
    }
    
    if ("OrderStatistic".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderStatistic>>(){}.getType();
    }
    
    if ("OrderStatisticsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderStatisticsRequest>>(){}.getType();
    }
    
    if ("OrderStatisticsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderStatisticsResponse>>(){}.getType();
    }
    
    if ("SecurityAnswer".equalsIgnoreCase(className)) {
      return new TypeToken<List<SecurityAnswer>>(){}.getType();
    }
    
    if ("SecurityAnswerId".equalsIgnoreCase(className)) {
      return new TypeToken<List<SecurityAnswerId>>(){}.getType();
    }
    
    if ("SecurityChallenge".equalsIgnoreCase(className)) {
      return new TypeToken<List<SecurityChallenge>>(){}.getType();
    }
    
    if ("SecurityQuestion".equalsIgnoreCase(className)) {
      return new TypeToken<List<SecurityQuestion>>(){}.getType();
    }
    
    if ("SkinModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<SkinModel>>(){}.getType();
    }
    
    if ("UploadSkinRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UploadSkinRequest>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ChangeSkinRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ChangeSkinRequest>(){}.getType();
    }
    
    if ("CurrentPlayerIDs".equalsIgnoreCase(className)) {
      return new TypeToken<CurrentPlayerIDs>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("NameChange".equalsIgnoreCase(className)) {
      return new TypeToken<NameChange>(){}.getType();
    }
    
    if ("OrderStatistic".equalsIgnoreCase(className)) {
      return new TypeToken<OrderStatistic>(){}.getType();
    }
    
    if ("OrderStatisticsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderStatisticsRequest>(){}.getType();
    }
    
    if ("OrderStatisticsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderStatisticsResponse>(){}.getType();
    }
    
    if ("SecurityAnswer".equalsIgnoreCase(className)) {
      return new TypeToken<SecurityAnswer>(){}.getType();
    }
    
    if ("SecurityAnswerId".equalsIgnoreCase(className)) {
      return new TypeToken<SecurityAnswerId>(){}.getType();
    }
    
    if ("SecurityChallenge".equalsIgnoreCase(className)) {
      return new TypeToken<SecurityChallenge>(){}.getType();
    }
    
    if ("SecurityQuestion".equalsIgnoreCase(className)) {
      return new TypeToken<SecurityQuestion>(){}.getType();
    }
    
    if ("SkinModel".equalsIgnoreCase(className)) {
      return new TypeToken<SkinModel>(){}.getType();
    }
    
    if ("UploadSkinRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UploadSkinRequest>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};