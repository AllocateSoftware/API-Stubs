from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.duty_details import DutyDetails
from api_server import util


async def cancel_duty(request: web.Request, id) -> web.Response:
    """cancel_duty

    Cancel a duty. Also cancels any bookings (if present).

    :param id: ID of the duty
    :type id: str

    """
    return web.Response(status=200)


async def cancel_duty_booking(request: web.Request, id) -> web.Response:
    """cancel_duty_booking

    Cancel a duty booking.

    :param id: ID of the duty
    :type id: str

    """
    return web.Response(status=200)


async def create_duty(request: web.Request, body) -> web.Response:
    """create_duty

    Create a new Duty

    :param body: Duty to be sent to agency
    :type body: dict | bytes

    """
    body = DutyDetails.from_dict(body)
    return web.Response(status=200)


async def send_duty_for_fulfillment(request: web.Request, id, destination) -> web.Response:
    """send_duty_for_fulfillment

    Send a duty for fulfillment by contingent workforce (Bank, Cloudstaff, Agency)

    :param id: ID of the duty
    :type id: str
    :param destination: Desination to send the duty
    :type destination: str

    """
    return web.Response(status=200)
