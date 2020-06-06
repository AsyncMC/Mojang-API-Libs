<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains details about the skin
 */
class PlayerSkinMetadata
{
    /**
     * The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $model;
}
