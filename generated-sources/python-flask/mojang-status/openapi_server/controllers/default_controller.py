import connexion
import six

from openapi_server.com.github.asyncmc.mojang.status.python.flask.model.api_status import ApiStatus  # noqa: E501
from openapi_server import util


def check_statuses():  # noqa: E501
    """Checks the Mojang service statuses

     # noqa: E501


    :rtype: List[Dict[str, ApiStatus]]
    """
    return 'do some magic!'
