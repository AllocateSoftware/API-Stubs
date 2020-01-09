import connexion
import six

from api_server.models.agency_costings import AgencyCostings  # noqa: E501
from api_server.models.duty import Duty  # noqa: E501
from api_server.models.duty_request import DutyRequest  # noqa: E501
from api_server import util


def get_costings(duty):  # noqa: E501
    """get_costings

    Returns a list of agencies and their costs for the supplied duty. # noqa: E501

    :param duty: Duty to be costed
    :type duty: dict | bytes

    :rtype: AgencyCostings
    """
    if connexion.request.is_json:
        duty = Duty.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def send_duty_to_agencies(duty_request):  # noqa: E501
    """send_duty_to_agencies

    Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies. # noqa: E501

    :param duty_request: Duty to be sent to agency
    :type duty_request: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        duty_request = DutyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def send_duty_to_agency(agency_id, duty_request):  # noqa: E501
    """send_duty_to_agency

    Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking. # noqa: E501

    :param agency_id: ID of the agency to send the request to.
    :type agency_id: str
    :param duty_request: Duty to be sent to agency
    :type duty_request: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        duty_request = DutyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
