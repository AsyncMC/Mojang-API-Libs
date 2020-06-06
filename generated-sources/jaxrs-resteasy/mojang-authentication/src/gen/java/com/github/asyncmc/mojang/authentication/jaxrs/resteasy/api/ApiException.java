package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.015861900-03:00[America/Sao_Paulo]")
public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
