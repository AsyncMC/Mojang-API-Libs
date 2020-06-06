# coding: utf-8

"""
    Mojang Session API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 2020-06-05
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from openapi_client.api_client import ApiClient


class LoginApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_player_profile(self, stripped_uuid, **kwargs):  # noqa: E501
        """Gets the player's game profile  # noqa: E501

        This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_player_profile(stripped_uuid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :param bool unsigned: When set to false, the signature data are sent
        :return: PlayerProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_player_profile_with_http_info(stripped_uuid, **kwargs)  # noqa: E501
        else:
            (data) = self.get_player_profile_with_http_info(stripped_uuid, **kwargs)  # noqa: E501
            return data

    def get_player_profile_with_http_info(self, stripped_uuid, **kwargs):  # noqa: E501
        """Gets the player's game profile  # noqa: E501

        This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_player_profile_with_http_info(stripped_uuid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :param bool unsigned: When set to false, the signature data are sent
        :return: PlayerProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['stripped_uuid', 'unsigned']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_player_profile" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'stripped_uuid' is set
        if ('stripped_uuid' not in local_var_params or
                local_var_params['stripped_uuid'] is None):
            raise ValueError("Missing the required parameter `stripped_uuid` when calling `get_player_profile`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'stripped_uuid' in local_var_params:
            path_params['stripped_uuid'] = local_var_params['stripped_uuid']  # noqa: E501

        query_params = []
        if 'unsigned' in local_var_params:
            query_params.append(('unsigned', local_var_params['unsigned']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/session/minecraft/profile/{stripped_uuid}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PlayerProfile',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)