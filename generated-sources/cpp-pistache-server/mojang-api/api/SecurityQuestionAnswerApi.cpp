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

#include "SecurityQuestionAnswerApi.h"
#include "Helpers.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace pistache {
namespace server {
namespace api {

using namespace org::openapitools::server::helpers;
using namespace com::github::asyncmc::mojang::api::cpp::pistache::server::model;

SecurityQuestionAnswerApi::SecurityQuestionAnswerApi(std::shared_ptr<Pistache::Rest::Router> rtr) { 
    router = rtr;
};

void SecurityQuestionAnswerApi::init() {
    setupRoutes();
}

void SecurityQuestionAnswerApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/user/security/location", Routes::bind(&SecurityQuestionAnswerApi::check_security_status_handler, this));
    Routes::Get(*router, base + "/user/security/challenges", Routes::bind(&SecurityQuestionAnswerApi::list_pending_security_questions_handler, this));
    Routes::Post(*router, base + "/user/security/location", Routes::bind(&SecurityQuestionAnswerApi::send_security_question_answers_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&SecurityQuestionAnswerApi::security_question_answer_api_default_handler, this));
}

void SecurityQuestionAnswerApi::check_security_status_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    try {
      this->check_security_status(response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void SecurityQuestionAnswerApi::list_pending_security_questions_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    try {
      this->list_pending_security_questions(response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void SecurityQuestionAnswerApi::send_security_question_answers_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    std::vector<SecurityAnswer> securityAnswer;
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
      securityAnswer =   ArrayHelper::fromJson<SecurityAnswer>(request_body);
      this->send_security_question_answers(securityAnswer, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}

void SecurityQuestionAnswerApi::security_question_answer_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

}
}
}
}
}
}
}
}
}

