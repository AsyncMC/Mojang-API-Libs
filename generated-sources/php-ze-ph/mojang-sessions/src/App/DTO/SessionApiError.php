<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object describing giving a bit of information about the error
 */
class SessionApiError
{
    /**
     * A message describing the error
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $error;
    /**
     * The request path
     * @DTA\Data(field="path", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $path;
}
