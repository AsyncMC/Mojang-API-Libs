# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.authentication.python.flask.model.base_model_ import Model
from openapi_server import util


class ReducedUserData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, properties=None):  # noqa: E501
        """ReducedUserData - a model defined in OpenAPI

        :param id: The id of this ReducedUserData.  # noqa: E501
        :type id: str
        :param properties: The properties of this ReducedUserData.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'ReducedUserData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReducedUserData of this ReducedUserData.  # noqa: E501
        :rtype: ReducedUserData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this ReducedUserData.


        :return: The id of this ReducedUserData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ReducedUserData.


        :param id: The id of this ReducedUserData.
        :type id: str
        """

        self._id = id

    @property
    def properties(self):
        """Gets the properties of this ReducedUserData.


        :return: The properties of this ReducedUserData.
        :rtype: List[GameProfileProperty]
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this ReducedUserData.


        :param properties: The properties of this ReducedUserData.
        :type properties: List[GameProfileProperty]
        """

        self._properties = properties
