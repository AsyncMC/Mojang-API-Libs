<?php

namespace com.github.asyncmc.mojang.authentication.php.ze.ph.server\com.github.asyncmc.mojang.authentication.php.ze.ph.api;

use Articus\PathHandler\Operation;
use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/refresh")
 */
class Refresh implements Operation\PostInterface
{
    /**
     * TODO check if consumer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Consumer(name=PHConsumer\Json::class, mediaType="application/json")
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={"type":\com.github.asyncmc.mojang.authentication.php.ze.ph.server\com.github.asyncmc.mojang.authentication.php.ze.ph.model\RefreshRequest::class,"objectAttr":"bodyData"})
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 500 if the method is not implemented
     *
     * @return \com.github.asyncmc.mojang.authentication.php.ze.ph.server\com.github.asyncmc.mojang.authentication.php.ze.ph.model\RefreshResponse
     */
    public function handlePost(ServerRequestInterface $request)
    {
        //TODO implement method
        /** @var \com.github.asyncmc.mojang.authentication.php.ze.ph.server\com.github.asyncmc.mojang.authentication.php.ze.ph.model\RefreshRequest $bodyData */
        $bodyData = $request->getAttribute("bodyData");
        throw new PHException\HttpCode(500, "Not implemented");
    }
}
