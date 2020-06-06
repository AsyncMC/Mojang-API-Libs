# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.base_model_ import Model
from openapi_server import util


class OrderStatisticsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total=None, last24h=None, sale_velocity_per_seconds=None):  # noqa: E501
        """OrderStatisticsResponse - a model defined in OpenAPI

        :param total: The total of this OrderStatisticsResponse.  # noqa: E501
        :type total: int
        :param last24h: The last24h of this OrderStatisticsResponse.  # noqa: E501
        :type last24h: int
        :param sale_velocity_per_seconds: The sale_velocity_per_seconds of this OrderStatisticsResponse.  # noqa: E501
        :type sale_velocity_per_seconds: float
        """
        self.openapi_types = {
            'total': int,
            'last24h': int,
            'sale_velocity_per_seconds': float
        }

        self.attribute_map = {
            'total': 'total',
            'last24h': 'last24h',
            'sale_velocity_per_seconds': 'saleVelocityPerSeconds'
        }

        self._total = total
        self._last24h = last24h
        self._sale_velocity_per_seconds = sale_velocity_per_seconds

    @classmethod
    def from_dict(cls, dikt) -> 'OrderStatisticsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderStatisticsResponse of this OrderStatisticsResponse.  # noqa: E501
        :rtype: OrderStatisticsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total(self):
        """Gets the total of this OrderStatisticsResponse.

        total amount sold  # noqa: E501

        :return: The total of this OrderStatisticsResponse.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total):
        """Sets the total of this OrderStatisticsResponse.

        total amount sold  # noqa: E501

        :param total: The total of this OrderStatisticsResponse.
        :type total: int
        """
        if total is None:
            raise ValueError("Invalid value for `total`, must not be `None`")  # noqa: E501

        self._total = total

    @property
    def last24h(self):
        """Gets the last24h of this OrderStatisticsResponse.

        total sold in last 24 hours  # noqa: E501

        :return: The last24h of this OrderStatisticsResponse.
        :rtype: int
        """
        return self._last24h

    @last24h.setter
    def last24h(self, last24h):
        """Sets the last24h of this OrderStatisticsResponse.

        total sold in last 24 hours  # noqa: E501

        :param last24h: The last24h of this OrderStatisticsResponse.
        :type last24h: int
        """
        if last24h is None:
            raise ValueError("Invalid value for `last24h`, must not be `None`")  # noqa: E501

        self._last24h = last24h

    @property
    def sale_velocity_per_seconds(self):
        """Gets the sale_velocity_per_seconds of this OrderStatisticsResponse.

        decimal average sales per second  # noqa: E501

        :return: The sale_velocity_per_seconds of this OrderStatisticsResponse.
        :rtype: float
        """
        return self._sale_velocity_per_seconds

    @sale_velocity_per_seconds.setter
    def sale_velocity_per_seconds(self, sale_velocity_per_seconds):
        """Sets the sale_velocity_per_seconds of this OrderStatisticsResponse.

        decimal average sales per second  # noqa: E501

        :param sale_velocity_per_seconds: The sale_velocity_per_seconds of this OrderStatisticsResponse.
        :type sale_velocity_per_seconds: float
        """
        if sale_velocity_per_seconds is None:
            raise ValueError("Invalid value for `sale_velocity_per_seconds`, must not be `None`")  # noqa: E501

        self._sale_velocity_per_seconds = sale_velocity_per_seconds