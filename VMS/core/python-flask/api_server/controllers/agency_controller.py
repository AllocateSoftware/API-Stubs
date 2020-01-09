import connexion
import six

from api_server.models.person_identifier import PersonIdentifier  # noqa: E501
from api_server import util


def offer_worker(booking_request_id, person_identifier):  # noqa: E501
    """offer_worker

    Offer a worker for a booking # noqa: E501

    :param booking_request_id: ID of the booking request to offer a worker for.
    :type booking_request_id: str
    :param person_identifier: Worker to be offered
    :type person_identifier: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        person_identifier = PersonIdentifier.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
