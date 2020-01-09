# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class Posting(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, unit: str=None, post: str=None, posting_type: str=None, assignment_no: str=None, team: str=None, is_primary: bool=None):
        """Posting - a model defined in OpenAPI

        :param unit: The unit of this Posting.
        :param post: The post of this Posting.
        :param posting_type: The posting_type of this Posting.
        :param assignment_no: The assignment_no of this Posting.
        :param team: The team of this Posting.
        :param is_primary: The is_primary of this Posting.
        """
        self.openapi_types = {
            'unit': str,
            'post': str,
            'posting_type': str,
            'assignment_no': str,
            'team': str,
            'is_primary': bool
        }

        self.attribute_map = {
            'unit': 'unit',
            'post': 'post',
            'posting_type': 'postingType',
            'assignment_no': 'assignmentNo',
            'team': 'team',
            'is_primary': 'isPrimary'
        }

        self._unit = unit
        self._post = post
        self._posting_type = posting_type
        self._assignment_no = assignment_no
        self._team = team
        self._is_primary = is_primary

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Posting':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Posting of this Posting.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def unit(self):
        """Gets the unit of this Posting.


        :return: The unit of this Posting.
        :rtype: str
        """
        return self._unit

    @unit.setter
    def unit(self, unit):
        """Sets the unit of this Posting.


        :param unit: The unit of this Posting.
        :type unit: str
        """
        if unit is None:
            raise ValueError("Invalid value for `unit`, must not be `None`")

        self._unit = unit

    @property
    def post(self):
        """Gets the post of this Posting.


        :return: The post of this Posting.
        :rtype: str
        """
        return self._post

    @post.setter
    def post(self, post):
        """Sets the post of this Posting.


        :param post: The post of this Posting.
        :type post: str
        """

        self._post = post

    @property
    def posting_type(self):
        """Gets the posting_type of this Posting.


        :return: The posting_type of this Posting.
        :rtype: str
        """
        return self._posting_type

    @posting_type.setter
    def posting_type(self, posting_type):
        """Sets the posting_type of this Posting.


        :param posting_type: The posting_type of this Posting.
        :type posting_type: str
        """

        self._posting_type = posting_type

    @property
    def assignment_no(self):
        """Gets the assignment_no of this Posting.


        :return: The assignment_no of this Posting.
        :rtype: str
        """
        return self._assignment_no

    @assignment_no.setter
    def assignment_no(self, assignment_no):
        """Sets the assignment_no of this Posting.


        :param assignment_no: The assignment_no of this Posting.
        :type assignment_no: str
        """
        if assignment_no is None:
            raise ValueError("Invalid value for `assignment_no`, must not be `None`")

        self._assignment_no = assignment_no

    @property
    def team(self):
        """Gets the team of this Posting.


        :return: The team of this Posting.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team):
        """Sets the team of this Posting.


        :param team: The team of this Posting.
        :type team: str
        """

        self._team = team

    @property
    def is_primary(self):
        """Gets the is_primary of this Posting.


        :return: The is_primary of this Posting.
        :rtype: bool
        """
        return self._is_primary

    @is_primary.setter
    def is_primary(self, is_primary):
        """Sets the is_primary of this Posting.


        :param is_primary: The is_primary of this Posting.
        :type is_primary: bool
        """
        if is_primary is None:
            raise ValueError("Invalid value for `is_primary`, must not be `None`")

        self._is_primary = is_primary
