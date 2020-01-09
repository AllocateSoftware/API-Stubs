from typing import List, Dict
from aiohttp import web

from api_server.models.mapping import Mapping
from api_server.models.mapping_set import MappingSet
from api_server import util


async def create_mapping(request: web.Request, set_id, body) -> web.Response:
    """create_mapping

    Create a new entry in a mapping set

    :param set_id: The ID of the mapping set
    :type set_id: str
    :param body: Details of the mapping
    :type body: dict | bytes

    """
    body = Mapping.from_dict(body)
    return web.Response(status=200)


async def delete_mapping(request: web.Request, id, mapping_id) -> web.Response:
    """delete_mapping

    Delete a vocabulary entry

    :param id: The ID of the vocabulary
    :type id: str
    :param mapping_id: The ID of the mapping
    :type mapping_id: str

    """
    return web.Response(status=200)


async def get_mapping(request: web.Request, id, mapping_id) -> web.Response:
    """get_mapping

    Return the mapping

    :param id: The ID of the mapping set
    :type id: str
    :param mapping_id: The ID of the mapping set element
    :type mapping_id: str

    """
    return web.Response(status=200)


async def get_mapping_set_by_id(request: web.Request, set_id) -> web.Response:
    """get_mapping_set_by_id

    Get a mapping set by ID

    :param set_id: The ID of the vocabulary type
    :type set_id: str

    """
    return web.Response(status=200)


async def get_mapping_sets(request: web.Request, ) -> web.Response:
    """get_mapping_sets

    Return a list of mapping sets that you may utilise


    """
    return web.Response(status=200)


async def get_mappings(request: web.Request, set_id, from_code=None) -> web.Response:
    """get_mappings

    Return the elements of a mapping set

    :param set_id: The ID of the mapping set
    :type set_id: str
    :param from_code: Search for a mapping where the from code matches the provided string
    :type from_code: str

    """
    return web.Response(status=200)


async def put_mapping(request: web.Request, id, mapping_id, body) -> web.Response:
    """put_mapping

    Update a mapping

    :param id: The ID of the vocabulary
    :type id: str
    :param mapping_id: The ID of the vocabulary element
    :type mapping_id: str
    :param body: Details of the mapping
    :type body: dict | bytes

    """
    body = Mapping.from_dict(body)
    return web.Response(status=200)
