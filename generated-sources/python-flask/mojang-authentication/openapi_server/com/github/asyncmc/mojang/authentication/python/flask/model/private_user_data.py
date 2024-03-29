# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.authentication.python.flask.model.base_model_ import Model
from openapi_server import util


class PrivateUserData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, properties=None):  # noqa: E501
        """PrivateUserData - a model defined in OpenAPI

        :param id: The id of this PrivateUserData.  # noqa: E501
        :type id: str
        :param properties: The properties of this PrivateUserData.  # noqa: E501
        :type properties: List[GameProfileProperty]
        """
        self.openapi_types = {
            'id': str,
            'properties': List[GameProfileProperty]
        }

        self.attribute_map = {
            'id': 'id',
            'properties': 'properties'
        }

        self._id = id
        self._properties = properties

    @classmethod
    def from_dict(cls, dikt) -> 'PrivateUserData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PrivateUserData of this PrivateUserData.  # noqa: E501
        :rtype: PrivateUserData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this PrivateUserData.


        :return: The id of this PrivateUserData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PrivateUserData.


        :param id: The id of this PrivateUserData.
        :type id: str
        """

        self._id = id

    @property
    def properties(self):
        """Gets the properties of this PrivateUserData.


        :return: The properties of this PrivateUserData.
        :rtype: List[GameProfileProperty]
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this PrivateUserData.


        :param properties: The properties of this PrivateUserData.
        :type properties: List[GameProfileProperty]
        """

        self._properties = properties
