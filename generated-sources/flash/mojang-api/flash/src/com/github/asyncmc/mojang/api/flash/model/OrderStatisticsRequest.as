package com.github.asyncmc.mojang.api.flash.model {

import com.github.asyncmc.mojang.api.flash.model.OrderStatistic;

    [XmlRootNode(name="OrderStatisticsRequest")]
    public class OrderStatisticsRequest {
                // This declaration below of _metricKeys_obj_class is to force flash compiler to include this class
        private var _metricKeys_obj_class: Array = null;
        [XmlElementWrapper(name="metricKeys")]
        [XmlElements(name="metricKeys", type="Array")]
                public var metricKeys: Array = new Array();

    public function toString(): String {
        var str: String = "OrderStatisticsRequest: ";
        str += " (metricKeys: " + metricKeys + ")";
        return str;
    }

}

}
