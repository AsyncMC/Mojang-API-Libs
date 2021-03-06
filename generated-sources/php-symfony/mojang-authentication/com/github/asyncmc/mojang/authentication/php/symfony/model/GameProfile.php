<?php
/**
 * GameProfile
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang Authentication API
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

namespace com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the GameProfile model.
 *
 * @package com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model
 * @author  OpenAPI Generator team
 */
class GameProfile 
{
        /**
     * @var string|null
     * @SerializedName("agent")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $agent;

    /**
     * @var string|null
     * @SerializedName("id")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $id;

    /**
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * @var string|null
     * @SerializedName("userId")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $userId;

    /**
     * Unix timestamp in milliseconds
     *
     * @var int|null
     * @SerializedName("createdAt")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $createdAt;

    /**
     * @var bool|null
     * @SerializedName("legacyProfile")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $legacyProfile;

    /**
     * @var bool|null
     * @SerializedName("suspended")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $suspended;

    /**
     * @var bool|null
     * @SerializedName("paid")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $paid;

    /**
     * @var bool|null
     * @SerializedName("migrated")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $migrated;

    /**
     * @var bool|null
     * @SerializedName("legacy")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $legacy;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->agent = isset($data['agent']) ? $data['agent'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->userId = isset($data['userId']) ? $data['userId'] : null;
        $this->createdAt = isset($data['createdAt']) ? $data['createdAt'] : null;
        $this->legacyProfile = isset($data['legacyProfile']) ? $data['legacyProfile'] : null;
        $this->suspended = isset($data['suspended']) ? $data['suspended'] : null;
        $this->paid = isset($data['paid']) ? $data['paid'] : null;
        $this->migrated = isset($data['migrated']) ? $data['migrated'] : null;
        $this->legacy = isset($data['legacy']) ? $data['legacy'] : null;
    }

    /**
     * Gets agent.
     *
     * @return string|null
     */
    public function getAgent()
    {
        return $this->agent;
    }

    /**
     * Sets agent.
     *
     * @param string|null $agent
     *
     * @return $this
     */
    public function setAgent($agent = null)
    {
        $this->agent = $agent;

        return $this;
    }

    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     *
     * @param string|null $id
     *
     * @return $this
     */
    public function setId($id = null)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string|null $name
     *
     * @return $this
     */
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets userId.
     *
     * @return string|null
     */
    public function getUserId()
    {
        return $this->userId;
    }

    /**
     * Sets userId.
     *
     * @param string|null $userId
     *
     * @return $this
     */
    public function setUserId($userId = null)
    {
        $this->userId = $userId;

        return $this;
    }

    /**
     * Gets createdAt.
     *
     * @return int|null
     */
    public function getCreatedAt()
    {
        return $this->createdAt;
    }

    /**
     * Sets createdAt.
     *
     * @param int|null $createdAt  Unix timestamp in milliseconds
     *
     * @return $this
     */
    public function setCreatedAt($createdAt = null)
    {
        $this->createdAt = $createdAt;

        return $this;
    }

    /**
     * Gets legacyProfile.
     *
     * @return bool|null
     */
    public function isLegacyProfile()
    {
        return $this->legacyProfile;
    }

    /**
     * Sets legacyProfile.
     *
     * @param bool|null $legacyProfile
     *
     * @return $this
     */
    public function setLegacyProfile($legacyProfile = null)
    {
        $this->legacyProfile = $legacyProfile;

        return $this;
    }

    /**
     * Gets suspended.
     *
     * @return bool|null
     */
    public function isSuspended()
    {
        return $this->suspended;
    }

    /**
     * Sets suspended.
     *
     * @param bool|null $suspended
     *
     * @return $this
     */
    public function setSuspended($suspended = null)
    {
        $this->suspended = $suspended;

        return $this;
    }

    /**
     * Gets paid.
     *
     * @return bool|null
     */
    public function isPaid()
    {
        return $this->paid;
    }

    /**
     * Sets paid.
     *
     * @param bool|null $paid
     *
     * @return $this
     */
    public function setPaid($paid = null)
    {
        $this->paid = $paid;

        return $this;
    }

    /**
     * Gets migrated.
     *
     * @return bool|null
     */
    public function isMigrated()
    {
        return $this->migrated;
    }

    /**
     * Sets migrated.
     *
     * @param bool|null $migrated
     *
     * @return $this
     */
    public function setMigrated($migrated = null)
    {
        $this->migrated = $migrated;

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
     * @param bool|null $legacy
     *
     * @return $this
     */
    public function setLegacy($legacy = null)
    {
        $this->legacy = $legacy;

        return $this;
    }
}


