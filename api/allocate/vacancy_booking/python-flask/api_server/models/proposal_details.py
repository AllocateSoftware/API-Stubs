# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.cancellation_cost import CancellationCost
from api_server import util

from api_server.models.cancellation_cost import CancellationCost  # noqa: E501

class ProposalDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, person_id=None, engagement_route=None, agency_id=None, cost=None, cancellation_costs=None):  # noqa: E501
        """ProposalDetails - a model defined in OpenAPI

        :param person_id: The person_id of this ProposalDetails.  # noqa: E501
        :type person_id: str
        :param engagement_route: The engagement_route of this ProposalDetails.  # noqa: E501
        :type engagement_route: str
        :param agency_id: The agency_id of this ProposalDetails.  # noqa: E501
        :type agency_id: str
        :param cost: The cost of this ProposalDetails.  # noqa: E501
        :type cost: float
        :param cancellation_costs: The cancellation_costs of this ProposalDetails.  # noqa: E501
        :type cancellation_costs: List[CancellationCost]
        """
        self.openapi_types = {
            'person_id': str,
            'engagement_route': str,
            'agency_id': str,
            'cost': float,
            'cancellation_costs': List[CancellationCost]
        }

        self.attribute_map = {
            'person_id': 'personId',
            'engagement_route': 'engagementRoute',
            'agency_id': 'agencyId',
            'cost': 'cost',
            'cancellation_costs': 'cancellationCosts'
        }

        self._person_id = person_id
        self._engagement_route = engagement_route
        self._agency_id = agency_id
        self._cost = cost
        self._cancellation_costs = cancellation_costs

    @classmethod
    def from_dict(cls, dikt) -> 'ProposalDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProposalDetails of this ProposalDetails.  # noqa: E501
        :rtype: ProposalDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def person_id(self):
        """Gets the person_id of this ProposalDetails.

        Allocate PersonID for the person being proposed  # noqa: E501

        :return: The person_id of this ProposalDetails.
        :rtype: str
        """
        return self._person_id

    @person_id.setter
    def person_id(self, person_id):
        """Sets the person_id of this ProposalDetails.

        Allocate PersonID for the person being proposed  # noqa: E501

        :param person_id: The person_id of this ProposalDetails.
        :type person_id: str
        """
        if person_id is None:
            raise ValueError("Invalid value for `person_id`, must not be `None`")  # noqa: E501

        self._person_id = person_id

    @property
    def engagement_route(self):
        """Gets the engagement_route of this ProposalDetails.

        The engagement route for this worker  # noqa: E501

        :return: The engagement_route of this ProposalDetails.
        :rtype: str
        """
        return self._engagement_route

    @engagement_route.setter
    def engagement_route(self, engagement_route):
        """Sets the engagement_route of this ProposalDetails.

        The engagement route for this worker  # noqa: E501

        :param engagement_route: The engagement_route of this ProposalDetails.
        :type engagement_route: str
        """
        allowed_values = ["substantive", "bank", "agency", "other"]  # noqa: E501
        if engagement_route not in allowed_values:
            raise ValueError(
                "Invalid value for `engagement_route` ({0}), must be one of {1}"
                .format(engagement_route, allowed_values)
            )

        self._engagement_route = engagement_route

    @property
    def agency_id(self):
        """Gets the agency_id of this ProposalDetails.

        The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement  # noqa: E501

        :return: The agency_id of this ProposalDetails.
        :rtype: str
        """
        return self._agency_id

    @agency_id.setter
    def agency_id(self, agency_id):
        """Sets the agency_id of this ProposalDetails.

        The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement  # noqa: E501

        :param agency_id: The agency_id of this ProposalDetails.
        :type agency_id: str
        """

        self._agency_id = agency_id

    @property
    def cost(self):
        """Gets the cost of this ProposalDetails.


        :return: The cost of this ProposalDetails.
        :rtype: float
        """
        return self._cost

    @cost.setter
    def cost(self, cost):
        """Sets the cost of this ProposalDetails.


        :param cost: The cost of this ProposalDetails.
        :type cost: float
        """

        self._cost = cost

    @property
    def cancellation_costs(self):
        """Gets the cancellation_costs of this ProposalDetails.


        :return: The cancellation_costs of this ProposalDetails.
        :rtype: List[CancellationCost]
        """
        return self._cancellation_costs

    @cancellation_costs.setter
    def cancellation_costs(self, cancellation_costs):
        """Sets the cancellation_costs of this ProposalDetails.


        :param cancellation_costs: The cancellation_costs of this ProposalDetails.
        :type cancellation_costs: List[CancellationCost]
        """

        self._cancellation_costs = cancellation_costs
