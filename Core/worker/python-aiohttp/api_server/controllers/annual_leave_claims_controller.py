from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.leave_claim import LeaveClaim
from api_server import util


async def submit_annual_leave_claim(request: web.Request, id, body) -> web.Response:
    """submit_annual_leave_claim

    Submit an leave (vacation) claim for a worker

    :param id: ID of the worker
    :type id: str
    :param body: Leave claim for a worker
    :type body: dict | bytes

    """
    body = LeaveClaim.from_dict(body)
    return web.Response(status=200)
