from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.proposal_details import ProposalDetails
from api_server import util


async def accept_proposal(request: web.Request, id) -> web.Response:
    """accept_proposal

    Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow.

    :param id: The ID of the proposal
    :type id: str

    """
    return web.Response(status=200)


async def cancel_proposal(request: web.Request, id) -> web.Response:
    """cancel_proposal

    Cancel the proposal (and the booking, if it has been accepted)

    :param id: The ID of the proposal
    :type id: str

    """
    return web.Response(status=200)


async def get_proposal(request: web.Request, id) -> web.Response:
    """get_proposal

    

    :param id: The ID of the proposal
    :type id: str

    """
    return web.Response(status=200)


async def update_proposal(request: web.Request, id, body) -> web.Response:
    """update_proposal

    

    :param id: The ID of the proposal
    :type id: str
    :param body: Details of the proposal for filling the duty (worker)
    :type body: dict | bytes

    """
    body = ProposalDetails.from_dict(body)
    return web.Response(status=200)
