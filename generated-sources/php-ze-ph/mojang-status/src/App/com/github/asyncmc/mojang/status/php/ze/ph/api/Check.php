<?php

namespace com.github.asyncmc.mojang.status.php.ze.ph.server\com.github.asyncmc.mojang.status.php.ze.ph.api;

use Articus\PathHandler\Operation;
use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/check")
 */
class Check implements Operation\GetInterface
{
    /**
     * Checks the Mojang service statuses
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 500 if the method is not implemented
     *
     * @return map[string,\com.github.asyncmc.mojang.status.php.ze.ph.server\com.github.asyncmc.mojang.status.php.ze.ph.model\ApiStatus][]
     */
    public function handleGet(ServerRequestInterface $request)
    {
        //TODO implement method
        throw new PHException\HttpCode(500, "Not implemented");
    }
}
