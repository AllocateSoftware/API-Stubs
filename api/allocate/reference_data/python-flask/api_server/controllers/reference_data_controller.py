import connexion
import six

from api_server.models.vocabulary import Vocabulary  # noqa: E501
from api_server.models.vocabulary_entry import VocabularyEntry  # noqa: E501
from api_server.models.vocabulary_type import VocabularyType  # noqa: E501
from api_server import util


def create_vocabulary_entry(id, vocabulary_entry):  # noqa: E501
    """create_vocabulary_entry

    Create a new entry in a vocabulary # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str
    :param vocabulary_entry: Details of the vocabulary entry
    :type vocabulary_entry: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        vocabulary_entry = VocabularyEntry.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_vocabulary_entry(id, element_id):  # noqa: E501
    """delete_vocabulary_entry

    Delete a vocabulary entry # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str
    :param element_id: The ID of the vocabulary element
    :type element_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_vocabularies(vocabulary_type_id=None, page=None, page_size=None):  # noqa: E501
    """get_vocabularies

    Return a list of vocabularies types that you may query # noqa: E501

    :param vocabulary_type_id: Limit to vocabulary types
    :type vocabulary_type_id: str
    :param page: Return page of results
    :type page: str
    :param page_size: Records per page
    :type page_size: str

    :rtype: List[Vocabulary]
    """
    return 'do some magic!'


def get_vocabulary(id):  # noqa: E501
    """get_vocabulary

    Return a list of vocabularies that you may query # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str

    :rtype: Vocabulary
    """
    return 'do some magic!'


def get_vocabulary_element(id, element_id):  # noqa: E501
    """get_vocabulary_element

    Return the elements of a vocabulary # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str
    :param element_id: The ID of the vocabulary element
    :type element_id: str

    :rtype: VocabularyEntry
    """
    return 'do some magic!'


def get_vocabulary_entries(id):  # noqa: E501
    """get_vocabulary_entries

    Return the elements of a vocabulary # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str

    :rtype: List[VocabularyEntry]
    """
    return 'do some magic!'


def get_vocabulary_type_by_id(id):  # noqa: E501
    """get_vocabulary_type_by_id

    Return a vocabulary type # noqa: E501

    :param id: The ID of the vocabulary type
    :type id: str

    :rtype: VocabularyType
    """
    return 'do some magic!'


def get_vocabulary_types():  # noqa: E501
    """get_vocabulary_types

    Return a list of vocabularies types that you may query # noqa: E501


    :rtype: List[VocabularyType]
    """
    return 'do some magic!'


def put_vocabulary_entry(id, element_id, vocabulary_entry):  # noqa: E501
    """put_vocabulary_entry

    Create a new entry in a vocabulary # noqa: E501

    :param id: The ID of the vocabulary
    :type id: str
    :param element_id: The ID of the vocabulary element
    :type element_id: str
    :param vocabulary_entry: Details of the vocabulary entry
    :type vocabulary_entry: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        vocabulary_entry = VocabularyEntry.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
