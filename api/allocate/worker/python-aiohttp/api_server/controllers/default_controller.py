from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.person import Person
from api_server.models.worker_registration_response import WorkerRegistrationResponse
from api_server import util


async def get_worker(request: web.Request, id) -> web.Response:
    """get_worker

    Retrieve worker details from the Allocate ecosystem using the Allocate Worker id. The Allocate Worker id will be issued when registering a worker.  

    :param id: The ID of the worker
    :type id: str

    """
    return web.Response(status=200)


async def register_worker(request: web.Request, body) -> web.Response:
    """register_worker

    Provide worker details for inclusion into the Allocate ecosystem.  The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier.  This may entail an on-boarding process, so the final response may require human interaction before it can be completed.  Where there is a source system in common, such as HealthSuite and a Bank system both using ESR as a source of worker data, a person record containing an ESR trust-relative Staff Number is likely to be sufficient. 

    :param body: Worker information
    :type body: dict | bytes

    """
    body = Person.from_dict(body)
    return web.Response(status=200)
