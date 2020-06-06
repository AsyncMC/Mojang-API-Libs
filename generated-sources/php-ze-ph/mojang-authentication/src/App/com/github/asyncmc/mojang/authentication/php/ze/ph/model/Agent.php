<?php

namespace com.github.asyncmc.mojang.authentication.php.ze.ph.server\com.github.asyncmc.mojang.authentication.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Identifies the software doing the request
 */
class Agent
{
    /**
     * The name of the game
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * The agent version, usually 1.
     * @DTA\Data(field="version", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $version;
}
