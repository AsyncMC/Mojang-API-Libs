<?php

namespace com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UploadSkinRequest
{
    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SkinModel::class})
     * @DTA\Validator(name="Dictionary", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SkinModel::class})
     * @var \com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SkinModel
     */
    public $model;
    /**
     * The skin image in PNG format
     * @DTA\Data(field="file")
     * @DTA\Strategy(name="Object", options={"type":\SplFileObject::class})
     * @DTA\Validator(name="Dictionary", options={"type":\SplFileObject::class})
     * @var \SplFileObject
     */
    public $file;
}
