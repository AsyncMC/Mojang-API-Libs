# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.current_player_i_ds import CurrentPlayerIDs  # noqa: E501
from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.error import Error  # noqa: E501
from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.name_change import NameChange  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNameHistoryController(BaseTestCase):
    """NameHistoryController integration test stubs"""

    def test_find_unique_ids_by_name(self):
        """Test case for find_unique_ids_by_name

        Find the current UUID of multiple players at once
        """
        request_body = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ]
        response = self.client.open(
            '/profiles/minecraft',
            method='POST',
            data=json.dumps(request_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_name_history(self):
        """Test case for get_name_history

        Gets the full player's name history
        """
        response = self.client.open(
            '/user/profiles/{stripped_uuid}/names'.format(stripped_uuid=38ba542eb5924231a54cca0f2eac2b54),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_unique_id_by_name(self):
        """Test case for get_unique_id_by_name

        Find the UUID by name
        """
        query_string = [('at', 1448533942)]
        response = self.client.open(
            '/users/profiles/minecraft/{username}'.format(username=LordofMC_Playerz),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
