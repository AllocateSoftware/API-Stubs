# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.worker_performance_event_evaluation_evaluator import WorkerPerformanceEventEvaluationEvaluator
from api_server.models.worker_performance_event_evaluation_quesions import WorkerPerformanceEventEvaluationQuesions
from api_server import util

from api_server.models.worker_performance_event_evaluation_evaluator import WorkerPerformanceEventEvaluationEvaluator  # noqa: E501
from api_server.models.worker_performance_event_evaluation_quesions import WorkerPerformanceEventEvaluationQuesions  # noqa: E501

class WorkerPerformanceEventEvaluation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, evaluator=None, score=None, comment=None, quesions=None):  # noqa: E501
        """WorkerPerformanceEventEvaluation - a model defined in OpenAPI

        :param evaluator: The evaluator of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type evaluator: WorkerPerformanceEventEvaluationEvaluator
        :param score: The score of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type score: float
        :param comment: The comment of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type comment: str
        :param quesions: The quesions of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type quesions: List[WorkerPerformanceEventEvaluationQuesions]
        """
        self.openapi_types = {
            'evaluator': WorkerPerformanceEventEvaluationEvaluator,
            'score': float,
            'comment': str,
            'quesions': List[WorkerPerformanceEventEvaluationQuesions]
        }

        self.attribute_map = {
            'evaluator': 'evaluator',
            'score': 'score',
            'comment': 'comment',
            'quesions': 'quesions'
        }

        self._evaluator = evaluator
        self._score = score
        self._comment = comment
        self._quesions = quesions

    @classmethod
    def from_dict(cls, dikt) -> 'WorkerPerformanceEventEvaluation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkerPerformanceEvent_evaluation of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :rtype: WorkerPerformanceEventEvaluation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def evaluator(self):
        """Gets the evaluator of this WorkerPerformanceEventEvaluation.


        :return: The evaluator of this WorkerPerformanceEventEvaluation.
        :rtype: WorkerPerformanceEventEvaluationEvaluator
        """
        return self._evaluator

    @evaluator.setter
    def evaluator(self, evaluator):
        """Sets the evaluator of this WorkerPerformanceEventEvaluation.


        :param evaluator: The evaluator of this WorkerPerformanceEventEvaluation.
        :type evaluator: WorkerPerformanceEventEvaluationEvaluator
        """

        self._evaluator = evaluator

    @property
    def score(self):
        """Gets the score of this WorkerPerformanceEventEvaluation.

        Score out of 10  # noqa: E501

        :return: The score of this WorkerPerformanceEventEvaluation.
        :rtype: float
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this WorkerPerformanceEventEvaluation.

        Score out of 10  # noqa: E501

        :param score: The score of this WorkerPerformanceEventEvaluation.
        :type score: float
        """
        if score is not None and score > 10:  # noqa: E501
            raise ValueError("Invalid value for `score`, must be a value less than or equal to `10`")  # noqa: E501
        if score is not None and score < 0:  # noqa: E501
            raise ValueError("Invalid value for `score`, must be a value greater than or equal to `0`")  # noqa: E501

        self._score = score

    @property
    def comment(self):
        """Gets the comment of this WorkerPerformanceEventEvaluation.

        Free text comment  # noqa: E501

        :return: The comment of this WorkerPerformanceEventEvaluation.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """Sets the comment of this WorkerPerformanceEventEvaluation.

        Free text comment  # noqa: E501

        :param comment: The comment of this WorkerPerformanceEventEvaluation.
        :type comment: str
        """

        self._comment = comment

    @property
    def quesions(self):
        """Gets the quesions of this WorkerPerformanceEventEvaluation.

        List of questions and answers froman evaluator  # noqa: E501

        :return: The quesions of this WorkerPerformanceEventEvaluation.
        :rtype: List[WorkerPerformanceEventEvaluationQuesions]
        """
        return self._quesions

    @quesions.setter
    def quesions(self, quesions):
        """Sets the quesions of this WorkerPerformanceEventEvaluation.

        List of questions and answers froman evaluator  # noqa: E501

        :param quesions: The quesions of this WorkerPerformanceEventEvaluation.
        :type quesions: List[WorkerPerformanceEventEvaluationQuesions]
        """

        self._quesions = quesions
