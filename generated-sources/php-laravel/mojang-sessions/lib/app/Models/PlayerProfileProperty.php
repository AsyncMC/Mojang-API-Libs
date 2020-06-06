<?php
/**
 * PlayerProfileProperty
 */
namespace app\Models;

/**
 * PlayerProfileProperty
 */
class PlayerProfileProperty {

    /** @var string $name The property name*/
    private $name;

    /** @var string $value The serialized property value in base64.*/
    private $value;

    /** @var string $signature signed data using Yggdrasil&#39;s private key*/
    private $signature;

}
