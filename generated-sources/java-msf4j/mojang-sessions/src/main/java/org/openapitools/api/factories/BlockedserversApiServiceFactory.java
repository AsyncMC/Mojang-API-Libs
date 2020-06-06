package org.openapitools.api.factories;

import org.openapitools.api.BlockedserversApiService;
import org.openapitools.api.impl.BlockedserversApiServiceImpl;

public class BlockedserversApiServiceFactory {
    private final static BlockedserversApiService service = new BlockedserversApiServiceImpl();

    public static BlockedserversApiService getBlockedserversApi() {
        return service;
    }
}
