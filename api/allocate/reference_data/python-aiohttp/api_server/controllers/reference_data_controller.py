from typing import List, Dict
from aiohttp import web

from api_server.models.vocabulary import Vocabulary
from api_server.models.vocabulary_entry import VocabularyEntry
from api_server.models.vocabulary_type import VocabularyType
from api_server import util


async def create_vocabulary_entry(request: web.Request, id, body) -> web.Response:
    """create_vocabulary_entry

    Create a new entry in a vocabulary

    :param id: The ID of the vocabulary
    :type id: str
    :param body: Details of the vocabulary entry
    :type body: dict | bytes

    """
    body = VocabularyEntry.from_dict(body)
    return web.Response(status=200)


async def delete_vocabulary_entry(request: web.Request, id, element_id) -> web.Response:
    """delete_vocabulary_entry

    Delete a vocabulary entry

    :param id: The ID of the vocabulary
    :type id: str
    :param element_id: The ID of the vocabulary element
    :type element_id: str

    """
    return web.Response(status=200)


async def get_vocabularies(request: web.Request, vocabulary_type_id=None, page=None, page_size=None) -> web.Response:
    """get_vocabularies

    Return a list of vocabularies types that you may query

    :param vocabulary_type_id: Limit to vocabulary types
    :type vocabulary_type_id: str
    :param page: Return page of results
    :type page: str
    :param page_size: Records per page
    :type page_size: str

    """
    return web.Response(status=200)


async def get_vocabulary(request: web.Request, id) -> web.Response:
    """get_vocabulary

    Return a list of vocabularies that you may query

    :param id: The ID of the vocabulary
    :type id: str

    """
    return web.Response(status=200)


async def get_vocabulary_element(request: web.Request, id, element_id) -> web.Response:
    """get_vocabulary_element

    Return the elements of a vocabulary

    :param id: The ID of the vocabulary
    :type id: str
    :param element_id: The ID of the vocabulary element
    :type element_id: str

    """
    return web.Response(status=200)


async def get_vocabulary_entries(request: web.Request, id) -> web.Response:
    """get_vocabulary_entries

    Return the elements of a vocabulary

    :param id: The ID of the vocabulary
    :type id: str

    """
    return web.Response(status=200)


async def get_vocabulary_type_by_id(request: web.Request, id) -> web.Response:
    """get_vocabulary_type_by_id

    Return a vocabulary type

    :param id: The ID of the vocabulary type
    :type id: str

    """
    return web.Response(status=200)


async def get_vocabulary_types(request: web.Request, ) -> web.Response:
    """get_vocabulary_types

    Return a list of vocabularies types that you may query


    """
    return web.Response(status=200)


async def put_vocabulary_entry(request: web.Request, id, element_id, body) -> web.Response:
    """put_vocabulary_entry

    Create a new entry in a vocabulary

    :param id: The ID of the vocabulary
    :type id: str
    :param element_id: The ID of the vocabulary element
    :type element_id: str
    :param body: Details of the vocabulary entry
    :type body: dict | bytes

    """
    body = VocabularyEntry.from_dict(body)
    return web.Response(status=200)
