<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Provide links to the player&#39;s skin and cape
 */
class PlayerTexture
{
    /**
     * @DTA\Data(field="SKIN", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlayerSkinURL::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PlayerSkinURL::class})
     * @var \App\DTO\PlayerSkinURL
     */
    public $skin;
    /**
     * @DTA\Data(field="CAPE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlayerTextureURL::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PlayerTextureURL::class})
     * @var \App\DTO\PlayerTextureURL
     */
    public $cape;
}
