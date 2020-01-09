from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.inline_object import InlineObject
from api_server import util


async def onboard_worker_to_trust(request: web.Request, id, body) -> web.Response:
    """onboard_worker_to_trust

    On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to &#39;on-board&#39; that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  

    :param id: The Allocate Worker ID
    :type id: str
    :param body: 
    :type body: dict | bytes

    """
    body = InlineObject.from_dict(body)
    return web.Response(status=200)
