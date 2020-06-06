<?php

namespace com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */
class PlayerProfileProperty
{
    /**
     * The property name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * The serialized property value in base64.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $value;
    /**
     * signed data using Yggdrasil&#39;s private key
     * @DTA\Data(field="signature", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $signature;
}
