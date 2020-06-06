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
from openapi_client.api.security_question_answer_api import SecurityQuestionAnswerApi  # noqa: E501
from openapi_client.rest import ApiException


class TestSecurityQuestionAnswerApi(unittest.TestCase):
    """SecurityQuestionAnswerApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.security_question_answer_api.SecurityQuestionAnswerApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_check_security_status(self):
        """Test case for check_security_status

        Check if security questions are needed  # noqa: E501
        """
        pass

    def test_list_pending_security_questions(self):
        """Test case for list_pending_security_questions

        Get list of questions  # noqa: E501
        """
        pass

    def test_send_security_question_answers(self):
        """Test case for send_security_question_answers

        Send back the answers  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
