<?php
/**
 * PlayerProfileTexturePropertyValue
 */
namespace app\Models;

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

    /** @var \app\Models\PlayerTexture $textures */
    private $textures;

}
