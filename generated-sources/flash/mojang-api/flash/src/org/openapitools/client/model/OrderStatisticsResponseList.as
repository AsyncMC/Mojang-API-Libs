package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class OrderStatisticsResponseList implements ListWrapper {
        // This declaration below of _OrderStatisticsResponse_obj_class is to force flash compiler to include this class
        private var _orderStatisticsResponse_obj_class: org.openapitools.client.model.OrderStatisticsResponse = null;
        [XmlElements(name="orderStatisticsResponse", type="org.openapitools.client.model.OrderStatisticsResponse")]
        public var orderStatisticsResponse: Array = new Array();

        public function getList(): Array{
            return orderStatisticsResponse;
        }

}

}
