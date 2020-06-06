<?php

namespace com.github.asyncmc.mojang.authentication.php.ze.ph.server\com.github.asyncmc.mojang.authentication.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GameProfileProperty
{
    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $value;
}
