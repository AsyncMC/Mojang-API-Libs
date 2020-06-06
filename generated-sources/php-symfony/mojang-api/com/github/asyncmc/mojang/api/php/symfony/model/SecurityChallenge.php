<?php
/**
 * SecurityChallenge
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the SecurityChallenge model.
 *
 * Binds a question to an answer id, the answer must respect the answer id.
 *
 * @package com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model
 * @author  OpenAPI Generator team
 */
class SecurityChallenge 
{
        /**
     * @var com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityQuestion
     * @SerializedName("question")
     * @Assert\NotNull()
     * @Assert\Type("com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityQuestion")
     * @Type("com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityQuestion")
     */
    protected $question;

    /**
     * @var com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityAnswerId
     * @SerializedName("answer")
     * @Assert\NotNull()
     * @Assert\Type("com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityAnswerId")
     * @Type("com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityAnswerId")
     */
    protected $answer;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->question = isset($data['question']) ? $data['question'] : null;
        $this->answer = isset($data['answer']) ? $data['answer'] : null;
    }

    /**
     * Gets question.
     *
     * @return com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityQuestion
     */
    public function getQuestion()
    {
        return $this->question;
    }

    /**
     * Sets question.
     *
     * @param com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityQuestion $question
     *
     * @return $this
     */
    public function setQuestion(SecurityQuestion $question)
    {
        $this->question = $question;

        return $this;
    }

    /**
     * Gets answer.
     *
     * @return com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityAnswerId
     */
    public function getAnswer()
    {
        return $this->answer;
    }

    /**
     * Sets answer.
     *
     * @param com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityAnswerId $answer
     *
     * @return $this
     */
    public function setAnswer(SecurityAnswerId $answer)
    {
        $this->answer = $answer;

        return $this;
    }
}

