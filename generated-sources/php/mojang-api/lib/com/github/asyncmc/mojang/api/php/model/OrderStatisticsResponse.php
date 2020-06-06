<?php
/**
 * OrderStatisticsResponse
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 3.3.4
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model;

use \ArrayAccess;
use \com.github.asyncmc.mojang.api.php.server\ObjectSerializer;

/**
 * OrderStatisticsResponse Class Doc Comment
 *
 * @category Class
 * @description A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 * @package  com.github.asyncmc.mojang.api.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OrderStatisticsResponse implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'OrderStatisticsResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'total' => 'int',
        'last24h' => 'int',
        'sale_velocity_per_seconds' => 'double'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'total' => 'int64',
        'last24h' => 'int64',
        'sale_velocity_per_seconds' => 'double'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'total' => 'total',
        'last24h' => 'last24h',
        'sale_velocity_per_seconds' => 'saleVelocityPerSeconds'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'total' => 'setTotal',
        'last24h' => 'setLast24h',
        'sale_velocity_per_seconds' => 'setSaleVelocityPerSeconds'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'total' => 'getTotal',
        'last24h' => 'getLast24h',
        'sale_velocity_per_seconds' => 'getSaleVelocityPerSeconds'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['total'] = isset($data['total']) ? $data['total'] : null;
        $this->container['last24h'] = isset($data['last24h']) ? $data['last24h'] : null;
        $this->container['sale_velocity_per_seconds'] = isset($data['sale_velocity_per_seconds']) ? $data['sale_velocity_per_seconds'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['total'] === null) {
            $invalidProperties[] = "'total' can't be null";
        }
        if ($this->container['last24h'] === null) {
            $invalidProperties[] = "'last24h' can't be null";
        }
        if ($this->container['sale_velocity_per_seconds'] === null) {
            $invalidProperties[] = "'sale_velocity_per_seconds' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets total
     *
     * @return int
     */
    public function getTotal()
    {
        return $this->container['total'];
    }

    /**
     * Sets total
     *
     * @param int $total total amount sold
     *
     * @return $this
     */
    public function setTotal($total)
    {
        $this->container['total'] = $total;

        return $this;
    }

    /**
     * Gets last24h
     *
     * @return int
     */
    public function getLast24h()
    {
        return $this->container['last24h'];
    }

    /**
     * Sets last24h
     *
     * @param int $last24h total sold in last 24 hours
     *
     * @return $this
     */
    public function setLast24h($last24h)
    {
        $this->container['last24h'] = $last24h;

        return $this;
    }

    /**
     * Gets sale_velocity_per_seconds
     *
     * @return double
     */
    public function getSaleVelocityPerSeconds()
    {
        return $this->container['sale_velocity_per_seconds'];
    }

    /**
     * Sets sale_velocity_per_seconds
     *
     * @param double $sale_velocity_per_seconds decimal average sales per second
     *
     * @return $this
     */
    public function setSaleVelocityPerSeconds($sale_velocity_per_seconds)
    {
        $this->container['sale_velocity_per_seconds'] = $sale_velocity_per_seconds;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }
}


