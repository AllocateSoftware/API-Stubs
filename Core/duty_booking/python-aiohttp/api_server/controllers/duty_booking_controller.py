from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.proposal_details import ProposalDetails
from api_server import util


async def cancel_proposal(request: web.Request, id) -> web.Response:
    """cancel_proposal

    Cancel the proposal (and the booking, if it has been accepted)

    :param id: ID of the proposal
    :type id: str

    """
    return web.Response(status=200)


async def create_proposal(request: web.Request, vacancy_id, body) -> web.Response:
    """create_proposal

    Offer a worker for filling a duty

    :param vacancy_id: The ID of the vacancy
    :type vacancy_id: str
    :param body: Details of the proposal for filling the duty (worker)
    :type body: dict | bytes

    """
    body = ProposalDetails.from_dict(body)
    return web.Response(status=200)


async def update_proposal(request: web.Request, id, body) -> web.Response:
    """update_proposal

    

    :param id: ID of the proposal
    :type id: str
    :param body: Details of the proposal for filling the duty (worker)
    :type body: dict | bytes

    """
    body = ProposalDetails.from_dict(body)
    return web.Response(status=200)
