<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This is returned when the request fails
 */
class Error
{
    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $error;
    /**
     * @DTA\Data(field="errorMessage", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $error_message;
}
