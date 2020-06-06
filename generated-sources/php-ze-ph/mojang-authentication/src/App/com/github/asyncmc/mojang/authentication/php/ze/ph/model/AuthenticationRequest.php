<?php

namespace com.github.asyncmc.mojang.authentication.php.ze.ph.server\com.github.asyncmc.mojang.authentication.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 */
class AuthenticationRequest
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
