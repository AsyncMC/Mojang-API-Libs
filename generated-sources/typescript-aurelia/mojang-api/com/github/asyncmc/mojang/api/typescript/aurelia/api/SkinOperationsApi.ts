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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  SkinModel,
} from './models';

/**
 * changePlayerSkin - parameters interface
 */
export interface IChangePlayerSkinParams {
  strippedUuid: string;
  url: string;
  model?: SkinModel;
}

/**
 * resetPlayerSkin - parameters interface
 */
export interface IResetPlayerSkinParams {
  strippedUuid: string;
}

/**
 * uploadPlayerSkin - parameters interface
 */
export interface IUploadPlayerSkinParams {
  strippedUuid: string;
  file: any;
  model?: SkinModel;
}

/**
 * SkinOperationsApi - API class
 */
@autoinject()
export class SkinOperationsApi extends Api {

  /**
   * Creates a new SkinOperationsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Changes the player skin by URL
   * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
   * @param params.strippedUuid The player UUID without hyphens
   * @param params.url The URL which Mojang servers will download and apply the skin
   * @param params.model 
   */
  async changePlayerSkin(params: IChangePlayerSkinParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('changePlayerSkin', params, 'strippedUuid');
    this.ensureParamIsSet('changePlayerSkin', params, 'url');

    // Create URL to call
    const url = `${this.basePath}/user/profile/{stripped_uuid}/skin`
      .replace(`{${'stripped_uuid'}}`, encodeURIComponent(`${params['strippedUuid']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode form parameters
      .withHeader('content-type', 'application/x-www-form-urlencoded')
      .withContent(this.queryString({ 
        'model': params['model'],
        'url': params['url'],
      }))

      // Authentication 'PlayerAccessToken' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Resets the player skin to default
   * @param params.strippedUuid The player UUID without hyphens
   */
  async resetPlayerSkin(params: IResetPlayerSkinParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('resetPlayerSkin', params, 'strippedUuid');

    // Create URL to call
    const url = `${this.basePath}/user/profile/{stripped_uuid}/skin`
      .replace(`{${'stripped_uuid'}}`, encodeURIComponent(`${params['strippedUuid']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()

      // Authentication 'PlayerAccessToken' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Changes the player skin by upload
   * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
   * @param params.strippedUuid The player UUID without hyphens
   * @param params.file The skin image in PNG format
   * @param params.model 
   */
  async uploadPlayerSkin(params: IUploadPlayerSkinParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('uploadPlayerSkin', params, 'strippedUuid');
    this.ensureParamIsSet('uploadPlayerSkin', params, 'file');

    // Create URL to call
    const url = `${this.basePath}/user/profile/{stripped_uuid}/skin`
      .replace(`{${'stripped_uuid'}}`, encodeURIComponent(`${params['strippedUuid']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPut()
      // Encode form parameters
      .withHeader('content-type', 'application/x-www-form-urlencoded')
      .withContent(this.queryString({ 
        'model': params['model'],
        'file': params['file'],
      }))

      // Authentication 'PlayerAccessToken' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}
