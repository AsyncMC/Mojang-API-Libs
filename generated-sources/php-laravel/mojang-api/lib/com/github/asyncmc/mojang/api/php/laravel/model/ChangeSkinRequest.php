<?php
/**
 * ChangeSkinRequest
 */
namespace com.github.asyncmc.mojang.api.php.laravel.server\com.github.asyncmc.mojang.api.php.laravel.model;

/**
 * ChangeSkinRequest
 */
class ChangeSkinRequest {

    /** @var \com.github.asyncmc.mojang.api.php.laravel.server\com.github.asyncmc.mojang.api.php.laravel.model\SkinModel $model */
    private $model;

    /** @var string $url The URL which Mojang servers will download and apply the skin*/
    private $url;

}
