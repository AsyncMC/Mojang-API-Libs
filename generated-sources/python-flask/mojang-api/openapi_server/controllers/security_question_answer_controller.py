import connexion
import six

from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.error import Error  # noqa: E501
from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.security_answer import SecurityAnswer  # noqa: E501
from openapi_server.com.github.asyncmc.mojang.api.python.flask.model.security_challenge import SecurityChallenge  # noqa: E501
from openapi_server import util


def check_security_status():  # noqa: E501
    """Check if security questions are needed

     # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def list_pending_security_questions():  # noqa: E501
    """Get list of questions

     # noqa: E501


    :rtype: List[SecurityChallenge]
    """
    return 'do some magic!'


def send_security_question_answers(security_answer):  # noqa: E501
    """Send back the answers

     # noqa: E501

    :param security_answer: An array with all the answers
    :type security_answer: list | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        security_answer = [SecurityAnswer.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
