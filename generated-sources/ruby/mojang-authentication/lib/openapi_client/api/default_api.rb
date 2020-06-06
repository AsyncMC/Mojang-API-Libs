=begin
#Mojang Authentication API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'uri'

module OpenapiClient
  class DefaultApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # @param authentication_request 
    # @param [Hash] opts the optional parameters
    # @return [Authentication]
    def authenticate(authentication_request, opts = {})
      data, _status_code, _headers = authenticate_with_http_info(authentication_request, opts)
      data
    end

    # @param authentication_request 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Authentication, Fixnum, Hash)>] Authentication data, response status code and response headers
    def authenticate_with_http_info(authentication_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DefaultApi.authenticate ...'
      end
      # verify the required parameter 'authentication_request' is set
      if @api_client.config.client_side_validation && authentication_request.nil?
        fail ArgumentError, "Missing the required parameter 'authentication_request' when calling DefaultApi.authenticate"
      end
      # resource path
      local_var_path = '/authenticate'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(authentication_request)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Authentication')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DefaultApi#authenticate\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param access_keys 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def invalidate(access_keys, opts = {})
      invalidate_with_http_info(access_keys, opts)
      nil
    end

    # @param access_keys 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def invalidate_with_http_info(access_keys, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DefaultApi.invalidate ...'
      end
      # verify the required parameter 'access_keys' is set
      if @api_client.config.client_side_validation && access_keys.nil?
        fail ArgumentError, "Missing the required parameter 'access_keys' when calling DefaultApi.invalidate"
      end
      # resource path
      local_var_path = '/invalidate'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(access_keys)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DefaultApi#invalidate\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param refresh_request 
    # @param [Hash] opts the optional parameters
    # @return [RefreshResponse]
    def refresh(refresh_request, opts = {})
      data, _status_code, _headers = refresh_with_http_info(refresh_request, opts)
      data
    end

    # @param refresh_request 
    # @param [Hash] opts the optional parameters
    # @return [Array<(RefreshResponse, Fixnum, Hash)>] RefreshResponse data, response status code and response headers
    def refresh_with_http_info(refresh_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DefaultApi.refresh ...'
      end
      # verify the required parameter 'refresh_request' is set
      if @api_client.config.client_side_validation && refresh_request.nil?
        fail ArgumentError, "Missing the required parameter 'refresh_request' when calling DefaultApi.refresh"
      end
      # resource path
      local_var_path = '/refresh'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(refresh_request)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'RefreshResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DefaultApi#refresh\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param username_password 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def siginout(username_password, opts = {})
      siginout_with_http_info(username_password, opts)
      nil
    end

    # @param username_password 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def siginout_with_http_info(username_password, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DefaultApi.siginout ...'
      end
      # verify the required parameter 'username_password' is set
      if @api_client.config.client_side_validation && username_password.nil?
        fail ArgumentError, "Missing the required parameter 'username_password' when calling DefaultApi.siginout"
      end
      # resource path
      local_var_path = '/signout'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(username_password)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DefaultApi#siginout\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param access_keys 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def validate(access_keys, opts = {})
      validate_with_http_info(access_keys, opts)
      nil
    end

    # @param access_keys 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def validate_with_http_info(access_keys, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DefaultApi.validate ...'
      end
      # verify the required parameter 'access_keys' is set
      if @api_client.config.client_side_validation && access_keys.nil?
        fail ArgumentError, "Missing the required parameter 'access_keys' when calling DefaultApi.validate"
      end
      # resource path
      local_var_path = '/validate'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(access_keys)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DefaultApi#validate\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

  end
end
