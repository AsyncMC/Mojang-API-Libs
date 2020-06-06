import connexion
import six

from openapi_server.models.order_statistics_request import OrderStatisticsRequest  # noqa: E501
from openapi_server.models.order_statistics_response import OrderStatisticsResponse  # noqa: E501
from openapi_server import util


def get_orders_statistics(order_statistics_request):  # noqa: E501
    """Get statistics on the sales of Minecraft.

     # noqa: E501

    :param order_statistics_request: The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
    :type order_statistics_request: dict | bytes

    :rtype: OrderStatisticsResponse
    """
    if connexion.request.is_json:
        order_statistics_request = OrderStatisticsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
