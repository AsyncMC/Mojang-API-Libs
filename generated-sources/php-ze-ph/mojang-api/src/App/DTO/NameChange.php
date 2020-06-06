<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A registered name change.
 */
class NameChange
{
    /**
     * The new player name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
     * @DTA\Data(field="changedToAt", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_to_at;
}
