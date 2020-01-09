import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.leave_claim import LeaveClaim  # noqa: E501
from api_server import util


def submit_annual_leave_claim(id, leave_claim):  # noqa: E501
    """submit_annual_leave_claim

    Submit an leave (vacation) claim for a worker # noqa: E501

    :param id: ID of the worker
    :type id: str
    :param leave_claim: Leave claim for a worker
    :type leave_claim: dict | bytes

    :rtype: AsyncResponse
    """
    if connexion.request.is_json:
        leave_claim = LeaveClaim.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
