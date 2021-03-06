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

use_ok('WWW::OpenAPIClient::MiscellaneousApi');

my $api = WWW::OpenAPIClient::MiscellaneousApi->new();
isa_ok($api, 'WWW::OpenAPIClient::MiscellaneousApi');

#
# get_orders_statistics test
#
{
    my $order_statistics_request = undef; # replace NULL with a proper value
    my $result = $api->get_orders_statistics(order_statistics_request => $order_statistics_request);
}


1;
