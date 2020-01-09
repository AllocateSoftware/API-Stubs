# coding: utf-8

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class WorkerOffer(object):
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
        'id': 'str',
        'booking_request_id': 'str',
        'worker': 'Person',
        'agency': 'Agency',
        'qualification_status': 'str'
    }

    attribute_map = {
        'id': 'id',
        'booking_request_id': 'bookingRequestId',
        'worker': 'worker',
        'agency': 'agency',
        'qualification_status': 'qualificationStatus'
    }

    def __init__(self, id=None, booking_request_id=None, worker=None, agency=None, qualification_status=None, local_vars_configuration=None):  # noqa: E501
        """WorkerOffer - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._booking_request_id = None
        self._worker = None
        self._agency = None
        self._qualification_status = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if booking_request_id is not None:
            self.booking_request_id = booking_request_id
        self.worker = worker
        self.agency = agency
        self.qualification_status = qualification_status

    @property
    def id(self):
        """Gets the id of this WorkerOffer.  # noqa: E501

        Unique identifier for this offer.  # noqa: E501

        :return: The id of this WorkerOffer.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this WorkerOffer.

        Unique identifier for this offer.  # noqa: E501

        :param id: The id of this WorkerOffer.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def booking_request_id(self):
        """Gets the booking_request_id of this WorkerOffer.  # noqa: E501

        The underlying booking request for this offer.  # noqa: E501

        :return: The booking_request_id of this WorkerOffer.  # noqa: E501
        :rtype: str
        """
        return self._booking_request_id

    @booking_request_id.setter
    def booking_request_id(self, booking_request_id):
        """Sets the booking_request_id of this WorkerOffer.

        The underlying booking request for this offer.  # noqa: E501

        :param booking_request_id: The booking_request_id of this WorkerOffer.  # noqa: E501
        :type: str
        """

        self._booking_request_id = booking_request_id

    @property
    def worker(self):
        """Gets the worker of this WorkerOffer.  # noqa: E501


        :return: The worker of this WorkerOffer.  # noqa: E501
        :rtype: Person
        """
        return self._worker

    @worker.setter
    def worker(self, worker):
        """Sets the worker of this WorkerOffer.


        :param worker: The worker of this WorkerOffer.  # noqa: E501
        :type: Person
        """
        if self.local_vars_configuration.client_side_validation and worker is None:  # noqa: E501
            raise ValueError("Invalid value for `worker`, must not be `None`")  # noqa: E501

        self._worker = worker

    @property
    def agency(self):
        """Gets the agency of this WorkerOffer.  # noqa: E501


        :return: The agency of this WorkerOffer.  # noqa: E501
        :rtype: Agency
        """
        return self._agency

    @agency.setter
    def agency(self, agency):
        """Sets the agency of this WorkerOffer.


        :param agency: The agency of this WorkerOffer.  # noqa: E501
        :type: Agency
        """
        if self.local_vars_configuration.client_side_validation and agency is None:  # noqa: E501
            raise ValueError("Invalid value for `agency`, must not be `None`")  # noqa: E501

        self._agency = agency

    @property
    def qualification_status(self):
        """Gets the qualification_status of this WorkerOffer.  # noqa: E501

        Qualification Status:  * `qualified` - Worker has passed all trust-defined checks, and may be considered valid to book.  * `unqualified` - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.   # noqa: E501

        :return: The qualification_status of this WorkerOffer.  # noqa: E501
        :rtype: str
        """
        return self._qualification_status

    @qualification_status.setter
    def qualification_status(self, qualification_status):
        """Sets the qualification_status of this WorkerOffer.

        Qualification Status:  * `qualified` - Worker has passed all trust-defined checks, and may be considered valid to book.  * `unqualified` - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.   # noqa: E501

        :param qualification_status: The qualification_status of this WorkerOffer.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and qualification_status is None:  # noqa: E501
            raise ValueError("Invalid value for `qualification_status`, must not be `None`")  # noqa: E501
        allowed_values = ["qualified", "unqualified"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and qualification_status not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `qualification_status` ({0}), must be one of {1}"  # noqa: E501
                .format(qualification_status, allowed_values)
            )

        self._qualification_status = qualification_status

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
        if not isinstance(other, WorkerOffer):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, WorkerOffer):
            return True

        return self.to_dict() != other.to_dict()