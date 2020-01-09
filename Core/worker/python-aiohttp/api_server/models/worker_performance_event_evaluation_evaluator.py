# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.identifier import Identifier
from api_server import util


class WorkerPerformanceEventEvaluationEvaluator(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name: str=None, identities: List[Identifier]=None):
        """WorkerPerformanceEventEvaluationEvaluator - a model defined in OpenAPI

        :param name: The name of this WorkerPerformanceEventEvaluationEvaluator.
        :param identities: The identities of this WorkerPerformanceEventEvaluationEvaluator.
        """
        self.openapi_types = {
            'name': str,
            'identities': List[Identifier]
        }

        self.attribute_map = {
            'name': 'name',
            'identities': 'identities'
        }

        self._name = name
        self._identities = identities

    @classmethod
    def from_dict(cls, dikt: dict) -> 'WorkerPerformanceEventEvaluationEvaluator':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The WorkerPerformanceEvent_evaluation_evaluator of this WorkerPerformanceEventEvaluationEvaluator.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this WorkerPerformanceEventEvaluationEvaluator.


        :return: The name of this WorkerPerformanceEventEvaluationEvaluator.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this WorkerPerformanceEventEvaluationEvaluator.


        :param name: The name of this WorkerPerformanceEventEvaluationEvaluator.
        :type name: str
        """

        self._name = name

    @property
    def identities(self):
        """Gets the identities of this WorkerPerformanceEventEvaluationEvaluator.


        :return: The identities of this WorkerPerformanceEventEvaluationEvaluator.
        :rtype: List[Identifier]
        """
        return self._identities

    @identities.setter
    def identities(self, identities):
        """Sets the identities of this WorkerPerformanceEventEvaluationEvaluator.


        :param identities: The identities of this WorkerPerformanceEventEvaluationEvaluator.
        :type identities: List[Identifier]
        """

        self._identities = identities