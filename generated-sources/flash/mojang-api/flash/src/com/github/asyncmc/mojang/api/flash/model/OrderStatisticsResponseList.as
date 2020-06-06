package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;

    public class OrderStatisticsResponseList implements ListWrapper {
        // This declaration below of _OrderStatisticsResponse_obj_class is to force flash compiler to include this class
        private var _orderStatisticsResponse_obj_class: com.github.asyncmc.mojang.api.flash.model.OrderStatisticsResponse = null;
        [XmlElements(name="orderStatisticsResponse", type="com.github.asyncmc.mojang.api.flash.model.OrderStatisticsResponse")]
        public var orderStatisticsResponse: Array = new Array();

        public function getList(): Array{
            return orderStatisticsResponse;
        }

}

}
