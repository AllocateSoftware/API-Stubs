import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.duty_details import DutyDetails  # noqa: E501
from api_server import util


def cancel_duty(id):  # noqa: E501
    """cancel_duty

    Cancel a duty. Also cancels any bookings (if present). # noqa: E501

    :param id: ID of the duty
    :type id: str

    :rtype: None
    """
    return 'do some magic!'


def cancel_duty_booking(id):  # noqa: E501
    """cancel_duty_booking

    Cancel a duty booking. # noqa: E501

    :param id: ID of the duty
    :type id: str

    :rtype: None
    """
    return 'do some magic!'


def create_duty(duty_details):  # noqa: E501
    """create_duty

    Create a new Duty # noqa: E501

    :param duty_details: Duty to be sent to agency
    :type duty_details: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        duty_details = DutyDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def send_duty_for_fulfillment(id, destination):  # noqa: E501
    """send_duty_for_fulfillment

    Send a duty for fulfillment by contingent workforce (Bank, Cloudstaff, Agency) # noqa: E501

    :param id: ID of the duty
    :type id: str
    :param destination: Desination to send the duty
    :type destination: str

    :rtype: None
    """
    return 'do some magic!'
