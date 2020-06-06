<?php
/**
 * NameChange
 */
namespace OpenAPIServer\Model;

/**
 * NameChange
 */
class NameChange
{
    
    /** @var string $name The new player name*/
    private $name;
    
    /** @var int $changedToAt Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.*/
    private $changedToAt;
}
