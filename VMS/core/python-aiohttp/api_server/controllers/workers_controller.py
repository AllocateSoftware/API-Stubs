from typing import List, Dict
from aiohttp import web

from api_server.models.person import Person
from api_server import util


async def get_worker(request: web.Request, id) -> web.Response:
    """get_worker

    Get the details of a person (worker) from the VMS

    :param id: ID of the worker within the VMS.
    :type id: str

    """
    return web.Response(status=200)
