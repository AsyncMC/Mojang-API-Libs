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


class SessionApiError(object):
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
        'error': 'str',
        'path': 'str'
    }

    attribute_map = {
        'error': 'error',
        'path': 'path'
    }

    def __init__(self, error=None, path=None):  # noqa: E501
        """SessionApiError - a model defined in OpenAPI"""  # noqa: E501

        self._error = None
        self._path = None
        self.discriminator = None

        if error is not None:
            self.error = error
        if path is not None:
            self.path = path

    @property
    def error(self):
        """Gets the error of this SessionApiError.  # noqa: E501

        A message describing the error  # noqa: E501

        :return: The error of this SessionApiError.  # noqa: E501
        :rtype: str
        """
        return self._error

    @error.setter
    def error(self, error):
        """Sets the error of this SessionApiError.

        A message describing the error  # noqa: E501

        :param error: The error of this SessionApiError.  # noqa: E501
        :type: str
        """

        self._error = error

    @property
    def path(self):
        """Gets the path of this SessionApiError.  # noqa: E501

        The request path  # noqa: E501

        :return: The path of this SessionApiError.  # noqa: E501
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """Sets the path of this SessionApiError.

        The request path  # noqa: E501

        :param path: The path of this SessionApiError.  # noqa: E501
        :type: str
        """

        self._path = path

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
        if not isinstance(other, SessionApiError):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
