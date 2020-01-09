import connexion
import six

from api_server.models.duty_request import DutyRequest  # noqa: E501
from api_server import util


def accept_agency_offer(booking_request_id, offer_id):  # noqa: E501
    """accept_agency_offer

    Accept an agency offer for a worker. # noqa: E501

    :param booking_request_id: ID of the booking request to accept.
    :type booking_request_id: str
    :param offer_id: ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself.
    :type offer_id: str

    :rtype: str
    """
    return 'do some magic!'


def cancel_booking(booking_id):  # noqa: E501
    """cancel_booking

    Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades. # noqa: E501

    :param booking_id: ID of the booking to cancel.
    :type booking_id: str

    :rtype: None
    """
    return 'do some magic!'


def cancel_booking_request(booking_request_id):  # noqa: E501
    """cancel_booking_request

    Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled. # noqa: E501

    :param booking_request_id: ID of the booking request to cancel.
    :type booking_request_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_booking(booking_id):  # noqa: E501
    """get_booking

    Query a duty booking by id # noqa: E501

    :param booking_id: ID of the duty booking
    :type booking_id: str

    :rtype: DutyRequest
    """
    return 'do some magic!'
