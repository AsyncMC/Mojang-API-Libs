<?php
/**
 * DefaultApiInterfaceTest
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.symfony.server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang Authentication API
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
 * Please update the test case below to test the endpoint.
 */

namespace com.github.asyncmc.mojang.authentication.php.symfony.server\Tests\Api;

use com.github.asyncmc.mojang.authentication.php.symfony.server\Configuration;
use com.github.asyncmc.mojang.authentication.php.symfony.server\ApiClient;
use com.github.asyncmc.mojang.authentication.php.symfony.server\ApiException;
use com.github.asyncmc.mojang.authentication.php.symfony.server\ObjectSerializer;
use Symfony\Bundle\FrameworkBundle\Test\WebTestCase;

/**
 * DefaultApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.symfony.server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */
class DefaultApiInterfaceTest extends WebTestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for authenticate
     *
     * .
     *
     */
    public function testAuthenticate()
    {
        $client = static::createClient();

        $path = '/authenticate';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for invalidate
     *
     * .
     *
     */
    public function testInvalidate()
    {
        $client = static::createClient();

        $path = '/invalidate';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for refresh
     *
     * .
     *
     */
    public function testRefresh()
    {
        $client = static::createClient();

        $path = '/refresh';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for siginout
     *
     * .
     *
     */
    public function testSiginout()
    {
        $client = static::createClient();

        $path = '/signout';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for validate
     *
     * .
     *
     */
    public function testValidate()
    {
        $client = static::createClient();

        $path = '/validate';

        $crawler = $client->request('POST', $path);
    }

    protected function genTestData($regexp)
    {
        $grammar  = new \Hoa\File\Read('hoa://Library/Regex/Grammar.pp');
        $compiler = \Hoa\Compiler\Llk\Llk::load($grammar);
        $ast      = $compiler->parse($regexp);
        $generator = new \Hoa\Regex\Visitor\Isotropic(new \Hoa\Math\Sampler\Random());

        return $generator->visit($ast); 
    }
}