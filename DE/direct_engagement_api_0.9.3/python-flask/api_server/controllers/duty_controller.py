import connexion
import six

from api_server.models.booking_info import BookingInfo  # noqa: E501
from api_server.models.booking_response import BookingResponse  # noqa: E501
from api_server.models.contract_status import ContractStatus  # noqa: E501
from api_server.models.duty import Duty  # noqa: E501
from api_server.models.inline_object import InlineObject  # noqa: E501
from api_server import util


def cancel_duty(version, trust_code, duty_id):  # noqa: E501
    """Cancel a duty

    Service that cancels certain duty. # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int

    :rtype: None
    """
    return 'do some magic!'


def fill_duty(version, trust_code, duty_id, booking_info):  # noqa: E501
    """Creates booking for duty

    Service that will create new booking on HR side with data sent by DE Provider. # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int
    :param booking_info: 
    :type booking_info: dict | bytes

    :rtype: BookingResponse
    """
    if connexion.request.is_json:
        booking_info = BookingInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_duty_details(version, trust_code, id, page=None, page_size=None):  # noqa: E501
    """Returns details about a duties.

    Returns details about a duties. # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param id: IDs of the duties to return
    :type id: List[int]
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: Duty
    """
    return 'do some magic!'


def get_single_duty_details(version, trust_code, duty_id, page=None, page_size=None):  # noqa: E501
    """Returns details about a duties.

    Returns details about a duties. # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of a duty to return
    :type duty_id: int
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: Duty
    """
    return 'do some magic!'


def update_contract_status(version, trust_code, duty_id, contract_id, status_id):  # noqa: E501
    """Updates DE Contract status

    Service that will be used by DE Provider to update the contract status, after DE contract is created/approved. # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int
    :param contract_id: ID of the contract from DE Provider&#39;s system
    :type contract_id: str
    :param status_id: 
    :type status_id: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        status_id = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_timesheets(version, trust_code, duty_id, inline_object):  # noqa: E501
    """Updates timesheet for duty

    Service that will be used by DE Provider to update the timesheets, after approving the payment on their side. # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int
    :param inline_object: 
    :type inline_object: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        inline_object = InlineObject.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
