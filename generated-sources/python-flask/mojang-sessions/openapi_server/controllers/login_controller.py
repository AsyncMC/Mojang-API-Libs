import connexion
import six

from openapi_server.models.player_profile import PlayerProfile  # noqa: E501
from openapi_server.models.session_api_error import SessionApiError  # noqa: E501
from openapi_server import util


def get_player_profile(stripped_uuid, unsigned=None):  # noqa: E501
    """Gets the player&#39;s game profile

    This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like. # noqa: E501

    :param stripped_uuid: The player UUID without hyphens
    :type stripped_uuid: str
    :param unsigned: When set to false, the signature data are sent
    :type unsigned: bool

    :rtype: PlayerProfile
    """
    return 'do some magic!'
