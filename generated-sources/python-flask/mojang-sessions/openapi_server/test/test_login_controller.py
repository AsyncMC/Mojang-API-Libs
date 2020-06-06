# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.player_profile import PlayerProfile  # noqa: E501
from openapi_server.models.session_api_error import SessionApiError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLoginController(BaseTestCase):
    """LoginController integration test stubs"""

    def test_get_player_profile(self):
        """Test case for get_player_profile

        Gets the player's game profile
        """
        query_string = [('unsigned', True)]
        response = self.client.open(
            '/session/minecraft/profile/{stripped_uuid}'.format(stripped_uuid=853c80ef3c3749fdaa49938b674adae6),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
