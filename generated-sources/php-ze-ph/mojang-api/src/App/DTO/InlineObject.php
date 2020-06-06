<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject
{
    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SkinModel::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SkinModel::class})
     * @var \App\DTO\SkinModel
     */
    public $model;
    /**
     * The skin image in PNG format
     * @DTA\Data(field="file")
     * @DTA\Strategy(name="Object", options={"type":\SplFileObject::class})
     * @DTA\Validator(name="Dictionary", options={"type":\SplFileObject::class})
     * @var \SplFileObject
     */
    public $file;
}
