import connexion
import six

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.skin_model import SkinModel  # noqa: E501
from openapi_server import util


def change_player_skin(stripped_uuid, url, model=None):  # noqa: E501
    """Changes the player skin by URL

    This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts. # noqa: E501

    :param stripped_uuid: The player UUID without hyphens
    :type stripped_uuid: str
    :param url: The URL which Mojang servers will download and apply the skin
    :type url: str
    :param model: 
    :type model: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        model = SkinModel.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reset_player_skin(stripped_uuid):  # noqa: E501
    """Resets the player skin to default

     # noqa: E501

    :param stripped_uuid: The player UUID without hyphens
    :type stripped_uuid: str

    :rtype: None
    """
    return 'do some magic!'


def upload_player_skin(stripped_uuid, file, model=None):  # noqa: E501
    """Changes the player skin by upload

    This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well. # noqa: E501

    :param stripped_uuid: The player UUID without hyphens
    :type stripped_uuid: str
    :param file: The skin image in PNG format
    :type file: str
    :param model: 
    :type model: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        model = SkinModel.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
