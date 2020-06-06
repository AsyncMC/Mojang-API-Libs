<?php
/**
 * PlayerProfileProperty
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
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

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the PlayerProfileProperty model.
 *
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class PlayerProfileProperty 
{
        /**
     * The property name
     *
     * @var string
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * The serialized property value in base64.
     *
     * @var string
     * @SerializedName("value")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $value;

    /**
     * signed data using Yggdrasil&#39;s private key
     *
     * @var string|null
     * @SerializedName("signature")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $signature;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->value = isset($data['value']) ? $data['value'] : null;
        $this->signature = isset($data['signature']) ? $data['signature'] : null;
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
     * @param string $name  The property name
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets value.
     *
     * @return string
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Sets value.
     *
     * @param string $value  The serialized property value in base64.
     *
     * @return $this
     */
    public function setValue($value)
    {
        $this->value = $value;

        return $this;
    }

    /**
     * Gets signature.
     *
     * @return string|null
     */
    public function getSignature()
    {
        return $this->signature;
    }

    /**
     * Sets signature.
     *
     * @param string|null $signature  signed data using Yggdrasil's private key
     *
     * @return $this
     */
    public function setSignature($signature = null)
    {
        $this->signature = $signature;

        return $this;
    }
}


