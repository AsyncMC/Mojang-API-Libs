<?php

/**
 * Mojang API
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

class DefaultApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation checkStatuses
     *
     * Checks the Mojang service statuses.
     *
     *
     * @return Http response
     */
    public function checkStatuses()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing checkStatuses as a get method ?');
    }
}
