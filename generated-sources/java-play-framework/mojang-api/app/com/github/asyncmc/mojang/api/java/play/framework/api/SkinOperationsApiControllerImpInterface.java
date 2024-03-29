package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.Error;
import java.io.InputStream;
import com.github.asyncmc.mojang.api.java.play.framework.model.SkinModel;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface SkinOperationsApiControllerImpInterface {
    void changePlayerSkin(String strippedUuid, String url, SkinModel model) throws Exception;

    void resetPlayerSkin(String strippedUuid) throws Exception;

    void uploadPlayerSkin(String strippedUuid, Http.MultipartFormData.FilePart file, SkinModel model) throws Exception;

}
