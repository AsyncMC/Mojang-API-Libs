package controllers;

import apimodels.CurrentPlayerIDs;
import apimodels.Error;
import java.util.List;
import apimodels.NameChange;

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
