package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.OrderStatistic;

    public class OrderStatisticsRequestList implements ListWrapper {
        // This declaration below of _OrderStatisticsRequest_obj_class is to force flash compiler to include this class
        private var _orderStatisticsRequest_obj_class: org.openapitools.client.model.OrderStatisticsRequest = null;
        [XmlElements(name="orderStatisticsRequest", type="org.openapitools.client.model.OrderStatisticsRequest")]
        public var orderStatisticsRequest: Array = new Array();

        public function getList(): Array{
            return orderStatisticsRequest;
        }

}

}
