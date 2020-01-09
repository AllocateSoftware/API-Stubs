import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.duty_cost_details import DutyCostDetails  # noqa: E501
from api_server import util


def send_duty_costing(id, duty_cost_details):  # noqa: E501
    """send_duty_costing

     # noqa: E501

    :param id: ID of the duty
    :type id: str
    :param duty_cost_details: Costing Information
    :type duty_cost_details: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        duty_cost_details = DutyCostDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
