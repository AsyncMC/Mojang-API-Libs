//
// SecurityChallenge.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Binds a question to an answer id, the answer must respect the answer id. */

public struct SecurityChallenge: Codable {

    public var question: SecurityQuestion
    public var answer: SecurityAnswerId

    public init(question: SecurityQuestion, answer: SecurityAnswerId) {
        self.question = question
        self.answer = answer
    }


}

