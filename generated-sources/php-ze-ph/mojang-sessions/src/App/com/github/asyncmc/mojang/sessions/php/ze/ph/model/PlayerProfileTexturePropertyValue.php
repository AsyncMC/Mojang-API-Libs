<?php

namespace com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This is obtained by decoding the \&quot;textures\&quot; property
 */
class PlayerProfileTexturePropertyValue
{
    /**
     * UNIX timestamp in milliseconds
     * @DTA\Data(field="timestamp")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $timestamp;
    /**
     * The player UUID without hyphens
     * @DTA\Data(field="profileId")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $profile_id;
    /**
     * The player&#39;s name
     * @DTA\Data(field="profileName")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $profile_name;
    /**
     * Only present if unsigned was set to false in the request
     * @DTA\Data(field="signatureRequired", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $signature_required;
    /**
     * @DTA\Data(field="textures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerTexture::class})
     * @DTA\Validator(name="Dictionary", options={"type":\com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerTexture::class})
     * @var \com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerTexture
     */
    public $textures;
}
