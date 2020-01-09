import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.person import Person  # noqa: E501
from api_server.models.worker_registration_response import WorkerRegistrationResponse  # noqa: E501
from api_server import util


def get_worker(id):  # noqa: E501
    """get_worker

    Retrieve worker details from the Allocate ecosystem using the Allocate Worker id. The Allocate Worker id will be issued when registering a worker.   # noqa: E501

    :param id: The ID of the worker
    :type id: str

    :rtype: Person
    """
    return 'do some magic!'


def register_worker(person):  # noqa: E501
    """register_worker

    Provide worker details for inclusion into the Allocate ecosystem.  The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier.  This may entail an on-boarding process, so the final response may require human interaction before it can be completed.  Where there is a source system in common, such as HealthSuite and a Bank system both using ESR as a source of worker data, a person record containing an ESR trust-relative Staff Number is likely to be sufficient.  # noqa: E501

    :param person: Worker information
    :type person: dict | bytes

    :rtype: WorkerRegistrationResponse
    """
    if connexion.request.is_json:
        person = Person.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
