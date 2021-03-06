<?php

/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Mojang API
 * @version 2020-06-05
 */

$app->get('/', function () use ($app) {
    return $app->version();
});

/**
 * post getOrdersStatistics
 * Summary: Get statistics on the sales of Minecraft.
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->post('/orders/statistics', 'MiscellaneousApi@getOrdersStatistics');
/**
 * post findUniqueIdsByName
 * Summary: Find the current UUID of multiple players at once
 * Notes: Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
 * Output-Formats: [application/json]
 */
$app->post('/profiles/minecraft', 'NameHistoryApi@findUniqueIdsByName');
/**
 * get getNameHistory
 * Summary: Gets the full player&#39;s name history
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->get('/user/profiles/{stripped_uuid}/names', 'NameHistoryApi@getNameHistory');
/**
 * get getUniqueIdByName
 * Summary: Find the UUID by name
 * Notes: Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
 * Output-Formats: [application/json]
 */
$app->get('/users/profiles/minecraft/{username}', 'NameHistoryApi@getUniqueIdByName');
/**
 * get listPendingSecurityQuestions
 * Summary: Get list of questions
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->get('/user/security/challenges', 'SecurityQuestionAnswerApi@listPendingSecurityQuestions');
/**
 * get checkSecurityStatus
 * Summary: Check if security questions are needed
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->get('/user/security/location', 'SecurityQuestionAnswerApi@checkSecurityStatus');
/**
 * post sendSecurityQuestionAnswers
 * Summary: Send back the answers
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->post('/user/security/location', 'SecurityQuestionAnswerApi@sendSecurityQuestionAnswers');
/**
 * post changePlayerSkin
 * Summary: Changes the player skin by URL
 * Notes: This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
 * Output-Formats: [application/json]
 */
$app->post('/user/profile/{stripped_uuid}/skin', 'SkinOperationsApi@changePlayerSkin');
/**
 * delete resetPlayerSkin
 * Summary: Resets the player skin to default
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->delete('/user/profile/{stripped_uuid}/skin', 'SkinOperationsApi@resetPlayerSkin');
/**
 * put uploadPlayerSkin
 * Summary: Changes the player skin by upload
 * Notes: This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
 * Output-Formats: [application/json]
 */
$app->put('/user/profile/{stripped_uuid}/skin', 'SkinOperationsApi@uploadPlayerSkin');

