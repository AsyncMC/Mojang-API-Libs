# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.authentication.python.flask.model.base_model_ import Model
from openapi_server import util


class GameProfile(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, agent=None, id=None, name=None, user_id=None, created_at=None, legacy_profile=None, suspended=None, paid=None, migrated=None, legacy=None):  # noqa: E501
        """GameProfile - a model defined in OpenAPI

        :param agent: The agent of this GameProfile.  # noqa: E501
        :type agent: str
        :param id: The id of this GameProfile.  # noqa: E501
        :type id: str
        :param name: The name of this GameProfile.  # noqa: E501
        :type name: str
        :param user_id: The user_id of this GameProfile.  # noqa: E501
        :type user_id: str
        :param created_at: The created_at of this GameProfile.  # noqa: E501
        :type created_at: int
        :param legacy_profile: The legacy_profile of this GameProfile.  # noqa: E501
        :type legacy_profile: bool
        :param suspended: The suspended of this GameProfile.  # noqa: E501
        :type suspended: bool
        :param paid: The paid of this GameProfile.  # noqa: E501
        :type paid: bool
        :param migrated: The migrated of this GameProfile.  # noqa: E501
        :type migrated: bool
        :param legacy: The legacy of this GameProfile.  # noqa: E501
        :type legacy: bool
        """
        self.openapi_types = {
            'agent': str,
            'id': str,
            'name': str,
            'user_id': str,
            'created_at': int,
            'legacy_profile': bool,
            'suspended': bool,
            'paid': bool,
            'migrated': bool,
            'legacy': bool
        }

        self.attribute_map = {
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

        self._agent = agent
        self._id = id
        self._name = name
        self._user_id = user_id
        self._created_at = created_at
        self._legacy_profile = legacy_profile
        self._suspended = suspended
        self._paid = paid
        self._migrated = migrated
        self._legacy = legacy

    @classmethod
    def from_dict(cls, dikt) -> 'GameProfile':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GameProfile of this GameProfile.  # noqa: E501
        :rtype: GameProfile
        """
        return util.deserialize_model(dikt, cls)

    @property
    def agent(self):
        """Gets the agent of this GameProfile.


        :return: The agent of this GameProfile.
        :rtype: str
        """
        return self._agent

    @agent.setter
    def agent(self, agent):
        """Sets the agent of this GameProfile.


        :param agent: The agent of this GameProfile.
        :type agent: str
        """

        self._agent = agent

    @property
    def id(self):
        """Gets the id of this GameProfile.


        :return: The id of this GameProfile.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this GameProfile.


        :param id: The id of this GameProfile.
        :type id: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this GameProfile.


        :return: The name of this GameProfile.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this GameProfile.


        :param name: The name of this GameProfile.
        :type name: str
        """

        self._name = name

    @property
    def user_id(self):
        """Gets the user_id of this GameProfile.


        :return: The user_id of this GameProfile.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this GameProfile.


        :param user_id: The user_id of this GameProfile.
        :type user_id: str
        """

        self._user_id = user_id

    @property
    def created_at(self):
        """Gets the created_at of this GameProfile.

        Unix timestamp in milliseconds  # noqa: E501

        :return: The created_at of this GameProfile.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this GameProfile.

        Unix timestamp in milliseconds  # noqa: E501

        :param created_at: The created_at of this GameProfile.
        :type created_at: int
        """

        self._created_at = created_at

    @property
    def legacy_profile(self):
        """Gets the legacy_profile of this GameProfile.


        :return: The legacy_profile of this GameProfile.
        :rtype: bool
        """
        return self._legacy_profile

    @legacy_profile.setter
    def legacy_profile(self, legacy_profile):
        """Sets the legacy_profile of this GameProfile.


        :param legacy_profile: The legacy_profile of this GameProfile.
        :type legacy_profile: bool
        """

        self._legacy_profile = legacy_profile

    @property
    def suspended(self):
        """Gets the suspended of this GameProfile.


        :return: The suspended of this GameProfile.
        :rtype: bool
        """
        return self._suspended

    @suspended.setter
    def suspended(self, suspended):
        """Sets the suspended of this GameProfile.


        :param suspended: The suspended of this GameProfile.
        :type suspended: bool
        """

        self._suspended = suspended

    @property
    def paid(self):
        """Gets the paid of this GameProfile.


        :return: The paid of this GameProfile.
        :rtype: bool
        """
        return self._paid

    @paid.setter
    def paid(self, paid):
        """Sets the paid of this GameProfile.


        :param paid: The paid of this GameProfile.
        :type paid: bool
        """

        self._paid = paid

    @property
    def migrated(self):
        """Gets the migrated of this GameProfile.


        :return: The migrated of this GameProfile.
        :rtype: bool
        """
        return self._migrated

    @migrated.setter
    def migrated(self, migrated):
        """Sets the migrated of this GameProfile.


        :param migrated: The migrated of this GameProfile.
        :type migrated: bool
        """

        self._migrated = migrated

    @property
    def legacy(self):
        """Gets the legacy of this GameProfile.


        :return: The legacy of this GameProfile.
        :rtype: bool
        """
        return self._legacy

    @legacy.setter
    def legacy(self, legacy):
        """Sets the legacy of this GameProfile.


        :param legacy: The legacy of this GameProfile.
        :type legacy: bool
        """

        self._legacy = legacy