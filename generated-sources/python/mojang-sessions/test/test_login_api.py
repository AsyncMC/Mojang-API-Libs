# coding: utf-8

"""
    Mojang Session API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 2020-06-05
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from openapi_client.api.login_api import LoginApi  # noqa: E501
from openapi_client.rest import ApiException


class TestLoginApi(unittest.TestCase):
    """LoginApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.login_api.LoginApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_player_profile(self):
        """Test case for get_player_profile

        Gets the player's game profile  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
