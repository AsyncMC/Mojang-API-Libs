# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.access_keys import AccessKeys  # noqa: E501
from openapi_server.models.authentication import Authentication  # noqa: E501
from openapi_server.models.authentication_request import AuthenticationRequest  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.refresh_request import RefreshRequest  # noqa: E501
from openapi_server.models.refresh_response import RefreshResponse  # noqa: E501
from openapi_server.models.username_password import UsernamePassword  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_authenticate(self):
        """Test case for authenticate

        
        """
        authentication_request = AuthenticationRequest()
        response = self.client.open(
            '/authenticate',
            method='POST',
            data=json.dumps(authentication_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_invalidate(self):
        """Test case for invalidate

        
        """
        access_keys = AccessKeys()
        response = self.client.open(
            '/invalidate',
            method='POST',
            data=json.dumps(access_keys),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_refresh(self):
        """Test case for refresh

        
        """
        refresh_request = RefreshRequest()
        response = self.client.open(
            '/refresh',
            method='POST',
            data=json.dumps(refresh_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_siginout(self):
        """Test case for siginout

        
        """
        username_password = UsernamePassword()
        response = self.client.open(
            '/signout',
            method='POST',
            data=json.dumps(username_password),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_validate(self):
        """Test case for validate

        
        """
        access_keys = AccessKeys()
        response = self.client.open(
            '/validate',
            method='POST',
            data=json.dumps(access_keys),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
