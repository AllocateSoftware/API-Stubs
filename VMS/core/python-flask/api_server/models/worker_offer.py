# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.agency import Agency
from api_server.models.person import Person
from api_server import util

from api_server.models.agency import Agency  # noqa: E501
from api_server.models.person import Person  # noqa: E501

class WorkerOffer(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, booking_request_id=None, worker=None, agency=None, qualification_status=None):  # noqa: E501
        """WorkerOffer - a model defined in OpenAPI

        :param id: The id of this WorkerOffer.  # noqa: E501
        :type id: str
        :param booking_request_id: The booking_request_id of this WorkerOffer.  # noqa: E501
        :type booking_request_id: str
        :param worker: The worker of this WorkerOffer.  # noqa: E501
        :type worker: Person
        :param agency: The agency of this WorkerOffer.  # noqa: E501
        :type agency: Agency
        :param qualification_status: The qualification_status of this WorkerOffer.  # noqa: E501
        :type qualification_status: str
        """
        self.openapi_types = {
            'id': str,
            'booking_request_id': str,
            'worker': Person,
            'agency': Agency,
            'qualification_status': str
        }

        self.attribute_map = {
            'id': 'id',
            'booking_request_id': 'bookingRequestId',
            'worker': 'worker',
            'agency': 'agency',
            'qualification_status': 'qualificationStatus'
        }

        self._id = id
        self._booking_request_id = booking_request_id
        self._worker = worker
        self._agency = agency
        self._qualification_status = qualification_status

    @classmethod
    def from_dict(cls, dikt) -> 'WorkerOffer':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkerOffer of this WorkerOffer.  # noqa: E501
        :rtype: WorkerOffer
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this WorkerOffer.

        Unique identifier for this offer.  # noqa: E501

        :return: The id of this WorkerOffer.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this WorkerOffer.

        Unique identifier for this offer.  # noqa: E501

        :param id: The id of this WorkerOffer.
        :type id: str
        """

        self._id = id

    @property
    def booking_request_id(self):
        """Gets the booking_request_id of this WorkerOffer.

        The underlying booking request for this offer.  # noqa: E501

        :return: The booking_request_id of this WorkerOffer.
        :rtype: str
        """
        return self._booking_request_id

    @booking_request_id.setter
    def booking_request_id(self, booking_request_id):
        """Sets the booking_request_id of this WorkerOffer.

        The underlying booking request for this offer.  # noqa: E501

        :param booking_request_id: The booking_request_id of this WorkerOffer.
        :type booking_request_id: str
        """

        self._booking_request_id = booking_request_id

    @property
    def worker(self):
        """Gets the worker of this WorkerOffer.


        :return: The worker of this WorkerOffer.
        :rtype: Person
        """
        return self._worker

    @worker.setter
    def worker(self, worker):
        """Sets the worker of this WorkerOffer.


        :param worker: The worker of this WorkerOffer.
        :type worker: Person
        """
        if worker is None:
            raise ValueError("Invalid value for `worker`, must not be `None`")  # noqa: E501

        self._worker = worker

    @property
    def agency(self):
        """Gets the agency of this WorkerOffer.


        :return: The agency of this WorkerOffer.
        :rtype: Agency
        """
        return self._agency

    @agency.setter
    def agency(self, agency):
        """Sets the agency of this WorkerOffer.


        :param agency: The agency of this WorkerOffer.
        :type agency: Agency
        """
        if agency is None:
            raise ValueError("Invalid value for `agency`, must not be `None`")  # noqa: E501

        self._agency = agency

    @property
    def qualification_status(self):
        """Gets the qualification_status of this WorkerOffer.

        Qualification Status:  * `qualified` - Worker has passed all trust-defined checks, and may be considered valid to book.  * `unqualified` - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.   # noqa: E501

        :return: The qualification_status of this WorkerOffer.
        :rtype: str
        """
        return self._qualification_status

    @qualification_status.setter
    def qualification_status(self, qualification_status):
        """Sets the qualification_status of this WorkerOffer.

        Qualification Status:  * `qualified` - Worker has passed all trust-defined checks, and may be considered valid to book.  * `unqualified` - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.   # noqa: E501

        :param qualification_status: The qualification_status of this WorkerOffer.
        :type qualification_status: str
        """
        allowed_values = ["qualified", "unqualified"]  # noqa: E501
        if qualification_status not in allowed_values:
            raise ValueError(
                "Invalid value for `qualification_status` ({0}), must be one of {1}"
                .format(qualification_status, allowed_values)
            )

        self._qualification_status = qualification_status
