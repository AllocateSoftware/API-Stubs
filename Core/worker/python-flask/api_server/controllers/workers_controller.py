import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.leave_claim import LeaveClaim  # noqa: E501
from api_server.models.person import Person  # noqa: E501
from api_server.models.worker_registration_response import WorkerRegistrationResponse  # noqa: E501
from api_server import util


def register_worker(person):  # noqa: E501
    """register_worker

    Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed. # noqa: E501

    :param person: Worker information
    :type person: dict | bytes

    :rtype: WorkerRegistrationResponse
    """
    if connexion.request.is_json:
        person = Person.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


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
