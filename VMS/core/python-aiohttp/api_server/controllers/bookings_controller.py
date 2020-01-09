from typing import List, Dict
from aiohttp import web

from api_server.models.duty_request import DutyRequest
from api_server import util


async def accept_agency_offer(request: web.Request, booking_request_id, offer_id) -> web.Response:
    """accept_agency_offer

    Accept an agency offer for a worker.

    :param booking_request_id: ID of the booking request to accept.
    :type booking_request_id: str
    :param offer_id: ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself.
    :type offer_id: str

    """
    return web.Response(status=200)


async def cancel_booking(request: web.Request, booking_id) -> web.Response:
    """cancel_booking

    Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.

    :param booking_id: ID of the booking to cancel.
    :type booking_id: str

    """
    return web.Response(status=200)


async def cancel_booking_request(request: web.Request, booking_request_id) -> web.Response:
    """cancel_booking_request

    Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.

    :param booking_request_id: ID of the booking request to cancel.
    :type booking_request_id: str

    """
    return web.Response(status=200)


async def get_booking(request: web.Request, booking_id) -> web.Response:
    """get_booking

    Query a duty booking by id

    :param booking_id: ID of the duty booking
    :type booking_id: str

    """
    return web.Response(status=200)
