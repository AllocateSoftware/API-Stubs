import connexion
import six

from api_server.models.duty import Duty  # noqa: E501
from api_server import util


def get_events(version, trust_code, date_time_from, page=None, page_size=None):  # noqa: E501
    """Get all events older than input timestamp

    Returns an array of events # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param date_time_from: Timestamp
    :type date_time_from: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: Duty
    """
    date_time_from = util.deserialize_datetime(date_time_from)
    return 'do some magic!'
