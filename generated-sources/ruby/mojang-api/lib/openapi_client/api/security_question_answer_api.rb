=begin
#Mojang API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'uri'

module OpenapiClient
  class SecurityQuestionAnswerApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Check if security questions are needed
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def check_security_status(opts = {})
      check_security_status_with_http_info(opts)
      nil
    end

    # Check if security questions are needed
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def check_security_status_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecurityQuestionAnswerApi.check_security_status ...'
      end
      # resource path
      local_var_path = '/user/security/location'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['PlayerAccessToken']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecurityQuestionAnswerApi#check_security_status\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get list of questions
    # @param [Hash] opts the optional parameters
    # @return [Array<SecurityChallenge>]
    def list_pending_security_questions(opts = {})
      data, _status_code, _headers = list_pending_security_questions_with_http_info(opts)
      data
    end

    # Get list of questions
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<SecurityChallenge>, Fixnum, Hash)>] Array<SecurityChallenge> data, response status code and response headers
    def list_pending_security_questions_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecurityQuestionAnswerApi.list_pending_security_questions ...'
      end
      # resource path
      local_var_path = '/user/security/challenges'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['PlayerAccessToken']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<SecurityChallenge>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecurityQuestionAnswerApi#list_pending_security_questions\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Send back the answers
    # @param security_answer An array with all the answers
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def send_security_question_answers(security_answer, opts = {})
      send_security_question_answers_with_http_info(security_answer, opts)
      nil
    end

    # Send back the answers
    # @param security_answer An array with all the answers
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def send_security_question_answers_with_http_info(security_answer, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecurityQuestionAnswerApi.send_security_question_answers ...'
      end
      # verify the required parameter 'security_answer' is set
      if @api_client.config.client_side_validation && security_answer.nil?
        fail ArgumentError, "Missing the required parameter 'security_answer' when calling SecurityQuestionAnswerApi.send_security_question_answers"
      end
      # resource path
      local_var_path = '/user/security/location'

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
      post_body = @api_client.object_to_http_body(security_answer)
      auth_names = ['PlayerAccessToken']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecurityQuestionAnswerApi#send_security_question_answers\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

  end
end