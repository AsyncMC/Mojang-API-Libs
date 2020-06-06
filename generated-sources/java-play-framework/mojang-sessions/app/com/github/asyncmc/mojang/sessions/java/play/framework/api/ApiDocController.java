package com.github.asyncmc.mojang.sessions.java.play.framework.api;

import javax.inject.*;
import play.mvc.*;

public class ApiDocController extends Controller {

    @Inject
    private ApiDocController() {
    }

    public Result api() {
        return redirect("/assets/lib/swagger-ui/index.html?/url=/assets/openapi.json");
    }
}
