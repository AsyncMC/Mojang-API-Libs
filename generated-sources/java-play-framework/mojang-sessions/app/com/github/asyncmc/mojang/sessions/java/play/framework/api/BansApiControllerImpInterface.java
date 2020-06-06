package com.github.asyncmc.mojang.sessions.java.play.framework.api;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface BansApiControllerImpInterface {
    String getBlockedServerHashes() throws Exception;

}
