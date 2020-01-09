import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
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
