<?php

namespace com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.api;

use Articus\PathHandler\Operation;
use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/session/minecraft/profile/{stripped_uuid}")
 */
class SessionMinecraftProfileStrippedUuid implements Operation\GetInterface
{
    /**
     * Gets the player&#39;s game profile
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={
     *     "type":\com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\GetPlayerProfileQueryData::class,
     *     "objectAttr":"queryData",
     *     "source": PHAttribute\Transfer::SOURCE_GET
     * })
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 500 if the method is not implemented
     *
     * @return \com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\PlayerProfile
     */
    public function handleGet(ServerRequestInterface $request)
    {
        //TODO implement method
        /** @var \com.github.asyncmc.mojang.sessions.php.ze.ph.server\com.github.asyncmc.mojang.sessions.php.ze.ph.model\GetPlayerProfileQueryData $queryData */
        $queryData = $request->getAttribute("queryData");
        throw new PHException\HttpCode(500, "Not implemented");
    }
}
