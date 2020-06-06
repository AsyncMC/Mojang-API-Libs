<?php

namespace com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 */
class OrderStatisticsResponse
{
    /**
     * total amount sold
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $total;
    /**
     * total sold in last 24 hours
     * @DTA\Data(field="last24h")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $last24h;
    /**
     * decimal average sales per second
     * @DTA\Data(field="saleVelocityPerSeconds")
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $sale_velocity_per_seconds;
}
