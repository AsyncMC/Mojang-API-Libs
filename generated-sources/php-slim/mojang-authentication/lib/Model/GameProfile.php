<?php
/**
 * GameProfile
 */
namespace OpenAPIServer\Model;

/**
 * GameProfile
 */
class GameProfile
{
    
    /** @var string $agent */
    private $agent;
    
    /** @var string $id */
    private $id;
    
    /** @var string $name */
    private $name;
    
    /** @var \SplFileObject $userId */
    private $userId;
    
    /** @var int $createdAt Unix timestamp in milliseconds*/
    private $createdAt;
    
    /** @var bool $legacyProfile */
    private $legacyProfile;
    
    /** @var bool $suspended */
    private $suspended;
    
    /** @var bool $paid */
    private $paid;
    
    /** @var bool $migrated */
    private $migrated;
    
    /** @var bool $legacy */
    private $legacy;
}
