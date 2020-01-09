import connexion
import six

from api_server.models.mapping import Mapping  # noqa: E501
from api_server.models.mapping_set import MappingSet  # noqa: E501
from api_server import util


def create_mapping(set_id, mapping):  # noqa: E501
    """create_mapping

    Create a new entry in a mapping set # noqa: E501

    :param set_id: The ID of the mapping set
    :type set_id: str
    :param mapping: Details of the mapping
    :type mapping: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        mapping = Mapping.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_mapping(id, mapping_id):  # noqa: E501
    """delete_mapping

    Delete a vocabulary entry # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str
    :param mapping_id: The ID of the mapping
    :type mapping_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_mapping(id, mapping_id):  # noqa: E501
    """get_mapping

    Return the mapping # noqa: E501

    :param id: The ID of the mapping set
    :type id: str
    :param mapping_id: The ID of the mapping set element
    :type mapping_id: str

    :rtype: Mapping
    """
    return 'do some magic!'


def get_mapping_set_by_id(set_id):  # noqa: E501
    """get_mapping_set_by_id

    Get a mapping set by ID # noqa: E501

    :param set_id: The ID of the vocabulary type
    :type set_id: str

    :rtype: MappingSet
    """
    return 'do some magic!'


def get_mapping_sets():  # noqa: E501
    """get_mapping_sets

    Return a list of mapping sets that you may utilise # noqa: E501


    :rtype: List[MappingSet]
    """
    return 'do some magic!'


def get_mappings(set_id, from_code=None):  # noqa: E501
    """get_mappings

    Return the elements of a mapping set # noqa: E501

    :param set_id: The ID of the mapping set
    :type set_id: str
    :param from_code: Search for a mapping where the from code matches the provided string
    :type from_code: str

    :rtype: List[Mapping]
    """
    return 'do some magic!'


def put_mapping(id, mapping_id, mapping):  # noqa: E501
    """put_mapping

    Update a mapping # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str
    :param mapping_id: The ID of the vocabulary element
    :type mapping_id: str
    :param mapping: Details of the mapping
    :type mapping: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        mapping = Mapping.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
