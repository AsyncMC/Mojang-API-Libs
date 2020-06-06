<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UsernamePassword
{
    /**
     * The Mojang account e-mail or username. Never store it.
     * @DTA\Data(field="username")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $username;
    /**
     * The Mojang account password, never store it.
     * @DTA\Data(field="password")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $password;
}
