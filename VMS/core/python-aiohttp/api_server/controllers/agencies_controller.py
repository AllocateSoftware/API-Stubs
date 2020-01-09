from typing import List, Dict
from aiohttp import web

from api_server.models.agency_costings import AgencyCostings
from api_server.models.duty import Duty
from api_server.models.duty_request import DutyRequest
from api_server import util


async def get_costings(request: web.Request, body) -> web.Response:
    """get_costings

    Returns a list of agencies and their costs for the supplied duty.

    :param body: Duty to be costed
    :type body: dict | bytes

    """
    body = Duty.from_dict(body)
    return web.Response(status=200)


async def send_duty_to_agencies(request: web.Request, body) -> web.Response:
    """send_duty_to_agencies

    Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.

    :param body: Duty to be sent to agency
    :type body: dict | bytes

    """
    body = DutyRequest.from_dict(body)
    return web.Response(status=200)


async def send_duty_to_agency(request: web.Request, agency_id, body) -> web.Response:
    """send_duty_to_agency

    Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.

    :param agency_id: ID of the agency to send the request to.
    :type agency_id: str
    :param body: Duty to be sent to agency
    :type body: dict | bytes

    """
    body = DutyRequest.from_dict(body)
    return web.Response(status=200)
