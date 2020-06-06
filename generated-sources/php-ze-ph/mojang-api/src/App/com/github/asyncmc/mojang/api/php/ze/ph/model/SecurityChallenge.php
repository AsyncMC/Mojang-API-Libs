<?php

namespace com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 */
class SecurityChallenge
{
    /**
     * @DTA\Data(field="question")
     * @DTA\Strategy(name="Object", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SecurityQuestion::class})
     * @DTA\Validator(name="Dictionary", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SecurityQuestion::class})
     * @var \com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SecurityQuestion
     */
    public $question;
    /**
     * @DTA\Data(field="answer")
     * @DTA\Strategy(name="Object", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SecurityAnswerId::class})
     * @DTA\Validator(name="Dictionary", options={"type":\com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SecurityAnswerId::class})
     * @var \com.github.asyncmc.mojang.api.php.ze.ph.server\com.github.asyncmc.mojang.api.php.ze.ph.model\SecurityAnswerId
     */
    public $answer;
}
