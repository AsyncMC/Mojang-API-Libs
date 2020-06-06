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

use_ok('WWW::OpenAPIClient::NameHistoryApi');

my $api = WWW::OpenAPIClient::NameHistoryApi->new();
isa_ok($api, 'WWW::OpenAPIClient::NameHistoryApi');

#
# find_unique_ids_by_name test
#
{
    my $request_body = undef; # replace NULL with a proper value
    my $result = $api->find_unique_ids_by_name(request_body => $request_body);
}

#
# get_name_history test
#
{
    my $stripped_uuid = undef; # replace NULL with a proper value
    my $result = $api->get_name_history(stripped_uuid => $stripped_uuid);
}

#
# get_unique_id_by_name test
#
{
    my $username = undef; # replace NULL with a proper value
    my $at = undef; # replace NULL with a proper value
    my $result = $api->get_unique_id_by_name(username => $username, at => $at);
}


1;
