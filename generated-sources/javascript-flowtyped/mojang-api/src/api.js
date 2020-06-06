// @flow
/* eslint-disable no-use-before-define */
/**
 * Mojang API
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

const BASE_PATH: string = "https://api.mojang.com".replace(/\/+$/, "");

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
 * The current player, demo and legacy status of a player identified by the id
 * @export
 */
export type CurrentPlayerIDs = {
    /**
     * The player UUID without hyphens
     * @type {string}
     * @memberof CurrentPlayerIDs
     */
    id: string;
    /**
     * The current name being used by this player
     * @type {string}
     * @memberof CurrentPlayerIDs
     */
    name: string;
    /**
     * If account has not been converted
     * @type {boolean}
     * @memberof CurrentPlayerIDs
     */
    legacy?: boolean;
    /**
     * If the player has not puchased the game
     * @type {boolean}
     * @memberof CurrentPlayerIDs
     */
    demo?: boolean;
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
export type InlineObject = {
    /**
     * 
     * @type {SkinModel}
     * @memberof InlineObject
     */
    model?: SkinModel;
    /**
     * The skin image in PNG format
     * @type {any}
     * @memberof InlineObject
     */
    file: any;
}


/**
 * Request Mojang to download a skin from an URL and apply to the player
 * @export
 */
export type InlineObject1 = {
    /**
     * 
     * @type {SkinModel}
     * @memberof InlineObject1
     */
    model?: SkinModel;
    /**
     * The URL which Mojang servers will download and apply the skin
     * @type {string}
     * @memberof InlineObject1
     */
    url: string;
}


/**
 * A registered name change.
 * @export
 */
export type NameChange = {
    /**
     * The new player name
     * @type {string}
     * @memberof NameChange
     */
    name: string;
    /**
     * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
     * @type {number}
     * @memberof NameChange
     */
    changedToAt?: number;
}


/**
 * Valid options to query the order statistics
 * @export
 * @enum {string}
 */
export type OrderStatistic = 'item_sold_minecraft' | 'prepaid_card_redeemed_minecraft' | 'item_sold_cobalt' | 'item_sold_scrolls' | 'prepaid_card_redeemed_cobalt' | 'item_sold_dungeons';

/**
 * The body of the request to get the order statistics
 * @export
 */
export type OrderStatisticsRequest = {
    /**
     * 
     * @type {Array<OrderStatistic>}
     * @memberof OrderStatisticsRequest
     */
    metricKeys: Array<OrderStatistic>;
}


/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 * @export
 */
export type OrderStatisticsResponse = {
    /**
     * total amount sold
     * @type {number}
     * @memberof OrderStatisticsResponse
     */
    total: number;
    /**
     * total sold in last 24 hours
     * @type {number}
     * @memberof OrderStatisticsResponse
     */
    last24h: number;
    /**
     * decimal average sales per second
     * @type {number}
     * @memberof OrderStatisticsResponse
     */
    saleVelocityPerSeconds: number;
}


/**
 * A security question answer given by the player using the id given by Mojang
 * @export
 */
export type SecurityAnswer = {
}


/**
 * A security question answer id given by Mojang
 * @export
 */
export type SecurityAnswerId = {
    /**
     * A number giver by Mojang to reply a question
     * @type {number}
     * @memberof SecurityAnswerId
     */
    id: number;
}


/**
 * Binds a question to an answer id, the answer must respect the answer id.
 * @export
 */
export type SecurityChallenge = {
    /**
     * 
     * @type {SecurityQuestion}
     * @memberof SecurityChallenge
     */
    question: SecurityQuestion;
    /**
     * 
     * @type {SecurityAnswerId}
     * @memberof SecurityChallenge
     */
    answer: SecurityAnswerId;
}


/**
 * A security question requested by Mojang
 * @export
 */
export type SecurityQuestion = {
    /**
     * The possible IDs are these:   1  What is your favorite pet's name?   2  What is your favorite movie?   3  What is your favorite author's last name?   4  What is your favorite artist's last name?   5  What is your favorite actor's last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend's first name?   12 What is your favorite cousin's name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother's middle name?   16 What is your father's middle name?   17 What is your oldest sibling's middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother's first name?   32 What is your grandfather's first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?
     * @type {number}
     * @memberof SecurityQuestion
     */
    id: number;
    /**
     * The question itself
     * @type {string}
     * @memberof SecurityQuestion
     */
    question: string;
}


/**
 * Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
 * @export
 * @enum {string}
 */
export type SkinModel = '' | 'slim';



/**
 * MiscellaneousApi - fetch parameter creator
 * @export
 */
export const MiscellaneousApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Get statistics on the sales of Minecraft.
         * @throws {RequiredError}
         */
        getOrdersStatistics(orderStatisticsRequest: OrderStatisticsRequest, options: RequestOptions): FetchArgs {
            // verify required parameter 'orderStatisticsRequest' is not null or undefined
            if (orderStatisticsRequest === null || orderStatisticsRequest === undefined) {
                throw new RequiredError('orderStatisticsRequest','Required parameter orderStatisticsRequest was null or undefined when calling getOrdersStatistics.');
            }
            const localVarPath = `/orders/statistics`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            // authentication MojangStatisticsToken required
            // http basic authentication required
            if (configuration && (configuration.username || configuration.password)) {
                localVarHeaderParameter["Authorization"] = "Basic " + btoa(configuration.username + ":" + configuration.password);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof orderStatisticsRequest !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(orderStatisticsRequest || {}) : (((orderStatisticsRequest:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type MiscellaneousApiType = { 
    getOrdersStatistics(orderStatisticsRequest: OrderStatisticsRequest, options?: RequestOptions): Promise<OrderStatisticsResponse>,
}

/**
 * MiscellaneousApi - factory function to inject configuration 
 * @export
 */
export const MiscellaneousApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): MiscellaneousApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * 
         * @summary Get statistics on the sales of Minecraft.
         * @throws {RequiredError}
         */
        getOrdersStatistics(orderStatisticsRequest: OrderStatisticsRequest, options?: RequestOptions = {}): Promise<OrderStatisticsResponse> {
            const localVarFetchArgs = MiscellaneousApiFetchParamCreator(configuration).getOrdersStatistics(orderStatisticsRequest, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * NameHistoryApi - fetch parameter creator
 * @export
 */
export const NameHistoryApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
         * @summary Find the current UUID of multiple players at once
         * @throws {RequiredError}
         */
        findUniqueIdsByName(requestBody: Array<string>, options: RequestOptions): FetchArgs {
            // verify required parameter 'requestBody' is not null or undefined
            if (requestBody === null || requestBody === undefined) {
                throw new RequiredError('requestBody','Required parameter requestBody was null or undefined when calling findUniqueIdsByName.');
            }
            const localVarPath = `/profiles/minecraft`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof requestBody !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(requestBody || {}) : (((requestBody:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Gets the full player's name history
         * @throws {RequiredError}
         */
        getNameHistory(strippedUuid: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'strippedUuid' is not null or undefined
            if (strippedUuid === null || strippedUuid === undefined) {
                throw new RequiredError('strippedUuid','Required parameter strippedUuid was null or undefined when calling getNameHistory.');
            }
            const localVarPath = `/user/profiles/{stripped_uuid}/names`
                .replace(`{${"stripped_uuid"}}`, encodeURIComponent(String(strippedUuid)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
         * @summary Find the UUID by name
         * @throws {RequiredError}
         */
        getUniqueIdByName(username: string, at?: number, options: RequestOptions): FetchArgs {
            // verify required parameter 'username' is not null or undefined
            if (username === null || username === undefined) {
                throw new RequiredError('username','Required parameter username was null or undefined when calling getUniqueIdByName.');
            }
            const localVarPath = `/users/profiles/minecraft/{username}`
                .replace(`{${"username"}}`, encodeURIComponent(String(username)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (at !== undefined) {
                localVarQueryParameter['at'] = ((at:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type NameHistoryApiType = { 
    findUniqueIdsByName(requestBody: Array<string>, options?: RequestOptions): Promise<Array<CurrentPlayerIDs>>,

    getNameHistory(strippedUuid: string, options?: RequestOptions): Promise<Array<NameChange>>,

    getUniqueIdByName(username: string, at?: number, options?: RequestOptions): Promise<CurrentPlayerIDs>,
}

/**
 * NameHistoryApi - factory function to inject configuration 
 * @export
 */
export const NameHistoryApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): NameHistoryApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
         * @summary Find the current UUID of multiple players at once
         * @throws {RequiredError}
         */
        findUniqueIdsByName(requestBody: Array<string>, options?: RequestOptions = {}): Promise<Array<CurrentPlayerIDs>> {
            const localVarFetchArgs = NameHistoryApiFetchParamCreator(configuration).findUniqueIdsByName(requestBody, options);
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
         * @summary Gets the full player's name history
         * @throws {RequiredError}
         */
        getNameHistory(strippedUuid: string, options?: RequestOptions = {}): Promise<Array<NameChange>> {
            const localVarFetchArgs = NameHistoryApiFetchParamCreator(configuration).getNameHistory(strippedUuid, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
         * @summary Find the UUID by name
         * @throws {RequiredError}
         */
        getUniqueIdByName(username: string, at?: number, options?: RequestOptions = {}): Promise<CurrentPlayerIDs> {
            const localVarFetchArgs = NameHistoryApiFetchParamCreator(configuration).getUniqueIdByName(username, at, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};

/**
 * SecurityQuestionAnswerApi - fetch parameter creator
 * @export
 */
export const SecurityQuestionAnswerApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Check if security questions are needed
         * @throws {RequiredError}
         */
        checkSecurityStatus(options: RequestOptions): FetchArgs {
            const localVarPath = `/user/security/location`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            // authentication PlayerAccessToken required
            // http basic authentication required
            if (configuration && (configuration.username || configuration.password)) {
                localVarHeaderParameter["Authorization"] = "Basic " + btoa(configuration.username + ":" + configuration.password);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Get list of questions
         * @throws {RequiredError}
         */
        listPendingSecurityQuestions(options: RequestOptions): FetchArgs {
            const localVarPath = `/user/security/challenges`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            // authentication PlayerAccessToken required
            // http basic authentication required
            if (configuration && (configuration.username || configuration.password)) {
                localVarHeaderParameter["Authorization"] = "Basic " + btoa(configuration.username + ":" + configuration.password);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Send back the answers
         * @throws {RequiredError}
         */
        sendSecurityQuestionAnswers(securityAnswer: Array<SecurityAnswer>, options: RequestOptions): FetchArgs {
            // verify required parameter 'securityAnswer' is not null or undefined
            if (securityAnswer === null || securityAnswer === undefined) {
                throw new RequiredError('securityAnswer','Required parameter securityAnswer was null or undefined when calling sendSecurityQuestionAnswers.');
            }
            const localVarPath = `/user/security/location`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            // authentication PlayerAccessToken required
            // http basic authentication required
            if (configuration && (configuration.username || configuration.password)) {
                localVarHeaderParameter["Authorization"] = "Basic " + btoa(configuration.username + ":" + configuration.password);
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (typeof securityAnswer !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(securityAnswer || {}) : (((securityAnswer:any):string) || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type SecurityQuestionAnswerApiType = { 
    checkSecurityStatus(options?: RequestOptions): Promise<Response>,

    listPendingSecurityQuestions(options?: RequestOptions): Promise<Array<SecurityChallenge>>,

    sendSecurityQuestionAnswers(securityAnswer: Array<SecurityAnswer>, options?: RequestOptions): Promise<Response>,
}

/**
 * SecurityQuestionAnswerApi - factory function to inject configuration 
 * @export
 */
export const SecurityQuestionAnswerApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): SecurityQuestionAnswerApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * 
         * @summary Check if security questions are needed
         * @throws {RequiredError}
         */
        checkSecurityStatus(options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = SecurityQuestionAnswerApiFetchParamCreator(configuration).checkSecurityStatus(options);
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
         * @summary Get list of questions
         * @throws {RequiredError}
         */
        listPendingSecurityQuestions(options?: RequestOptions = {}): Promise<Array<SecurityChallenge>> {
            const localVarFetchArgs = SecurityQuestionAnswerApiFetchParamCreator(configuration).listPendingSecurityQuestions(options);
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
         * @summary Send back the answers
         * @throws {RequiredError}
         */
        sendSecurityQuestionAnswers(securityAnswer: Array<SecurityAnswer>, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = SecurityQuestionAnswerApiFetchParamCreator(configuration).sendSecurityQuestionAnswers(securityAnswer, options);
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

/**
 * SkinOperationsApi - fetch parameter creator
 * @export
 */
export const SkinOperationsApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
         * @summary Changes the player skin by URL
         * @throws {RequiredError}
         */
        changePlayerSkin(strippedUuid: string, url: string, model?: SkinModel, options: RequestOptions): FetchArgs {
            // verify required parameter 'strippedUuid' is not null or undefined
            if (strippedUuid === null || strippedUuid === undefined) {
                throw new RequiredError('strippedUuid','Required parameter strippedUuid was null or undefined when calling changePlayerSkin.');
            }
            // verify required parameter 'url' is not null or undefined
            if (url === null || url === undefined) {
                throw new RequiredError('url','Required parameter url was null or undefined when calling changePlayerSkin.');
            }
            const localVarPath = `/user/profile/{stripped_uuid}/skin`
                .replace(`{${"stripped_uuid"}}`, encodeURIComponent(String(strippedUuid)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'POST' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            const localVarFormParams = new FormData();

            // authentication PlayerAccessToken required
            // http basic authentication required
            if (configuration && (configuration.username || configuration.password)) {
                localVarHeaderParameter["Authorization"] = "Basic " + btoa(configuration.username + ":" + configuration.password);
            }

            if (model !== undefined) {
                localVarFormParams.set('model', ((model:any):string));
            }

            if (url !== undefined) {
                localVarFormParams.set('url', ((url:any):string));
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            localVarRequestOptions.body = localVarFormParams;

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Resets the player skin to default
         * @throws {RequiredError}
         */
        resetPlayerSkin(strippedUuid: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'strippedUuid' is not null or undefined
            if (strippedUuid === null || strippedUuid === undefined) {
                throw new RequiredError('strippedUuid','Required parameter strippedUuid was null or undefined when calling resetPlayerSkin.');
            }
            const localVarPath = `/user/profile/{stripped_uuid}/skin`
                .replace(`{${"stripped_uuid"}}`, encodeURIComponent(String(strippedUuid)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'DELETE' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            // authentication PlayerAccessToken required
            // http basic authentication required
            if (configuration && (configuration.username || configuration.password)) {
                localVarHeaderParameter["Authorization"] = "Basic " + btoa(configuration.username + ":" + configuration.password);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
         * @summary Changes the player skin by upload
         * @throws {RequiredError}
         */
        uploadPlayerSkin(strippedUuid: string, file: any, model?: SkinModel, options: RequestOptions): FetchArgs {
            // verify required parameter 'strippedUuid' is not null or undefined
            if (strippedUuid === null || strippedUuid === undefined) {
                throw new RequiredError('strippedUuid','Required parameter strippedUuid was null or undefined when calling uploadPlayerSkin.');
            }
            // verify required parameter 'file' is not null or undefined
            if (file === null || file === undefined) {
                throw new RequiredError('file','Required parameter file was null or undefined when calling uploadPlayerSkin.');
            }
            const localVarPath = `/user/profile/{stripped_uuid}/skin`
                .replace(`{${"stripped_uuid"}}`, encodeURIComponent(String(strippedUuid)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'PUT' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            const localVarFormParams = new FormData();

            // authentication PlayerAccessToken required
            // http basic authentication required
            if (configuration && (configuration.username || configuration.password)) {
                localVarHeaderParameter["Authorization"] = "Basic " + btoa(configuration.username + ":" + configuration.password);
            }

            if (model !== undefined) {
                localVarFormParams.set('model', ((model:any):string));
            }

            if (file !== undefined) {
                localVarFormParams.set('file', ((file:any):string));
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            localVarRequestOptions.body = localVarFormParams;

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type SkinOperationsApiType = { 
    changePlayerSkin(strippedUuid: string, url: string, model?: SkinModel, options?: RequestOptions): Promise<Response>,

    resetPlayerSkin(strippedUuid: string, options?: RequestOptions): Promise<Response>,

    uploadPlayerSkin(strippedUuid: string, file: any, model?: SkinModel, options?: RequestOptions): Promise<Response>,
}

/**
 * SkinOperationsApi - factory function to inject configuration 
 * @export
 */
export const SkinOperationsApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): SkinOperationsApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
         * @summary Changes the player skin by URL
         * @throws {RequiredError}
         */
        changePlayerSkin(strippedUuid: string, url: string, model?: SkinModel, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = SkinOperationsApiFetchParamCreator(configuration).changePlayerSkin(strippedUuid, url, model, options);
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
         * @summary Resets the player skin to default
         * @throws {RequiredError}
         */
        resetPlayerSkin(strippedUuid: string, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = SkinOperationsApiFetchParamCreator(configuration).resetPlayerSkin(strippedUuid, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response;
                } else {
                    throw response;
                }
            });
        },
        /**
         * This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
         * @summary Changes the player skin by upload
         * @throws {RequiredError}
         */
        uploadPlayerSkin(strippedUuid: string, file: any, model?: SkinModel, options?: RequestOptions = {}): Promise<Response> {
            const localVarFetchArgs = SkinOperationsApiFetchParamCreator(configuration).uploadPlayerSkin(strippedUuid, file, model, options);
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
    MiscellaneousApi: MiscellaneousApiType,

    NameHistoryApi: NameHistoryApiType,

    SecurityQuestionAnswerApi: SecurityQuestionAnswerApiType,

    SkinOperationsApi: SkinOperationsApiType,
 }
