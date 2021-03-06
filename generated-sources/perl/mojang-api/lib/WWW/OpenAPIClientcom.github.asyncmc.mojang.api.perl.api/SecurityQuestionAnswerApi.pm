=begin comment

Mojang API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::SecurityQuestionAnswerApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# check_security_status
#
# Check if security questions are needed
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'check_security_status' } = { 
    	summary => 'Check if security questions are needed',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub check_security_status {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/user/security/location';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(PlayerAccessToken )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# list_pending_security_questions
#
# Get list of questions
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'list_pending_security_questions' } = { 
    	summary => 'Get list of questions',
        params => $params,
        returns => 'ARRAY[SecurityChallenge]',
        };
}
# @return ARRAY[SecurityChallenge]
#
sub list_pending_security_questions {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/user/security/challenges';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(PlayerAccessToken )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[SecurityChallenge]', $response);
    return $_response_object;
}

#
# send_security_question_answers
#
# Send back the answers
# 
# @param ARRAY[SecurityAnswer] $security_answer An array with all the answers (required)
{
    my $params = {
    'security_answer' => {
        data_type => 'ARRAY[SecurityAnswer]',
        description => 'An array with all the answers',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'send_security_question_answers' } = { 
    	summary => 'Send back the answers',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub send_security_question_answers {
    my ($self, %args) = @_;

    # verify the required parameter 'security_answer' is set
    unless (exists $args{'security_answer'}) {
      croak("Missing the required parameter 'security_answer' when calling send_security_question_answers");
    }

    # parse inputs
    my $_resource_path = '/user/security/location';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    my $_body_data;
    # body params
    if ( exists $args{'security_answer'}) {
        $_body_data = $args{'security_answer'};
    }

    # authentication setting, if any
    my $auth_settings = [qw(PlayerAccessToken )];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

1;
