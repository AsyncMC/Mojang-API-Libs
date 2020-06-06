<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ReducedUserData
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\SplFileObject::class})
     * @DTA\Validator(name="Dictionary", options={"type":\SplFileObject::class})
     * @var \SplFileObject
     */
    public $id;
    /**
     * @DTA\Data(field="properties", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\GameProfileProperty::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\GameProfileProperty::class}}
     * }})
     * @var \App\DTO\GameProfileProperty[]
     */
    public $properties;
}
