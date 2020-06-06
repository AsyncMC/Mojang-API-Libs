package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class OrderStatisticList implements ListWrapper {
        // This declaration below of _OrderStatistic_obj_class is to force flash compiler to include this class
        private var _orderStatistic_obj_class: org.openapitools.client.model.OrderStatistic = null;
        [XmlElements(name="orderStatistic", type="org.openapitools.client.model.OrderStatistic")]
        public var orderStatistic: Array = new Array();

        public function getList(): Array{
            return orderStatistic;
        }

}

}
