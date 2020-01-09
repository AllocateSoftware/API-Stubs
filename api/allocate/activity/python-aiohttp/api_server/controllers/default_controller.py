from typing import List, Dict
from aiohttp import web

from api_server.models.error_response import ErrorResponse
from api_server.models.hours_assignment import HoursAssignment
from api_server import util


async def get_activities(request: web.Request, customer_code, format=None) -> web.Response:
    """get_activities

    Provide hours and assignment details for workers

    :param customer_code: The code for the customer (trust) for which the activities should be returned
    :type customer_code: str
    :param format: Format for the output. TBD, but may be used to control the scope of information returned.
    :type format: str

    """
    return web.Response(status=200)
