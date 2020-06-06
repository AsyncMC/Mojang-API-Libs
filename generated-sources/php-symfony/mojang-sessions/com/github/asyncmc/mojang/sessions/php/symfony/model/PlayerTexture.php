<?php
/**
 * PlayerTexture
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the PlayerTexture model.
 *
 * Provide links to the player&#39;s skin and cape
 *
 * @package com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model
 * @author  OpenAPI Generator team
 */
class PlayerTexture 
{
        /**
     * @var com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerSkinURL|null
     * @SerializedName("SKIN")
     * @Assert\Type("com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerSkinURL")
     * @Type("com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerSkinURL")
     */
    protected $sKIN;

    /**
     * @var com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerTextureURL|null
     * @SerializedName("CAPE")
     * @Assert\Type("com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerTextureURL")
     * @Type("com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerTextureURL")
     */
    protected $cAPE;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->sKIN = isset($data['sKIN']) ? $data['sKIN'] : null;
        $this->cAPE = isset($data['cAPE']) ? $data['cAPE'] : null;
    }

    /**
     * Gets sKIN.
     *
     * @return com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerSkinURL|null
     */
    public function getSKIN()
    {
        return $this->sKIN;
    }

    /**
     * Sets sKIN.
     *
     * @param com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerSkinURL|null $sKIN
     *
     * @return $this
     */
    public function setSKIN(PlayerSkinURL $sKIN = null)
    {
        $this->sKIN = $sKIN;

        return $this;
    }

    /**
     * Gets cAPE.
     *
     * @return com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerTextureURL|null
     */
    public function getCAPE()
    {
        return $this->cAPE;
    }

    /**
     * Sets cAPE.
     *
     * @param com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerTextureURL|null $cAPE
     *
     * @return $this
     */
    public function setCAPE(PlayerTextureURL $cAPE = null)
    {
        $this->cAPE = $cAPE;

        return $this;
    }
}

