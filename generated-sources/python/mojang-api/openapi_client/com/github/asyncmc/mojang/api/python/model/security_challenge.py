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


class SecurityChallenge(object):
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
        'question': 'SecurityQuestion',
        'answer': 'SecurityAnswerId'
    }

    attribute_map = {
        'question': 'question',
        'answer': 'answer'
    }

    def __init__(self, question=None, answer=None):  # noqa: E501
        """SecurityChallenge - a model defined in OpenAPI"""  # noqa: E501

        self._question = None
        self._answer = None
        self.discriminator = None

        self.question = question
        self.answer = answer

    @property
    def question(self):
        """Gets the question of this SecurityChallenge.  # noqa: E501


        :return: The question of this SecurityChallenge.  # noqa: E501
        :rtype: SecurityQuestion
        """
        return self._question

    @question.setter
    def question(self, question):
        """Sets the question of this SecurityChallenge.


        :param question: The question of this SecurityChallenge.  # noqa: E501
        :type: SecurityQuestion
        """
        if question is None:
            raise ValueError("Invalid value for `question`, must not be `None`")  # noqa: E501

        self._question = question

    @property
    def answer(self):
        """Gets the answer of this SecurityChallenge.  # noqa: E501


        :return: The answer of this SecurityChallenge.  # noqa: E501
        :rtype: SecurityAnswerId
        """
        return self._answer

    @answer.setter
    def answer(self, answer):
        """Sets the answer of this SecurityChallenge.


        :param answer: The answer of this SecurityChallenge.  # noqa: E501
        :type: SecurityAnswerId
        """
        if answer is None:
            raise ValueError("Invalid value for `answer`, must not be `None`")  # noqa: E501

        self._answer = answer

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
        if not isinstance(other, SecurityChallenge):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other