<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for getPlayerProfile
 */
class GetPlayerProfileQueryData
{
    /**
     * When set to false, the signature data are sent
     * @DTA\Data(field="unsigned", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $unsigned;
}
