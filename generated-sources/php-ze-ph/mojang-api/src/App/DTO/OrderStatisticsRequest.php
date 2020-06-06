<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The body of the request to get the order statistics
 */
class OrderStatisticsRequest
{
    /**
     * @DTA\Data(field="metricKeys")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\OrderStatistic::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\OrderStatistic::class}}
     * }})
     * @var \App\DTO\OrderStatistic[]
     */
    public $metric_keys;
}
