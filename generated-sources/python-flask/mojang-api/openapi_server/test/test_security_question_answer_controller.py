# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.security_answer import SecurityAnswer  # noqa: E501
from openapi_server.models.security_challenge import SecurityChallenge  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSecurityQuestionAnswerController(BaseTestCase):
    """SecurityQuestionAnswerController integration test stubs"""

    def test_check_security_status(self):
        """Test case for check_security_status

        Check if security questions are needed
        """
        response = self.client.open(
            '/user/security/location',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_pending_security_questions(self):
        """Test case for list_pending_security_questions

        Get list of questions
        """
        response = self.client.open(
            '/user/security/challenges',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_security_question_answers(self):
        """Test case for send_security_question_answers

        Send back the answers
        """
        security_answer = None
        response = self.client.open(
            '/user/security/location',
            method='POST',
            data=json.dumps(security_answer),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
