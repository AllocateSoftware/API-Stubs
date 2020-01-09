import connexion
import six

from api_server.models.person import Person  # noqa: E501
from api_server import util


def get_worker(id):  # noqa: E501
    """get_worker

    Get the details of a person (worker) from the VMS # noqa: E501

    :param id: ID of the worker within the VMS.
    :type id: str

    :rtype: Person
    """
    return 'do some magic!'
