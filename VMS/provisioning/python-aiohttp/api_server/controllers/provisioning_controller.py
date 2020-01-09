from typing import List, Dict
from aiohttp import web

from api_server.models.structure_provision import StructureProvision
from api_server.models.user_provision import UserProvision
from api_server import util


async def provision_structure(request: web.Request, id, body) -> web.Response:
    """provision_structure

    Provision the supplied structure.

    :param id: ID of the customer to provision
    :type id: str
    :param body: Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.
    :type body: dict | bytes

    """
    body = StructureProvision.from_dict(body)
    return web.Response(status=200)


async def provision_user(request: web.Request, id, body) -> web.Response:
    """provision_user

    Provision the supplied user.

    :param id: ID of the user to provision
    :type id: str
    :param body: Structure of the User
    :type body: dict | bytes

    """
    body = UserProvision.from_dict(body)
    return web.Response(status=200)
