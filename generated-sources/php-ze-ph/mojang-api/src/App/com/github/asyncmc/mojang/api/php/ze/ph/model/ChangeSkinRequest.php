<?php

namespace com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request Mojang to download a skin from an URL and apply to the player
 */
class ChangeSkinRequest
{
    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SkinModel::class})
     * @DTA\Validator(name="Dictionary", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SkinModel::class})
     * @var \com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SkinModel
     */
    public $model;
    /**
     * The URL which Mojang servers will download and apply the skin
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $url;
}
