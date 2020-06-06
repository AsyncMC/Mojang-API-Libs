<?php
/**
 * PlayerProfileTexturePropertyValue
 */
namespace com.github.asyncmc.mojang.sessions.php.laravel.server\com.github.asyncmc.mojang.sessions.php.laravel.model;

/**
 * PlayerProfileTexturePropertyValue
 */
class PlayerProfileTexturePropertyValue {

    /** @var int $timestamp UNIX timestamp in milliseconds*/
    private $timestamp;

    /** @var string $profileId The player UUID without hyphens*/
    private $profileId;

    /** @var string $profileName The player&#39;s name*/
    private $profileName;

    /** @var bool $signatureRequired Only present if unsigned was set to false in the request*/
    private $signatureRequired;

    /** @var \com.github.asyncmc.mojang.sessions.php.laravel.server\com.github.asyncmc.mojang.sessions.php.laravel.model\PlayerTexture $textures */
    private $textures;

}
