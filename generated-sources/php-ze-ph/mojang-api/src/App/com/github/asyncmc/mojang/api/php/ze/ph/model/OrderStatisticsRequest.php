<?php

namespace com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The body of the request to get the order statistics
 */
class OrderStatisticsRequest
{
    /**
     * @DTA\Data(field="metricKeys")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\OrderStatistic::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\OrderStatistic::class}}
     * }})
     * @var \com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\OrderStatistic[]
     */
    public $metric_keys;
}
