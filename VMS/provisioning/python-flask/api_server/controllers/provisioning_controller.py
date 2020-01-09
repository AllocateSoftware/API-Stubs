import connexion
import six

from api_server.models.structure_provision import StructureProvision  # noqa: E501
from api_server.models.user_provision import UserProvision  # noqa: E501
from api_server import util


def provision_structure(id, structure_provision):  # noqa: E501
    """provision_structure

    Provision the supplied structure. # noqa: E501

    :param id: ID of the customer to provision
    :type id: str
    :param structure_provision: Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.
    :type structure_provision: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        structure_provision = StructureProvision.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def provision_user(id, user_provision):  # noqa: E501
    """provision_user

    Provision the supplied user. # noqa: E501

    :param id: ID of the user to provision
    :type id: str
    :param user_provision: Structure of the User
    :type user_provision: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        user_provision = UserProvision.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
