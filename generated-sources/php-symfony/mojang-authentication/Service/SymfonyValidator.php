<?php

namespace com.github.asyncmc.mojang.authentication.php.symfony.server\Service;

use Symfony\Component\Validator\Validation;

class SymfonyValidator implements ValidatorInterface
{
    protected $validator;

    public function __construct()
    {
        $this->validator = Validation::createValidator();
    }

    public function validate($value, $constraints = null, $groups = null)
    {
        return $this->validator->validate($value, $constraints, $groups);
    }
}
