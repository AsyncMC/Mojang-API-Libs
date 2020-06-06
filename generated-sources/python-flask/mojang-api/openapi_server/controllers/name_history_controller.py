import connexion
import six

from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.current_player_i_ds import CurrentPlayerIDs  # noqa: E501
from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.error import Error  # noqa: E501
from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.name_change import NameChange  # noqa: E501
from openapi_server import util


def find_unique_ids_by_name(request_body):  # noqa: E501
    """Find the current UUID of multiple players at once

    Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned. # noqa: E501

    :param request_body: Array with the player names
    :type request_body: List[str]

    :rtype: List[CurrentPlayerIDs]
    """
    return 'do some magic!'


def get_name_history(stripped_uuid):  # noqa: E501
    """Gets the full player&#39;s name history

     # noqa: E501

    :param stripped_uuid: The player UUID without hyphens
    :type stripped_uuid: str

    :rtype: List[NameChange]
    """
    return 'do some magic!'


def get_unique_id_by_name(username, at=None):  # noqa: E501
    """Find the UUID by name

    Find the current player name, UUID, demo status and migration flag by the current player name or at a given time. # noqa: E501

    :param username: The username in a given time, or in present if \&quot;at\&quot; is not sent
    :type username: str
    :param at: Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
    :type at: int

    :rtype: CurrentPlayerIDs
    """
    return 'do some magic!'
