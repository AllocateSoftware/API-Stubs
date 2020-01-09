# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class InlineObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, trust_code: str=None, engagement_route: str=None):
        """InlineObject - a model defined in OpenAPI

        :param trust_code: The trust_code of this InlineObject.
        :param engagement_route: The engagement_route of this InlineObject.
        """
        self.openapi_types = {
            'trust_code': str,
            'engagement_route': str
        }

        self.attribute_map = {
            'trust_code': 'trustCode',
            'engagement_route': 'engagementRoute'
        }

        self._trust_code = trust_code
        self._engagement_route = engagement_route

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_object of this InlineObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def trust_code(self):
        """Gets the trust_code of this InlineObject.

        The code for the trust that the worker should be on-boarded to

        :return: The trust_code of this InlineObject.
        :rtype: str
        """
        return self._trust_code

    @trust_code.setter
    def trust_code(self, trust_code):
        """Sets the trust_code of this InlineObject.

        The code for the trust that the worker should be on-boarded to

        :param trust_code: The trust_code of this InlineObject.
        :type trust_code: str
        """

        self._trust_code = trust_code

    @property
    def engagement_route(self):
        """Gets the engagement_route of this InlineObject.

        The 'engagement route' of the worker, such as substantive, bank, agency

        :return: The engagement_route of this InlineObject.
        :rtype: str
        """
        return self._engagement_route

    @engagement_route.setter
    def engagement_route(self, engagement_route):
        """Sets the engagement_route of this InlineObject.

        The 'engagement route' of the worker, such as substantive, bank, agency

        :param engagement_route: The engagement_route of this InlineObject.
        :type engagement_route: str
        """

        self._engagement_route = engagement_route