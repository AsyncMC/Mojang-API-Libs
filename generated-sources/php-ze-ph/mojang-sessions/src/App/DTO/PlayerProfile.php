<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PlayerProfile
{
    /**
     * The player UUID without hyphens
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $id;
    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
     * @DTA\Data(field="legacy", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $legacy;
    /**
     * An array with all player properties, like skin and cape
     * @DTA\Data(field="properties")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\PlayerProfileProperty::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\PlayerProfileProperty::class}}
     * }})
     * @var \App\DTO\PlayerProfileProperty[]
     */
    public $properties;
}
