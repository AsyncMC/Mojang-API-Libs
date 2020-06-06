import connexion
import six

from openapi_server.models.access_keys import AccessKeys  # noqa: E501
from openapi_server.models.authentication import Authentication  # noqa: E501
from openapi_server.models.authentication_request import AuthenticationRequest  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.refresh_request import RefreshRequest  # noqa: E501
from openapi_server.models.refresh_response import RefreshResponse  # noqa: E501
from openapi_server.models.username_password import UsernamePassword  # noqa: E501
from openapi_server import util


def authenticate(authentication_request):  # noqa: E501
    """authenticate

     # noqa: E501

    :param authentication_request: 
    :type authentication_request: dict | bytes

    :rtype: Authentication
    """
    if connexion.request.is_json:
        authentication_request = AuthenticationRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def invalidate(access_keys):  # noqa: E501
    """invalidate

     # noqa: E501

    :param access_keys: 
    :type access_keys: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        access_keys = AccessKeys.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def refresh(refresh_request):  # noqa: E501
    """refresh

     # noqa: E501

    :param refresh_request: 
    :type refresh_request: dict | bytes

    :rtype: RefreshResponse
    """
    if connexion.request.is_json:
        refresh_request = RefreshRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def siginout(username_password):  # noqa: E501
    """siginout

     # noqa: E501

    :param username_password: 
    :type username_password: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        username_password = UsernamePassword.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def validate(access_keys):  # noqa: E501
    """validate

     # noqa: E501

    :param access_keys: 
    :type access_keys: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        access_keys = AccessKeys.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
