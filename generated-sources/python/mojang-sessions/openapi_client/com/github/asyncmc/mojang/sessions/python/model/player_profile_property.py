# coding: utf-8

"""
    Mojang Session API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 2020-06-05
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class PlayerProfileProperty(object):
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
        'name': 'str',
        'value': 'str',
        'signature': 'str'
    }

    attribute_map = {
        'name': 'name',
        'value': 'value',
        'signature': 'signature'
    }

    def __init__(self, name=None, value=None, signature=None):  # noqa: E501
        """PlayerProfileProperty - a model defined in OpenAPI"""  # noqa: E501

        self._name = None
        self._value = None
        self._signature = None
        self.discriminator = None

        self.name = name
        self.value = value
        if signature is not None:
            self.signature = signature

    @property
    def name(self):
        """Gets the name of this PlayerProfileProperty.  # noqa: E501

        The property name  # noqa: E501

        :return: The name of this PlayerProfileProperty.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this PlayerProfileProperty.

        The property name  # noqa: E501

        :param name: The name of this PlayerProfileProperty.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def value(self):
        """Gets the value of this PlayerProfileProperty.  # noqa: E501

        The serialized property value in base64.  # noqa: E501

        :return: The value of this PlayerProfileProperty.  # noqa: E501
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this PlayerProfileProperty.

        The serialized property value in base64.  # noqa: E501

        :param value: The value of this PlayerProfileProperty.  # noqa: E501
        :type: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

    @property
    def signature(self):
        """Gets the signature of this PlayerProfileProperty.  # noqa: E501

        signed data using Yggdrasil's private key  # noqa: E501

        :return: The signature of this PlayerProfileProperty.  # noqa: E501
        :rtype: str
        """
        return self._signature

    @signature.setter
    def signature(self, signature):
        """Sets the signature of this PlayerProfileProperty.

        signed data using Yggdrasil's private key  # noqa: E501

        :param signature: The signature of this PlayerProfileProperty.  # noqa: E501
        :type: str
        """

        self._signature = signature

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
        if not isinstance(other, PlayerProfileProperty):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
