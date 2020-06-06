<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request Mojang to download a skin from an URL and apply to the player
 */
class InlineObject1
{
    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SkinModel::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SkinModel::class})
     * @var \App\DTO\SkinModel
     */
    public $model;
    /**
     * The URL which Mojang servers will download and apply the skin
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $url;
}
