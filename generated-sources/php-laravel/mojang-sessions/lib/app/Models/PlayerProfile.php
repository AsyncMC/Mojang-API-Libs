<?php
/**
 * PlayerProfile
 */
namespace app\Models;

/**
 * PlayerProfile
 */
class PlayerProfile {

    /** @var string $id The player UUID without hyphens*/
    private $id;

    /** @var string $name */
    private $name;

    /** @var bool $legacy Will appear in the response if the user has not migrated their minecraft.net account to Mojang.*/
    private $legacy;

    /** @var \app\Models\PlayerProfileProperty[] $properties An array with all player properties, like skin and cape*/
    private $properties;

}
