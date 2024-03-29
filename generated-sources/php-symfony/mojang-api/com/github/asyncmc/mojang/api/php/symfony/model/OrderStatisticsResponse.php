<?php
/**
 * OrderStatisticsResponse
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
 * Class representing the OrderStatisticsResponse model.
 *
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 *
 * @package com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model
 * @author  OpenAPI Generator team
 */
class OrderStatisticsResponse 
{
        /**
     * total amount sold
     *
     * @var int
     * @SerializedName("total")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $total;

    /**
     * total sold in last 24 hours
     *
     * @var int
     * @SerializedName("last24h")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $last24h;

    /**
     * decimal average sales per second
     *
     * @var double
     * @SerializedName("saleVelocityPerSeconds")
     * @Assert\NotNull()
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $saleVelocityPerSeconds;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->total = isset($data['total']) ? $data['total'] : null;
        $this->last24h = isset($data['last24h']) ? $data['last24h'] : null;
        $this->saleVelocityPerSeconds = isset($data['saleVelocityPerSeconds']) ? $data['saleVelocityPerSeconds'] : null;
    }

    /**
     * Gets total.
     *
     * @return int
     */
    public function getTotal()
    {
        return $this->total;
    }

    /**
     * Sets total.
     *
     * @param int $total  total amount sold
     *
     * @return $this
     */
    public function setTotal($total)
    {
        $this->total = $total;

        return $this;
    }

    /**
     * Gets last24h.
     *
     * @return int
     */
    public function getLast24h()
    {
        return $this->last24h;
    }

    /**
     * Sets last24h.
     *
     * @param int $last24h  total sold in last 24 hours
     *
     * @return $this
     */
    public function setLast24h($last24h)
    {
        $this->last24h = $last24h;

        return $this;
    }

    /**
     * Gets saleVelocityPerSeconds.
     *
     * @return double
     */
    public function getSaleVelocityPerSeconds()
    {
        return $this->saleVelocityPerSeconds;
    }

    /**
     * Sets saleVelocityPerSeconds.
     *
     * @param double $saleVelocityPerSeconds  decimal average sales per second
     *
     * @return $this
     */
    public function setSaleVelocityPerSeconds($saleVelocityPerSeconds)
    {
        $this->saleVelocityPerSeconds = $saleVelocityPerSeconds;

        return $this;
    }
}


