# coding: utf-8

"""
    Mojang Authentication API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 2020-06-05
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class GameProfile(object):
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
        'agent': 'str',
        'id': 'str',
        'name': 'str',
        'user_id': 'str',
        'created_at': 'int',
        'legacy_profile': 'bool',
        'suspended': 'bool',
        'paid': 'bool',
        'migrated': 'bool',
        'legacy': 'bool'
    }

    attribute_map = {
        'agent': 'agent',
        'id': 'id',
        'name': 'name',
        'user_id': 'userId',
        'created_at': 'createdAt',
        'legacy_profile': 'legacyProfile',
        'suspended': 'suspended',
        'paid': 'paid',
        'migrated': 'migrated',
        'legacy': 'legacy'
    }

    def __init__(self, agent=None, id=None, name=None, user_id=None, created_at=None, legacy_profile=None, suspended=None, paid=None, migrated=None, legacy=None):  # noqa: E501
        """GameProfile - a model defined in OpenAPI"""  # noqa: E501

        self._agent = None
        self._id = None
        self._name = None
        self._user_id = None
        self._created_at = None
        self._legacy_profile = None
        self._suspended = None
        self._paid = None
        self._migrated = None
        self._legacy = None
        self.discriminator = None

        if agent is not None:
            self.agent = agent
        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if user_id is not None:
            self.user_id = user_id
        if created_at is not None:
            self.created_at = created_at
        if legacy_profile is not None:
            self.legacy_profile = legacy_profile
        if suspended is not None:
            self.suspended = suspended
        if paid is not None:
            self.paid = paid
        if migrated is not None:
            self.migrated = migrated
        if legacy is not None:
            self.legacy = legacy

    @property
    def agent(self):
        """Gets the agent of this GameProfile.  # noqa: E501


        :return: The agent of this GameProfile.  # noqa: E501
        :rtype: str
        """
        return self._agent

    @agent.setter
    def agent(self, agent):
        """Sets the agent of this GameProfile.


        :param agent: The agent of this GameProfile.  # noqa: E501
        :type: str
        """

        self._agent = agent

    @property
    def id(self):
        """Gets the id of this GameProfile.  # noqa: E501


        :return: The id of this GameProfile.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this GameProfile.


        :param id: The id of this GameProfile.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this GameProfile.  # noqa: E501


        :return: The name of this GameProfile.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this GameProfile.


        :param name: The name of this GameProfile.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def user_id(self):
        """Gets the user_id of this GameProfile.  # noqa: E501


        :return: The user_id of this GameProfile.  # noqa: E501
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this GameProfile.


        :param user_id: The user_id of this GameProfile.  # noqa: E501
        :type: str
        """

        self._user_id = user_id

    @property
    def created_at(self):
        """Gets the created_at of this GameProfile.  # noqa: E501

        Unix timestamp in milliseconds  # noqa: E501

        :return: The created_at of this GameProfile.  # noqa: E501
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this GameProfile.

        Unix timestamp in milliseconds  # noqa: E501

        :param created_at: The created_at of this GameProfile.  # noqa: E501
        :type: int
        """

        self._created_at = created_at

    @property
    def legacy_profile(self):
        """Gets the legacy_profile of this GameProfile.  # noqa: E501


        :return: The legacy_profile of this GameProfile.  # noqa: E501
        :rtype: bool
        """
        return self._legacy_profile

    @legacy_profile.setter
    def legacy_profile(self, legacy_profile):
        """Sets the legacy_profile of this GameProfile.


        :param legacy_profile: The legacy_profile of this GameProfile.  # noqa: E501
        :type: bool
        """

        self._legacy_profile = legacy_profile

    @property
    def suspended(self):
        """Gets the suspended of this GameProfile.  # noqa: E501


        :return: The suspended of this GameProfile.  # noqa: E501
        :rtype: bool
        """
        return self._suspended

    @suspended.setter
    def suspended(self, suspended):
        """Sets the suspended of this GameProfile.


        :param suspended: The suspended of this GameProfile.  # noqa: E501
        :type: bool
        """

        self._suspended = suspended

    @property
    def paid(self):
        """Gets the paid of this GameProfile.  # noqa: E501


        :return: The paid of this GameProfile.  # noqa: E501
        :rtype: bool
        """
        return self._paid

    @paid.setter
    def paid(self, paid):
        """Sets the paid of this GameProfile.


        :param paid: The paid of this GameProfile.  # noqa: E501
        :type: bool
        """

        self._paid = paid

    @property
    def migrated(self):
        """Gets the migrated of this GameProfile.  # noqa: E501


        :return: The migrated of this GameProfile.  # noqa: E501
        :rtype: bool
        """
        return self._migrated

    @migrated.setter
    def migrated(self, migrated):
        """Sets the migrated of this GameProfile.


        :param migrated: The migrated of this GameProfile.  # noqa: E501
        :type: bool
        """

        self._migrated = migrated

    @property
    def legacy(self):
        """Gets the legacy of this GameProfile.  # noqa: E501


        :return: The legacy of this GameProfile.  # noqa: E501
        :rtype: bool
        """
        return self._legacy

    @legacy.setter
    def legacy(self, legacy):
        """Sets the legacy of this GameProfile.


        :param legacy: The legacy of this GameProfile.  # noqa: E501
        :type: bool
        """

        self._legacy = legacy

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
        if not isinstance(other, GameProfile):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
