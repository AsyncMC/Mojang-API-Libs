# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.base_model_ import Model
from openapi_server import util


class SecurityChallenge(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, question=None, answer=None):  # noqa: E501
        """SecurityChallenge - a model defined in OpenAPI

        :param question: The question of this SecurityChallenge.  # noqa: E501
        :type question: SecurityQuestion
        :param answer: The answer of this SecurityChallenge.  # noqa: E501
        :type answer: SecurityAnswerId
        """
        self.openapi_types = {
            'question': SecurityQuestion,
            'answer': SecurityAnswerId
        }

        self.attribute_map = {
            'question': 'question',
            'answer': 'answer'
        }

        self._question = question
        self._answer = answer

    @classmethod
    def from_dict(cls, dikt) -> 'SecurityChallenge':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SecurityChallenge of this SecurityChallenge.  # noqa: E501
        :rtype: SecurityChallenge
        """
        return util.deserialize_model(dikt, cls)

    @property
    def question(self):
        """Gets the question of this SecurityChallenge.


        :return: The question of this SecurityChallenge.
        :rtype: SecurityQuestion
        """
        return self._question

    @question.setter
    def question(self, question):
        """Sets the question of this SecurityChallenge.


        :param question: The question of this SecurityChallenge.
        :type question: SecurityQuestion
        """
        if question is None:
            raise ValueError("Invalid value for `question`, must not be `None`")  # noqa: E501

        self._question = question

    @property
    def answer(self):
        """Gets the answer of this SecurityChallenge.


        :return: The answer of this SecurityChallenge.
        :rtype: SecurityAnswerId
        """
        return self._answer

    @answer.setter
    def answer(self, answer):
        """Sets the answer of this SecurityChallenge.


        :param answer: The answer of this SecurityChallenge.
        :type answer: SecurityAnswerId
        """
        if answer is None:
            raise ValueError("Invalid value for `answer`, must not be `None`")  # noqa: E501

        self._answer = answer