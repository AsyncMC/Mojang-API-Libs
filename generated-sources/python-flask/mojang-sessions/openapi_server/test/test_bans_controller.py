# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestBansController(BaseTestCase):
    """BansController integration test stubs"""

    def test_get_blocked_server_hashes(self):
        """Test case for get_blocked_server_hashes

        A list of SHA1 hashes of banned servers
        """
        response = self.client.open(
            '/blockedservers',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
