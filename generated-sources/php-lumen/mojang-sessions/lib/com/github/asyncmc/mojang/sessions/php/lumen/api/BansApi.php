<?php

/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class BansApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getBlockedServerHashes
     *
     * A list of SHA1 hashes of banned servers.
     *
     *
     * @return Http response
     */
    public function getBlockedServerHashes()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getBlockedServerHashes as a get method ?');
    }
}
