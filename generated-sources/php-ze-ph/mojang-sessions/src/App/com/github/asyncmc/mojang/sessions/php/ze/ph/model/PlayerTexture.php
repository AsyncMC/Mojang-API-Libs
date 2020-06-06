<?php

namespace com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Provide links to the player&#39;s skin and cape
 */
class PlayerTexture
{
    /**
     * @DTA\Data(field="SKIN", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerSkinURL::class})
     * @DTA\Validator(name="Dictionary", options={"type":\com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerSkinURL::class})
     * @var \com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerSkinURL
     */
    public $skin;
    /**
     * @DTA\Data(field="CAPE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerTextureURL::class})
     * @DTA\Validator(name="Dictionary", options={"type":\com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerTextureURL::class})
     * @var \com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerTextureURL
     */
    public $cape;
}
