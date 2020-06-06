package org.openapitools.client.model {

import org.openapitools.client.model.SecurityAnswerId;
import org.openapitools.client.model.SecurityQuestion;

    [XmlRootNode(name="SecurityChallenge")]
    public class SecurityChallenge {
                [XmlElement(name="question")]
        public var question: SecurityQuestion = NaN;
                [XmlElement(name="answer")]
        public var answer: SecurityAnswerId = NaN;

    public function toString(): String {
        var str: String = "SecurityChallenge: ";
        str += " (question: " + question + ")";
        str += " (answer: " + answer + ")";
        return str;
    }

}

}
