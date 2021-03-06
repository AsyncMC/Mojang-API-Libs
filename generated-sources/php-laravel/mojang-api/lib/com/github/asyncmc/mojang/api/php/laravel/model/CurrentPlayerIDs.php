<?php
/**
 * CurrentPlayerIDs
 */
namespace com.github.asyncmc.mojang.api.php.laravel.server\com.github.asyncmc.mojang.api.php.laravel.model;

/**
 * CurrentPlayerIDs
 */
class CurrentPlayerIDs {

    /** @var string $id The player UUID without hyphens*/
    private $id;

    /** @var string $name The current name being used by this player*/
    private $name;

    /** @var bool $legacy If account has not been converted*/
    private $legacy;

    /** @var bool $demo If the player has not puchased the game*/
    private $demo;

}
