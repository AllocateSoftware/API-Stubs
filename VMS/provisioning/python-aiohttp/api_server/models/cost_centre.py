# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class CostCentre(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code: str=None):
        """CostCentre - a model defined in OpenAPI

        :param code: The code of this CostCentre.
        """
        self.openapi_types = {
            'code': str
        }

        self.attribute_map = {
            'code': 'code'
        }

        self._code = code

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CostCentre':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CostCentre of this CostCentre.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self):
        """Gets the code of this CostCentre.


        :return: The code of this CostCentre.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this CostCentre.


        :param code: The code of this CostCentre.
        :type code: str
        """

        self._code = code