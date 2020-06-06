package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AgentList implements ListWrapper {
        // This declaration below of _Agent_obj_class is to force flash compiler to include this class
        private var _agent_obj_class: org.openapitools.client.model.Agent = null;
        [XmlElements(name="agent", type="org.openapitools.client.model.Agent")]
        public var agent: Array = new Array();

        public function getList(): Array{
            return agent;
        }

}

}
