<?php
/**
 * ChangeSkinRequest
 */
namespace com.github.asyncmc.mojang.api.php.slim.server\com.github.asyncmc.mojang.api.php.slim.model;

/**
 * ChangeSkinRequest
 */
class ChangeSkinRequest
{
    
    /** @var \com.github.asyncmc.mojang.api.php.slim.server\com.github.asyncmc.mojang.api.php.slim.model\SkinModel $model */
    private $model;
    
    /** @var string $url The URL which Mojang servers will download and apply the skin*/
    private $url;
}
