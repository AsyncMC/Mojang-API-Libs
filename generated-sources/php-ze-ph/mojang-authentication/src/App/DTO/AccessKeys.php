<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AccessKeys
{
    /**
     * @DTA\Data(field="accessToken")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $access_token;
    /**
     * @DTA\Data(field="clientToken", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $client_token;
}
