# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class ContractStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    NOT_INITIATED = "not_initiated"
    IN_PROGRESS = "in_progress"
    PENDING = "pending"
    ACTIVE = "active"
    NONACTIVE = "nonactive"

    def __init__(self):  # noqa: E501
        """ContractStatus - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ContractStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContractStatus of this ContractStatus.  # noqa: E501
        :rtype: ContractStatus
        """
        return util.deserialize_model(dikt, cls)