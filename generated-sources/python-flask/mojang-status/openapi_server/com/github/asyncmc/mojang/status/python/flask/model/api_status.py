# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.status.python.flask.model.base_model_ import Model
from openapi_server import util


class ApiStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    GREEN = "green"
    YELLOW = "yellow"
    RED = "red"

    def __init__(self):  # noqa: E501
        """ApiStatus - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ApiStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ApiStatus of this ApiStatus.  # noqa: E501
        :rtype: ApiStatus
        """
        return util.deserialize_model(dikt, cls)