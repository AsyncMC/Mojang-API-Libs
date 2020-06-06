<?php

namespace com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The current player, demo and legacy status of a player identified by the id
 */
class CurrentPlayerIDs
{
    /**
     * The player UUID without hyphens
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $id;
    /**
     * The current name being used by this player
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * If account has not been converted
     * @DTA\Data(field="legacy", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $legacy;
    /**
     * If the player has not puchased the game
     * @DTA\Data(field="demo", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $demo;
}
