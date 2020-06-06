require 'json'


MyApp.add_route('GET', '/user/security/location', {
  "resourcePath" => "/SecurityQuestionAnswer",
  "summary" => "Check if security questions are needed",
  "nickname" => "check_security_status", 
  "responseClass" => "void",
  "endpoint" => "/user/security/location", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/security/challenges', {
  "resourcePath" => "/SecurityQuestionAnswer",
  "summary" => "Get list of questions",
  "nickname" => "list_pending_security_questions", 
  "responseClass" => "Array<SecurityChallenge>",
  "endpoint" => "/user/security/challenges", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/security/location', {
  "resourcePath" => "/SecurityQuestionAnswer",
  "summary" => "Send back the answers",
  "nickname" => "send_security_question_answers", 
  "responseClass" => "void",
  "endpoint" => "/user/security/location", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "An array with all the answers",
      "dataType" => "Array<SecurityAnswer>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

