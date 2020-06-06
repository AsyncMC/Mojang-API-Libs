<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A security question answer given by the player using the id given by Mojang
 */
class SecurityAnswer
{
    /**
     * A number giver by Mojang to reply a question
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
}
