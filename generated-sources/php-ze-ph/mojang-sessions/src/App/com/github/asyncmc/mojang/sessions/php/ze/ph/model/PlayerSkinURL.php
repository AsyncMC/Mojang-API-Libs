<?php

namespace com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Wraps the URL to the texture and configures the player&#39;s model
 */
class PlayerSkinURL
{
    /**
     * The URL to the texture, must be in Mojang&#39;s domains.
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $url;
}
