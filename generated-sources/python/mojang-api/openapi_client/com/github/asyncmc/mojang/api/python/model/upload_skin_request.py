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


class UploadSkinRequest(object):
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
        'model': 'SkinModel',
        'file': 'file'
    }

    attribute_map = {
        'model': 'model',
        'file': 'file'
    }

    def __init__(self, model=None, file=None):  # noqa: E501
        """UploadSkinRequest - a model defined in OpenAPI"""  # noqa: E501

        self._model = None
        self._file = None
        self.discriminator = None

        if model is not None:
            self.model = model
        self.file = file

    @property
    def model(self):
        """Gets the model of this UploadSkinRequest.  # noqa: E501


        :return: The model of this UploadSkinRequest.  # noqa: E501
        :rtype: SkinModel
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this UploadSkinRequest.


        :param model: The model of this UploadSkinRequest.  # noqa: E501
        :type: SkinModel
        """

        self._model = model

    @property
    def file(self):
        """Gets the file of this UploadSkinRequest.  # noqa: E501

        The skin image in PNG format  # noqa: E501

        :return: The file of this UploadSkinRequest.  # noqa: E501
        :rtype: file
        """
        return self._file

    @file.setter
    def file(self, file):
        """Sets the file of this UploadSkinRequest.

        The skin image in PNG format  # noqa: E501

        :param file: The file of this UploadSkinRequest.  # noqa: E501
        :type: file
        """
        if file is None:
            raise ValueError("Invalid value for `file`, must not be `None`")  # noqa: E501

        self._file = file

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
        if not isinstance(other, UploadSkinRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
