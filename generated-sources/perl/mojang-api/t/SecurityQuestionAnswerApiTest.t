=begin comment

Mojang API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::SecurityQuestionAnswerApi');

my $api = WWW::OpenAPIClient::SecurityQuestionAnswerApi->new();
isa_ok($api, 'WWW::OpenAPIClient::SecurityQuestionAnswerApi');

#
# check_security_status test
#
{
    my $result = $api->check_security_status();
}

#
# list_pending_security_questions test
#
{
    my $result = $api->list_pending_security_questions();
}

#
# send_security_question_answers test
#
{
    my $security_answer = undef; # replace NULL with a proper value
    my $result = $api->send_security_question_answers(security_answer => $security_answer);
}


1;