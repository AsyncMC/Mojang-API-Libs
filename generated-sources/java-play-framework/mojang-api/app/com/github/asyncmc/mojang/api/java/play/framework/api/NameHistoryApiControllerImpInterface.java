package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.java.play.framework.model.Error;
import java.util.List;
import com.github.asyncmc.mojang.api.java.play.framework.model.NameChange;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface NameHistoryApiControllerImpInterface {
    List<CurrentPlayerIDs> findUniqueIdsByName(List<String> requestBody) throws Exception;

    List<NameChange> getNameHistory(String strippedUuid) throws Exception;

    CurrentPlayerIDs getUniqueIdByName(String username, Long at) throws Exception;

}
