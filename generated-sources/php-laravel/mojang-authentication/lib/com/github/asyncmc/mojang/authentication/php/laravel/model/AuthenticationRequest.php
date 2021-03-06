<?php
/**
 * AuthenticationRequest
 */
namespace com.github.asyncmc.mojang.authentication.php.laravel.server\com.github.asyncmc.mojang.authentication.php.laravel.model;

/**
 * AuthenticationRequest
 */
class AuthenticationRequest {

    /** @var string $username The Mojang account e-mail or username. Never store it.*/
    private $username;

    /** @var string $password The Mojang account password, never store it.*/
    private $password;

}
