from typing import List, Dict
from aiohttp import web

from api_server.models.person_identifier import PersonIdentifier
from api_server import util


async def offer_worker(request: web.Request, booking_request_id, body) -> web.Response:
    """offer_worker

    Offer a worker for a booking

    :param booking_request_id: ID of the booking request to offer a worker for.
    :type booking_request_id: str
    :param body: Worker to be offered
    :type body: dict | bytes

    """
    body = PersonIdentifier.from_dict(body)
    return web.Response(status=200)
