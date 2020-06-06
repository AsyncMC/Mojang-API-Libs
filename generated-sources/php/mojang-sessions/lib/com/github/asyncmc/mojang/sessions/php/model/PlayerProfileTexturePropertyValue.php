<?php
/**
 * PlayerProfileTexturePropertyValue
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.sessions.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Mojang Session API
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

namespace com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model;

use \ArrayAccess;
use \com.github.asyncmc.mojang.sessions.php.server\ObjectSerializer;

/**
 * PlayerProfileTexturePropertyValue Class Doc Comment
 *
 * @category Class
 * @description This is obtained by decoding the \&quot;textures\&quot; property
 * @package  com.github.asyncmc.mojang.sessions.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class PlayerProfileTexturePropertyValue implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'PlayerProfileTexturePropertyValue';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'timestamp' => 'int',
        'profile_id' => 'string',
        'profile_name' => 'string',
        'signature_required' => 'bool',
        'textures' => '\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerTexture'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'timestamp' => 'int64',
        'profile_id' => 'stripped-uuid',
        'profile_name' => 'username',
        'signature_required' => null,
        'textures' => null
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
        'timestamp' => 'timestamp',
        'profile_id' => 'profileId',
        'profile_name' => 'profileName',
        'signature_required' => 'signatureRequired',
        'textures' => 'textures'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'timestamp' => 'setTimestamp',
        'profile_id' => 'setProfileId',
        'profile_name' => 'setProfileName',
        'signature_required' => 'setSignatureRequired',
        'textures' => 'setTextures'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'timestamp' => 'getTimestamp',
        'profile_id' => 'getProfileId',
        'profile_name' => 'getProfileName',
        'signature_required' => 'getSignatureRequired',
        'textures' => 'getTextures'
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
        $this->container['timestamp'] = isset($data['timestamp']) ? $data['timestamp'] : null;
        $this->container['profile_id'] = isset($data['profile_id']) ? $data['profile_id'] : null;
        $this->container['profile_name'] = isset($data['profile_name']) ? $data['profile_name'] : null;
        $this->container['signature_required'] = isset($data['signature_required']) ? $data['signature_required'] : false;
        $this->container['textures'] = isset($data['textures']) ? $data['textures'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['timestamp'] === null) {
            $invalidProperties[] = "'timestamp' can't be null";
        }
        if ($this->container['profile_id'] === null) {
            $invalidProperties[] = "'profile_id' can't be null";
        }
        if ($this->container['profile_name'] === null) {
            $invalidProperties[] = "'profile_name' can't be null";
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
     * Gets timestamp
     *
     * @return int
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     *
     * @param int $timestamp UNIX timestamp in milliseconds
     *
     * @return $this
     */
    public function setTimestamp($timestamp)
    {
        $this->container['timestamp'] = $timestamp;

        return $this;
    }

    /**
     * Gets profile_id
     *
     * @return string
     */
    public function getProfileId()
    {
        return $this->container['profile_id'];
    }

    /**
     * Sets profile_id
     *
     * @param string $profile_id The player UUID without hyphens
     *
     * @return $this
     */
    public function setProfileId($profile_id)
    {
        $this->container['profile_id'] = $profile_id;

        return $this;
    }

    /**
     * Gets profile_name
     *
     * @return string
     */
    public function getProfileName()
    {
        return $this->container['profile_name'];
    }

    /**
     * Sets profile_name
     *
     * @param string $profile_name The player's name
     *
     * @return $this
     */
    public function setProfileName($profile_name)
    {
        $this->container['profile_name'] = $profile_name;

        return $this;
    }

    /**
     * Gets signature_required
     *
     * @return bool|null
     */
    public function getSignatureRequired()
    {
        return $this->container['signature_required'];
    }

    /**
     * Sets signature_required
     *
     * @param bool|null $signature_required Only present if unsigned was set to false in the request
     *
     * @return $this
     */
    public function setSignatureRequired($signature_required)
    {
        $this->container['signature_required'] = $signature_required;

        return $this;
    }

    /**
     * Gets textures
     *
     * @return \com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerTexture|null
     */
    public function getTextures()
    {
        return $this->container['textures'];
    }

    /**
     * Sets textures
     *
     * @param \com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerTexture|null $textures textures
     *
     * @return $this
     */
    public function setTextures($textures)
    {
        $this->container['textures'] = $textures;

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

