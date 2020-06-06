package com.github.asyncmc.mojang.status.java.play.framework.api;

import com.github.asyncmc.mojang.status.java.play.framework.model.ApiStatus;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface DefaultApiControllerImpInterface {
    List<Map<String, ApiStatus>> checkStatuses() throws Exception;

}
