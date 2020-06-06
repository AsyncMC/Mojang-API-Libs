# coding: utf-8

"""
    Mojang API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 2020-06-05
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class CurrentPlayerIDs(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'id': 'str',
        'name': 'str',
        'legacy': 'bool',
        'demo': 'bool'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'legacy': 'legacy',
        'demo': 'demo'
    }

    def __init__(self, id=None, name=None, legacy=False, demo=False):  # noqa: E501
        """CurrentPlayerIDs - a model defined in OpenAPI"""  # noqa: E501

        self._id = None
        self._name = None
        self._legacy = None
        self._demo = None
        self.discriminator = None

        self.id = id
        self.name = name
        if legacy is not None:
            self.legacy = legacy
        if demo is not None:
            self.demo = demo

    @property
    def id(self):
        """Gets the id of this CurrentPlayerIDs.  # noqa: E501

        The player UUID without hyphens  # noqa: E501

        :return: The id of this CurrentPlayerIDs.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CurrentPlayerIDs.

        The player UUID without hyphens  # noqa: E501

        :param id: The id of this CurrentPlayerIDs.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self):
        """Gets the name of this CurrentPlayerIDs.  # noqa: E501

        The current name being used by this player  # noqa: E501

        :return: The name of this CurrentPlayerIDs.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CurrentPlayerIDs.

        The current name being used by this player  # noqa: E501

        :param name: The name of this CurrentPlayerIDs.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def legacy(self):
        """Gets the legacy of this CurrentPlayerIDs.  # noqa: E501

        If account has not been converted  # noqa: E501

        :return: The legacy of this CurrentPlayerIDs.  # noqa: E501
        :rtype: bool
        """
        return self._legacy

    @legacy.setter
    def legacy(self, legacy):
        """Sets the legacy of this CurrentPlayerIDs.

        If account has not been converted  # noqa: E501

        :param legacy: The legacy of this CurrentPlayerIDs.  # noqa: E501
        :type: bool
        """

        self._legacy = legacy

    @property
    def demo(self):
        """Gets the demo of this CurrentPlayerIDs.  # noqa: E501

        If the player has not puchased the game  # noqa: E501

        :return: The demo of this CurrentPlayerIDs.  # noqa: E501
        :rtype: bool
        """
        return self._demo

    @demo.setter
    def demo(self, demo):
        """Sets the demo of this CurrentPlayerIDs.

        If the player has not puchased the game  # noqa: E501

        :param demo: The demo of this CurrentPlayerIDs.  # noqa: E501
        :type: bool
        """

        self._demo = demo

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, CurrentPlayerIDs):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other