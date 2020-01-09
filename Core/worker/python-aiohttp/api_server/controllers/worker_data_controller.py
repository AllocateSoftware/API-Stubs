from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.person import Person
from api_server.models.worker_registration_response import WorkerRegistrationResponse
from api_server import util


async def register_worker(request: web.Request, body) -> web.Response:
    """register_worker

    Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.

    :param body: Worker information
    :type body: dict | bytes

    """
    body = Person.from_dict(body)
    return web.Response(status=200)
