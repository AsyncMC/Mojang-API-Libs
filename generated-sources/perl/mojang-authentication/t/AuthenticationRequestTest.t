=begin comment

Mojang Authentication API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by the OpenAPI Generator
# Please update the test cases below to test the model.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 2;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;


use_ok('WWW::OpenAPIClient::Object::AuthenticationRequest');

my $instance = WWW::OpenAPIClient::Object::AuthenticationRequest->new();

isa_ok($instance, 'WWW::OpenAPIClient::Object::AuthenticationRequest');

