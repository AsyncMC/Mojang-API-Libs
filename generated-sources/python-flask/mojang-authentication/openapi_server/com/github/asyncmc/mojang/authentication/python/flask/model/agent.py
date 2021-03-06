# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.authentication.python.flask.model.base_model_ import Model
from openapi_server import util


class Agent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name='Minecraft', version=1):  # noqa: E501
        """Agent - a model defined in OpenAPI

        :param name: The name of this Agent.  # noqa: E501
        :type name: str
        :param version: The version of this Agent.  # noqa: E501
        :type version: int
        """
        self.openapi_types = {
            'name': str,
            'version': int
        }

        self.attribute_map = {
            'name': 'name',
            'version': 'version'
        }

        self._name = name
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'Agent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Agent of this Agent.  # noqa: E501
        :rtype: Agent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this Agent.

        The name of the game  # noqa: E501

        :return: The name of this Agent.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Agent.

        The name of the game  # noqa: E501

        :param name: The name of this Agent.
        :type name: str
        """
        allowed_values = ["Minecraft", "Scrolls"]  # noqa: E501
        if name not in allowed_values:
            raise ValueError(
                "Invalid value for `name` ({0}), must be one of {1}"
                .format(name, allowed_values)
            )

        self._name = name

    @property
    def version(self):
        """Gets the version of this Agent.

        The agent version, usually 1.  # noqa: E501

        :return: The version of this Agent.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """Sets the version of this Agent.

        The agent version, usually 1.  # noqa: E501

        :param version: The version of this Agent.
        :type version: int
        """

        self._version = version
