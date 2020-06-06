<?php
/**
 * CurrentPlayerIDs
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang API
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

namespace com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the CurrentPlayerIDs model.
 *
 * The current player, demo and legacy status of a player identified by the id
 *
 * @package com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model
 * @author  OpenAPI Generator team
 */
class CurrentPlayerIDs 
{
        /**
     * The player UUID without hyphens
     *
     * @var string
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $id;

    /**
     * The current name being used by this player
     *
     * @var string
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * If account has not been converted
     *
     * @var bool|null
     * @SerializedName("legacy")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $legacy;

    /**
     * If the player has not puchased the game
     *
     * @var bool|null
     * @SerializedName("demo")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $demo;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->legacy = isset($data['legacy']) ? $data['legacy'] : false;
        $this->demo = isset($data['demo']) ? $data['demo'] : false;
    }

    /**
     * Gets id.
     *
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     *
     * @param string $id  The player UUID without hyphens
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string $name  The current name being used by this player
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets legacy.
     *
     * @return bool|null
     */
    public function isLegacy()
    {
        return $this->legacy;
    }

    /**
     * Sets legacy.
     *
     * @param bool|null $legacy  If account has not been converted
     *
     * @return $this
     */
    public function setLegacy($legacy = null)
    {
        $this->legacy = $legacy;

        return $this;
    }

    /**
     * Gets demo.
     *
     * @return bool|null
     */
    public function isDemo()
    {
        return $this->demo;
    }

    /**
     * Sets demo.
     *
     * @param bool|null $demo  If the player has not puchased the game
     *
     * @return $this
     */
    public function setDemo($demo = null)
    {
        $this->demo = $demo;

        return $this;
    }
}


