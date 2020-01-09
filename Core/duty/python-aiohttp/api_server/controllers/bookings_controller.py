from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.duty_cost_details import DutyCostDetails
from api_server import util


async def send_duty_costing(request: web.Request, id, body) -> web.Response:
    """send_duty_costing

    

    :param id: ID of the duty
    :type id: str
    :param body: Costing Information
    :type body: dict | bytes

    """
    body = DutyCostDetails.from_dict(body)
    return web.Response(status=200)
