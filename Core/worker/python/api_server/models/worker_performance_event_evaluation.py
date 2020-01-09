# coding: utf-8

"""
    Workers

    ## Workers and events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class WorkerPerformanceEventEvaluation(object):
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
        'evaluator': 'WorkerPerformanceEventEvaluationEvaluator',
        'score': 'float',
        'comment': 'str',
        'quesions': 'list[WorkerPerformanceEventEvaluationQuesions]'
    }

    attribute_map = {
        'evaluator': 'evaluator',
        'score': 'score',
        'comment': 'comment',
        'quesions': 'quesions'
    }

    def __init__(self, evaluator=None, score=None, comment=None, quesions=None, local_vars_configuration=None):  # noqa: E501
        """WorkerPerformanceEventEvaluation - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._evaluator = None
        self._score = None
        self._comment = None
        self._quesions = None
        self.discriminator = None

        if evaluator is not None:
            self.evaluator = evaluator
        if score is not None:
            self.score = score
        if comment is not None:
            self.comment = comment
        if quesions is not None:
            self.quesions = quesions

    @property
    def evaluator(self):
        """Gets the evaluator of this WorkerPerformanceEventEvaluation.  # noqa: E501


        :return: The evaluator of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :rtype: WorkerPerformanceEventEvaluationEvaluator
        """
        return self._evaluator

    @evaluator.setter
    def evaluator(self, evaluator):
        """Sets the evaluator of this WorkerPerformanceEventEvaluation.


        :param evaluator: The evaluator of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type: WorkerPerformanceEventEvaluationEvaluator
        """

        self._evaluator = evaluator

    @property
    def score(self):
        """Gets the score of this WorkerPerformanceEventEvaluation.  # noqa: E501

        Score out of 10  # noqa: E501

        :return: The score of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :rtype: float
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this WorkerPerformanceEventEvaluation.

        Score out of 10  # noqa: E501

        :param score: The score of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type: float
        """
        if (self.local_vars_configuration.client_side_validation and
                score is not None and score > 10):  # noqa: E501
            raise ValueError("Invalid value for `score`, must be a value less than or equal to `10`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                score is not None and score < 0):  # noqa: E501
            raise ValueError("Invalid value for `score`, must be a value greater than or equal to `0`")  # noqa: E501

        self._score = score

    @property
    def comment(self):
        """Gets the comment of this WorkerPerformanceEventEvaluation.  # noqa: E501

        Free text comment  # noqa: E501

        :return: The comment of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """Sets the comment of this WorkerPerformanceEventEvaluation.

        Free text comment  # noqa: E501

        :param comment: The comment of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type: str
        """

        self._comment = comment

    @property
    def quesions(self):
        """Gets the quesions of this WorkerPerformanceEventEvaluation.  # noqa: E501

        List of questions and answers froman evaluator  # noqa: E501

        :return: The quesions of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :rtype: list[WorkerPerformanceEventEvaluationQuesions]
        """
        return self._quesions

    @quesions.setter
    def quesions(self, quesions):
        """Sets the quesions of this WorkerPerformanceEventEvaluation.

        List of questions and answers froman evaluator  # noqa: E501

        :param quesions: The quesions of this WorkerPerformanceEventEvaluation.  # noqa: E501
        :type: list[WorkerPerformanceEventEvaluationQuesions]
        """

        self._quesions = quesions

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
        if not isinstance(other, WorkerPerformanceEventEvaluation):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, WorkerPerformanceEventEvaluation):
            return True

        return self.to_dict() != other.to_dict()
