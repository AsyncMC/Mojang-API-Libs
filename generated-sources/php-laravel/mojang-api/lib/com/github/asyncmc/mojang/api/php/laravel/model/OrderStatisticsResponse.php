<?php
/**
 * OrderStatisticsResponse
 */
namespace com.github.asyncmc.mojang.api.php.laravel.server\com.github.asyncmc.mojang.api.php.laravel.model;

/**
 * OrderStatisticsResponse
 */
class OrderStatisticsResponse {

    /** @var int $total total amount sold*/
    private $total;

    /** @var int $last24h total sold in last 24 hours*/
    private $last24h;

    /** @var double $saleVelocityPerSeconds decimal average sales per second*/
    private $saleVelocityPerSeconds;

}
