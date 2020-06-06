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

package com.github.asyncmc.mojang.status.android.server.request;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GetRequest extends StringRequest{
  Map<String, String> apiHeaders;
  String contentType;

  public GetRequest(String url, Map<String, String> apiHeaders, String contentType, Response.Listener<String> listener, Response.ErrorListener errorListener) {
    super(Method.GET, url, listener, errorListener);
    this.apiHeaders = apiHeaders;
    this.contentType = contentType;
  }

  /* (non-Javadoc)
  * @see com.android.volley.Request#getHeaders()
  */
  @Override
  public Map<String, String> getHeaders() throws AuthFailureError {
    Map<String, String> headers = super.getHeaders();
    if (headers == null || headers.equals(Collections.emptyMap())) {
      headers = new HashMap<String, String>();
    }
    if (apiHeaders != null && !apiHeaders.equals(Collections.emptyMap())) {
      headers.putAll(apiHeaders);
    }
    if(contentType != null) {
      headers.put("Content-Type", contentType);
    }

    return headers;
  }
}