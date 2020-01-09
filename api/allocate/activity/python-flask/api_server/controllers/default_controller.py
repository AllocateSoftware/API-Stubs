import connexion
import six

from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.hours_assignment import HoursAssignment  # noqa: E501
from api_server import util


def get_activities(customer_code, format=None):  # noqa: E501
    """get_activities

    Provide hours and assignment details for workers # noqa: E501

    :param customer_code: The code for the customer (trust) for which the activities should be returned
    :type customer_code: str
    :param format: Format for the output. TBD, but may be used to control the scope of information returned.
    :type format: str

    :rtype: List[HoursAssignment]
    """
    return 'do some magic!'
