# coding: utf-8

"""
    Mojang API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 2020-06-05
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from com.github.asyncmc.mojang.status.python.api.default_api import DefaultApi  # noqa: E501
from openapi_client.rest import ApiException


class TestDefaultApi(unittest.TestCase):
    """DefaultApi unit test stubs"""

    def setUp(self):
        self.api = com.github.asyncmc.mojang.status.python.api.default_api.DefaultApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_check_statuses(self):
        """Test case for check_statuses

        Checks the Mojang service statuses  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
