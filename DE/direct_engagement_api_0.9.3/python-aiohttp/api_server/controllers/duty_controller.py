from typing import List, Dict
from aiohttp import web

from api_server.models.booking_info import BookingInfo
from api_server.models.booking_response import BookingResponse
from api_server.models.contract_status import ContractStatus
from api_server.models.duty import Duty
from api_server.models.inline_object import InlineObject
from api_server import util


async def cancel_duty(request: web.Request, version, trust_code, duty_id) -> web.Response:
    """Cancel a duty

    Service that cancels certain duty.

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int

    """
    return web.Response(status=200)


async def fill_duty(request: web.Request, version, trust_code, duty_id, body) -> web.Response:
    """Creates booking for duty

    Service that will create new booking on HR side with data sent by DE Provider.

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = BookingInfo.from_dict(body)
    return web.Response(status=200)


async def get_duty_details(request: web.Request, version, trust_code, id, page=None, page_size=None) -> web.Response:
    """Returns details about a duties.

    Returns details about a duties.

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param id: IDs of the duties to return
    :type id: List[int]
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)


async def get_single_duty_details(request: web.Request, version, trust_code, duty_id, page=None, page_size=None) -> web.Response:
    """Returns details about a duties.

    Returns details about a duties.

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of a duty to return
    :type duty_id: int
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)


async def update_contract_status(request: web.Request, version, trust_code, duty_id, contract_id, status_id) -> web.Response:
    """Updates DE Contract status

    Service that will be used by DE Provider to update the contract status, after DE contract is created/approved.

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int
    :param contract_id: ID of the contract from DE Provider&#39;s system
    :type contract_id: str
    :param status_id: 
    :type status_id: dict | bytes

    """
    status_id = .from_dict(status_id)
    return web.Response(status=200)


async def update_timesheets(request: web.Request, version, trust_code, duty_id, body) -> web.Response:
    """Updates timesheet for duty

    Service that will be used by DE Provider to update the timesheets, after approving the payment on their side.

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param duty_id: ID of the duty associated with the DE contract
    :type duty_id: int
    :param body: 
    :type body: dict | bytes

    """
    body = InlineObject.from_dict(body)
    return web.Response(status=200)
