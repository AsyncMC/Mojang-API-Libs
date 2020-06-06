<?php
/**
 * GameProfile
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Mojang Authentication API
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

namespace com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model;

use \ArrayAccess;
use \com.github.asyncmc.mojang.authentication.php.server\ObjectSerializer;

/**
 * GameProfile Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class GameProfile implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'GameProfile';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'agent' => 'string',
        'id' => 'string',
        'name' => 'string',
        'user_id' => 'string',
        'created_at' => 'int',
        'legacy_profile' => 'bool',
        'suspended' => 'bool',
        'paid' => 'bool',
        'migrated' => 'bool',
        'legacy' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'agent' => null,
        'id' => null,
        'name' => null,
        'user_id' => null,
        'created_at' => 'int64',
        'legacy_profile' => null,
        'suspended' => null,
        'paid' => null,
        'migrated' => null,
        'legacy' => null
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
        'agent' => 'agent',
        'id' => 'id',
        'name' => 'name',
        'user_id' => 'userId',
        'created_at' => 'createdAt',
        'legacy_profile' => 'legacyProfile',
        'suspended' => 'suspended',
        'paid' => 'paid',
        'migrated' => 'migrated',
        'legacy' => 'legacy'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'agent' => 'setAgent',
        'id' => 'setId',
        'name' => 'setName',
        'user_id' => 'setUserId',
        'created_at' => 'setCreatedAt',
        'legacy_profile' => 'setLegacyProfile',
        'suspended' => 'setSuspended',
        'paid' => 'setPaid',
        'migrated' => 'setMigrated',
        'legacy' => 'setLegacy'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'agent' => 'getAgent',
        'id' => 'getId',
        'name' => 'getName',
        'user_id' => 'getUserId',
        'created_at' => 'getCreatedAt',
        'legacy_profile' => 'getLegacyProfile',
        'suspended' => 'getSuspended',
        'paid' => 'getPaid',
        'migrated' => 'getMigrated',
        'legacy' => 'getLegacy'
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
        $this->container['agent'] = isset($data['agent']) ? $data['agent'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['user_id'] = isset($data['user_id']) ? $data['user_id'] : null;
        $this->container['created_at'] = isset($data['created_at']) ? $data['created_at'] : null;
        $this->container['legacy_profile'] = isset($data['legacy_profile']) ? $data['legacy_profile'] : null;
        $this->container['suspended'] = isset($data['suspended']) ? $data['suspended'] : null;
        $this->container['paid'] = isset($data['paid']) ? $data['paid'] : null;
        $this->container['migrated'] = isset($data['migrated']) ? $data['migrated'] : null;
        $this->container['legacy'] = isset($data['legacy']) ? $data['legacy'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

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
     * Gets agent
     *
     * @return string|null
     */
    public function getAgent()
    {
        return $this->container['agent'];
    }

    /**
     * Sets agent
     *
     * @param string|null $agent agent
     *
     * @return $this
     */
    public function setAgent($agent)
    {
        $this->container['agent'] = $agent;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string|null $id id
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name name
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets user_id
     *
     * @return string|null
     */
    public function getUserId()
    {
        return $this->container['user_id'];
    }

    /**
     * Sets user_id
     *
     * @param string|null $user_id user_id
     *
     * @return $this
     */
    public function setUserId($user_id)
    {
        $this->container['user_id'] = $user_id;

        return $this;
    }

    /**
     * Gets created_at
     *
     * @return int|null
     */
    public function getCreatedAt()
    {
        return $this->container['created_at'];
    }

    /**
     * Sets created_at
     *
     * @param int|null $created_at Unix timestamp in milliseconds
     *
     * @return $this
     */
    public function setCreatedAt($created_at)
    {
        $this->container['created_at'] = $created_at;

        return $this;
    }

    /**
     * Gets legacy_profile
     *
     * @return bool|null
     */
    public function getLegacyProfile()
    {
        return $this->container['legacy_profile'];
    }

    /**
     * Sets legacy_profile
     *
     * @param bool|null $legacy_profile legacy_profile
     *
     * @return $this
     */
    public function setLegacyProfile($legacy_profile)
    {
        $this->container['legacy_profile'] = $legacy_profile;

        return $this;
    }

    /**
     * Gets suspended
     *
     * @return bool|null
     */
    public function getSuspended()
    {
        return $this->container['suspended'];
    }

    /**
     * Sets suspended
     *
     * @param bool|null $suspended suspended
     *
     * @return $this
     */
    public function setSuspended($suspended)
    {
        $this->container['suspended'] = $suspended;

        return $this;
    }

    /**
     * Gets paid
     *
     * @return bool|null
     */
    public function getPaid()
    {
        return $this->container['paid'];
    }

    /**
     * Sets paid
     *
     * @param bool|null $paid paid
     *
     * @return $this
     */
    public function setPaid($paid)
    {
        $this->container['paid'] = $paid;

        return $this;
    }

    /**
     * Gets migrated
     *
     * @return bool|null
     */
    public function getMigrated()
    {
        return $this->container['migrated'];
    }

    /**
     * Sets migrated
     *
     * @param bool|null $migrated migrated
     *
     * @return $this
     */
    public function setMigrated($migrated)
    {
        $this->container['migrated'] = $migrated;

        return $this;
    }

    /**
     * Gets legacy
     *
     * @return bool|null
     */
    public function getLegacy()
    {
        return $this->container['legacy'];
    }

    /**
     * Sets legacy
     *
     * @param bool|null $legacy legacy
     *
     * @return $this
     */
    public function setLegacy($legacy)
    {
        $this->container['legacy'] = $legacy;

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


