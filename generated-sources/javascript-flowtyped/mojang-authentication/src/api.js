// @flow
/* eslint-disable no-use-before-define */
/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH: string = "https://authserver.mojang.com".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 */
export type FetchAPI = {
    (url: string, init?: any): Promise<Response>;
}

/**
 *
 * @export
 */
export type FetchArgs = {
    url: string;
    options: {};
}


/**
 *
 * @export
 */
export type RequestOptions = {
    headers?: {};
    query?: {};
    body?: string | FormData;
}

/**
 * * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name:string = "RequiredError"
    constructor(field: string, msg?: string) {
        super(msg);
    }
}

/**
 * 
 * @export
 */
export type AccessKeys = {
    /**
     * 
     * @type {string}
     * @memberof AccessKeys
     */
    accessToken: string;
    /**
     * 
     * @type {string}
     * @memberof AccessKeys
     */
    clientToken?: string;
}



            export type AgentNameEnum = 'Minecraft' | 'Scrolls';
/**
 * Identifies the software doing the request
 * @export
 */
export type Agent = {
    /**
     * The name of the game
     * @type {string}
     * @memberof Agent
     */
    name?: AgentNameEnum;
    /**
     * The agent version, usually 1.
     * @type {number}
     * @memberof Agent
     */
    version?: number;
}


/**
 * 
 * @export
 */
export type Authentication = {
}


/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 * @export
 */
export type AuthenticationRequest = {
}


/**
 * This is returned when the request fails
 * @export
 */
export type Error = {
    /**
     * 
     * @type {string}
     * @memberof Error
     */
    error?: string;
    /**
     * 
     * @type {string}
     * @memberof Error
     */
    errorMessage?: string;
}


/**
 * 
 * @export
 */
export type GameProfile = {
    /**
     * 
     * @type {string}
     * @memberof GameProfile
     */
    agent?: string;
    /**
     * 
     * @type {string}
     * @memberof GameProfile
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof GameProfile
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof GameProfile
     */
    userId?: string;
    /**
     * Unix timestamp in milliseconds
     * @type {number}
     * @memberof GameProfile
     */
    createdAt?: number;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    legacyProfile?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    suspended?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    paid?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    migrated?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    legacy?: boolean;
}


/**
 * 
 * @export
 */
export type GameProfileProperty = {
    /**
     * 
     * @type {string}
     * @memberof GameProfileProperty
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof GameProfileProperty
     */
    value?: string;
}


/**
 * 
 * @export
 */
export type PrivateUserData = {
}


/**
 * 
 * @export
 */
export type ProfileId = {
    /**
     * 
     * @type {string}
     * @memberof ProfileId
     */
    id: string;
    /**
     * The player name
     * @type {string}
     * @memberof ProfileId
     */
    name: string;
}


/**
 * 
 * @export
 */
export type ReducedUserData = {
    /**
     * 
     * @type {string}
     * @memberof ReducedUserData
     */
    id?: string;
    /**
     * 
     * @type {Array<GameProfileProperty>}
     * @memberof ReducedUserData
     */
    properties?: Array<GameProfileProperty>;
}


/**
 * 
 * @export
 */
export type RefreshRequest = {
}


/**
 * 
 * @export
 */
export type RefreshResponse = {
}


/**
 * 
 * @export
 */
export type UsernamePassword = {
    /**
     * The Mojang account e-mail or username. Never store it.
     * @type {string}
     * @memberof UsernamePassword
     */
    username: string;
    /**
     * The Mojang account password, never store it.
     * @type {string}
     * @memberof UsernamePassword
     */
    password: string;
}




/**
 * DefaultApi - fetch parameter creator
 * @export
 */
export const DefaultApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @throws {RequiredError}
         */
        authenticate(authenticationRequest: AuthenticationRequest, options: RequestOptions): FetchArgs {
            // verify required parameter 'authenticationRequest' is not null or undefined
            if (authenticationRequest === null || authenticationRequest === undefined) {
                throw new RequiredError('authenticationRequest','Required parameter authenticationRequest was null or undefined when calling authenticate.');
            }
            const localVarPath = `/authenticate`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof authenticationRequest !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(authenticationRequest || {}) : (((authenticationRequest:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @throws {RequiredError}
         */
        invalidate(accessKeys: AccessKeys, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessKeys' is not null or undefined
            if (accessKeys === null || accessKeys === undefined) {
                throw new RequiredError('accessKeys','Required parameter accessKeys was null or undefined when calling invalidate.');
            }
            const localVarPath = `/invalidate`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof accessKeys !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(accessKeys || {}) : (((accessKeys:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @throws {RequiredError}
         */
        refresh(refreshRequest: RefreshRequest, options: RequestOptions): FetchArgs {
            // verify required parameter 'refreshRequest' is not null or undefined
            if (refreshRequest === null || refreshRequest === undefined) {
                throw new RequiredError('refreshRequest','Required parameter refreshRequest was null or undefined when calling refresh.');
            }
            const localVarPath = `/refresh`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof refreshRequest !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(refreshRequest || {}) : (((refreshRequest:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @throws {RequiredError}
         */
        siginout(usernamePassword: UsernamePassword, options: RequestOptions): FetchArgs {
            // verify required parameter 'usernamePassword' is not null or undefined
            if (usernamePassword === null || usernamePassword === undefined) {
                throw new RequiredError('usernamePassword','Required parameter usernamePassword was null or undefined when calling siginout.');
            }
            const localVarPath = `/signout`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof usernamePassword !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(usernamePassword || {}) : (((usernamePassword:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @throws {RequiredError}
         */
        validate(accessKeys: AccessKeys, options: RequestOptions): FetchArgs {
            // verify required parameter 'accessKeys' is not null or undefined
            if (accessKeys === null || accessKeys === undefined) {
                throw new RequiredError('accessKeys','Required parameter accessKeys was null or undefined when calling validate.');
            }
            const localVarPath = `/validate`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof accessKeys !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(accessKeys || {}) : (((accessKeys:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type DefaultApiType = { 
    authenticate(authenticationRequest: AuthenticationRequest, options?: RequestOptions): Promise<Authentication>,

    invalidate(accessKeys: AccessKeys, options?: RequestOptions): Promise<Response>,

    refresh(refreshRequest: RefreshRequest, options?: RequestOptions): Promise<RefreshResponse>,

    siginout(usernamePassword: UsernamePassword, options?: RequestOptions): Promise<Response>,

    validate(accessKeys: AccessKeys, options?: RequestOptions): Promise<Response>,
}

/**
 * DefaultApi - factory function to inject configuration 
 * @export
 */
export const DefaultApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): DefaultApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * 
         * @throws {RequiredError}
         */
        authenticate(authenticationRequest: AuthenticationRequest, options?: RequestOptions = {}): Promise<Authentication> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).authenticate(authenticationRequest, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * 
         * @throws {RequiredError}
         */
        invalidate(accessKeys: AccessKeys, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).invalidate(accessKeys, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * 
         * @throws {RequiredError}
         */
        refresh(refreshRequest: RefreshRequest, options?: RequestOptions = {}): Promise<RefreshResponse> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).refresh(refreshRequest, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * 
         * @throws {RequiredError}
         */
        siginout(usernamePassword: UsernamePassword, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).siginout(usernamePassword, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * 
         * @throws {RequiredError}
         */
        validate(accessKeys: AccessKeys, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).validate(accessKeys, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
    }
};

export type ApiTypes = { 
    DefaultApi: DefaultApiType,
 }
