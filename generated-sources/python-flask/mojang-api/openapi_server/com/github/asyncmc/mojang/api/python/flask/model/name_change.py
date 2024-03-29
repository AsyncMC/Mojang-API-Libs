# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.base_model_ import Model
from openapi_server import util


class NameChange(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, changed_to_at=None):  # noqa: E501
        """NameChange - a model defined in OpenAPI

        :param name: The name of this NameChange.  # noqa: E501
        :type name: str
        :param changed_to_at: The changed_to_at of this NameChange.  # noqa: E501
        :type changed_to_at: int
        """
        self.openapi_types = {
            'name': str,
            'changed_to_at': int
        }

        self.attribute_map = {
            'name': 'name',
            'changed_to_at': 'changedToAt'
        }

        self._name = name
        self._changed_to_at = changed_to_at

    @classmethod
    def from_dict(cls, dikt) -> 'NameChange':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NameChange of this NameChange.  # noqa: E501
        :rtype: NameChange
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this NameChange.

        The new player name  # noqa: E501

        :return: The name of this NameChange.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this NameChange.

        The new player name  # noqa: E501

        :param name: The name of this NameChange.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def changed_to_at(self):
        """Gets the changed_to_at of this NameChange.

        Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.  # noqa: E501

        :return: The changed_to_at of this NameChange.
        :rtype: int
        """
        return self._changed_to_at

    @changed_to_at.setter
    def changed_to_at(self, changed_to_at):
        """Sets the changed_to_at of this NameChange.

        Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.  # noqa: E501

        :param changed_to_at: The changed_to_at of this NameChange.
        :type changed_to_at: int
        """

        self._changed_to_at = changed_to_at
