<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 */
class SecurityChallenge
{
    /**
     * @DTA\Data(field="question")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SecurityQuestion::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SecurityQuestion::class})
     * @var \App\DTO\SecurityQuestion
     */
    public $question;
    /**
     * @DTA\Data(field="answer")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SecurityAnswerId::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SecurityAnswerId::class})
     * @var \App\DTO\SecurityAnswerId
     */
    public $answer;
}
