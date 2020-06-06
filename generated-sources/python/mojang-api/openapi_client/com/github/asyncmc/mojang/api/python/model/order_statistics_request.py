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


class OrderStatisticsRequest(object):
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
        'metric_keys': 'list[OrderStatistic]'
    }

    attribute_map = {
        'metric_keys': 'metricKeys'
    }

    def __init__(self, metric_keys=None):  # noqa: E501
        """OrderStatisticsRequest - a model defined in OpenAPI"""  # noqa: E501

        self._metric_keys = None
        self.discriminator = None

        self.metric_keys = metric_keys

    @property
    def metric_keys(self):
        """Gets the metric_keys of this OrderStatisticsRequest.  # noqa: E501


        :return: The metric_keys of this OrderStatisticsRequest.  # noqa: E501
        :rtype: list[OrderStatistic]
        """
        return self._metric_keys

    @metric_keys.setter
    def metric_keys(self, metric_keys):
        """Sets the metric_keys of this OrderStatisticsRequest.


        :param metric_keys: The metric_keys of this OrderStatisticsRequest.  # noqa: E501
        :type: list[OrderStatistic]
        """
        if metric_keys is None:
            raise ValueError("Invalid value for `metric_keys`, must not be `None`")  # noqa: E501

        self._metric_keys = metric_keys

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
        if not isinstance(other, OrderStatisticsRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other