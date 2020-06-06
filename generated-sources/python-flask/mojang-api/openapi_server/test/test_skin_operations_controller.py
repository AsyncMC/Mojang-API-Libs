# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.skin_model import SkinModel  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSkinOperationsController(BaseTestCase):
    """SkinOperationsController integration test stubs"""

    def test_change_player_skin(self):
        """Test case for change_player_skin

        Changes the player skin by URL
        """
        data = dict(model=SkinModel(),
                    url='url_example')
        response = self.client.open(
            '/user/profile/{stripped_uuid}/skin'.format(stripped_uuid=38ba542eb5924231a54cca0f2eac2b54),
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_player_skin(self):
        """Test case for reset_player_skin

        Resets the player skin to default
        """
        response = self.client.open(
            '/user/profile/{stripped_uuid}/skin'.format(stripped_uuid=38ba542eb5924231a54cca0f2eac2b54),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_upload_player_skin(self):
        """Test case for upload_player_skin

        Changes the player skin by upload
        """
        data = dict(model=SkinModel(),
                    file=(BytesIO(b'some file data'), 'file.txt'))
        response = self.client.open(
            '/user/profile/{stripped_uuid}/skin'.format(stripped_uuid=38ba542eb5924231a54cca0f2eac2b54),
            method='PUT',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
