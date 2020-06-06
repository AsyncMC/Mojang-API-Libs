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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAISecurityQuestionAnswerApiHandler.h"
#include "OAISecurityQuestionAnswerApiRequest.h"

namespace OpenAPI {

OAISecurityQuestionAnswerApiHandler::OAISecurityQuestionAnswerApiHandler(){

}

OAISecurityQuestionAnswerApiHandler::~OAISecurityQuestionAnswerApiHandler(){

}

void OAISecurityQuestionAnswerApiHandler::checkSecurityStatus() {
    auto reqObj = qobject_cast<OAISecurityQuestionAnswerApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->checkSecurityStatusResponse();
    }    
}
void OAISecurityQuestionAnswerApiHandler::listPendingSecurityQuestions() {
    auto reqObj = qobject_cast<OAISecurityQuestionAnswerApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAISecurityChallenge> res;
        reqObj->listPendingSecurityQuestionsResponse(res);
    }    
}
void OAISecurityQuestionAnswerApiHandler::sendSecurityQuestionAnswers(QList<OAISecurityAnswer> oai_security_answer) {
    Q_UNUSED(oai_security_answer);
    auto reqObj = qobject_cast<OAISecurityQuestionAnswerApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->sendSecurityQuestionAnswersResponse();
    }    
}


}