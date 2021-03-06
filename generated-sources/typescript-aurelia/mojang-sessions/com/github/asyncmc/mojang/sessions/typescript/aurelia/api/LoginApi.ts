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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  PlayerProfile,
} from './models';

/**
 * getPlayerProfile - parameters interface
 */
export interface IGetPlayerProfileParams {
  strippedUuid: string;
  unsigned?: boolean;
}

/**
 * LoginApi - API class
 */
@autoinject()
export class LoginApi extends Api {

  /**
   * Creates a new LoginApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Gets the player&#39;s game profile
   * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
   * @param params.strippedUuid The player UUID without hyphens
   * @param params.unsigned When set to false, the signature data are sent
   */
  async getPlayerProfile(params: IGetPlayerProfileParams): Promise<PlayerProfile> {
    // Verify required parameters are set
    this.ensureParamIsSet('getPlayerProfile', params, 'strippedUuid');

    // Create URL to call
    const url = `${this.basePath}/session/minecraft/profile/{stripped_uuid}`
      .replace(`{${'stripped_uuid'}}`, encodeURIComponent(`${params['strippedUuid']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'unsigned': params['unsigned'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

