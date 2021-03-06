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
import { SkinModel } from './skinModel';


/**
 * Request Mojang to download a skin from an URL and apply to the player
 */
export interface ChangeSkinRequest { 
    model?: SkinModel;
    /**
     * The URL which Mojang servers will download and apply the skin
     */
    url: string;
}
