<?php
/**
 * UploadSkinRequest
 */
namespace com.github.asyncmc.mojang.api.php.slim.server\com.github.asyncmc.mojang.api.php.slim.model;

/**
 * UploadSkinRequest
 */
class UploadSkinRequest
{
    
    /** @var \com.github.asyncmc.mojang.api.php.slim.server\com.github.asyncmc.mojang.api.php.slim.model\SkinModel $model */
    private $model;
    
    /** @var \SplFileObject $file The skin image in PNG format*/
    private $file;
}
