# coding: utf-8

"""
    Mojang API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    OpenAPI spec version: 2020-06-05
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from openapi_client.api_client import ApiClient


class SkinOperationsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def change_player_skin(self, stripped_uuid, url, **kwargs):  # noqa: E501
        """Changes the player skin by URL  # noqa: E501

        This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.change_player_skin(stripped_uuid, url, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :param str url: The URL which Mojang servers will download and apply the skin (required)
        :param SkinModel model:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.change_player_skin_with_http_info(stripped_uuid, url, **kwargs)  # noqa: E501
        else:
            (data) = self.change_player_skin_with_http_info(stripped_uuid, url, **kwargs)  # noqa: E501
            return data

    def change_player_skin_with_http_info(self, stripped_uuid, url, **kwargs):  # noqa: E501
        """Changes the player skin by URL  # noqa: E501

        This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.change_player_skin_with_http_info(stripped_uuid, url, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :param str url: The URL which Mojang servers will download and apply the skin (required)
        :param SkinModel model:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['stripped_uuid', 'url', 'model']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method change_player_skin" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'stripped_uuid' is set
        if ('stripped_uuid' not in local_var_params or
                local_var_params['stripped_uuid'] is None):
            raise ValueError("Missing the required parameter `stripped_uuid` when calling `change_player_skin`")  # noqa: E501
        # verify the required parameter 'url' is set
        if ('url' not in local_var_params or
                local_var_params['url'] is None):
            raise ValueError("Missing the required parameter `url` when calling `change_player_skin`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'stripped_uuid' in local_var_params:
            path_params['stripped_uuid'] = local_var_params['stripped_uuid']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'model' in local_var_params:
            form_params.append(('model', local_var_params['model']))  # noqa: E501
        if 'url' in local_var_params:
            form_params.append(('url', local_var_params['url']))  # noqa: E501

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['PlayerAccessToken']  # noqa: E501

        return self.api_client.call_api(
            '/user/profile/{stripped_uuid}/skin', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def reset_player_skin(self, stripped_uuid, **kwargs):  # noqa: E501
        """Resets the player skin to default  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.reset_player_skin(stripped_uuid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.reset_player_skin_with_http_info(stripped_uuid, **kwargs)  # noqa: E501
        else:
            (data) = self.reset_player_skin_with_http_info(stripped_uuid, **kwargs)  # noqa: E501
            return data

    def reset_player_skin_with_http_info(self, stripped_uuid, **kwargs):  # noqa: E501
        """Resets the player skin to default  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.reset_player_skin_with_http_info(stripped_uuid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['stripped_uuid']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method reset_player_skin" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'stripped_uuid' is set
        if ('stripped_uuid' not in local_var_params or
                local_var_params['stripped_uuid'] is None):
            raise ValueError("Missing the required parameter `stripped_uuid` when calling `reset_player_skin`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'stripped_uuid' in local_var_params:
            path_params['stripped_uuid'] = local_var_params['stripped_uuid']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['PlayerAccessToken']  # noqa: E501

        return self.api_client.call_api(
            '/user/profile/{stripped_uuid}/skin', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def upload_player_skin(self, stripped_uuid, file, **kwargs):  # noqa: E501
        """Changes the player skin by upload  # noqa: E501

        This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.upload_player_skin(stripped_uuid, file, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :param file file: The skin image in PNG format (required)
        :param SkinModel model:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.upload_player_skin_with_http_info(stripped_uuid, file, **kwargs)  # noqa: E501
        else:
            (data) = self.upload_player_skin_with_http_info(stripped_uuid, file, **kwargs)  # noqa: E501
            return data

    def upload_player_skin_with_http_info(self, stripped_uuid, file, **kwargs):  # noqa: E501
        """Changes the player skin by upload  # noqa: E501

        This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.upload_player_skin_with_http_info(stripped_uuid, file, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stripped_uuid: The player UUID without hyphens (required)
        :param file file: The skin image in PNG format (required)
        :param SkinModel model:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['stripped_uuid', 'file', 'model']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method upload_player_skin" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'stripped_uuid' is set
        if ('stripped_uuid' not in local_var_params or
                local_var_params['stripped_uuid'] is None):
            raise ValueError("Missing the required parameter `stripped_uuid` when calling `upload_player_skin`")  # noqa: E501
        # verify the required parameter 'file' is set
        if ('file' not in local_var_params or
                local_var_params['file'] is None):
            raise ValueError("Missing the required parameter `file` when calling `upload_player_skin`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'stripped_uuid' in local_var_params:
            path_params['stripped_uuid'] = local_var_params['stripped_uuid']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'model' in local_var_params:
            form_params.append(('model', local_var_params['model']))  # noqa: E501
        if 'file' in local_var_params:
            local_var_files['file'] = local_var_params['file']  # noqa: E501

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['multipart/form-data'])  # noqa: E501

        # Authentication setting
        auth_settings = ['PlayerAccessToken']  # noqa: E501

        return self.api_client.call_api(
            '/user/profile/{stripped_uuid}/skin', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
