# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.models.order_statistics_request import OrderStatisticsRequest  # noqa: E501
from openapi_server.models.order_statistics_response import OrderStatisticsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMiscellaneousController(BaseTestCase):
    """MiscellaneousController integration test stubs"""

    def test_get_orders_statistics(self):
        """Test case for get_orders_statistics

        Get statistics on the sales of Minecraft.
        """
        order_statistics_request = OrderStatisticsRequest()
        response = self.client.open(
            '/orders/statistics',
            method='POST',
            data=json.dumps(order_statistics_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
