/* 
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Globalization;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.IO;
using System.Web;
using System.Linq;
using System.Net;
using System.Text;
using Newtonsoft.Json;
using RestSharp;
using RestSharpMethod = RestSharp.Method;

namespace Org.OpenAPITools.Client
{
    /// <summary>
    /// Allows RestSharp to Serialize/Deserialize JSON using our custom logic, but only when ContentType is JSON. 
    /// </summary>
    internal class CustomJsonCodec : RestSharp.Serializers.ISerializer, RestSharp.Deserializers.IDeserializer
    {
        private readonly IReadableConfiguration _configuration;
        private readonly JsonSerializer _serializer;
        private string _contentType = "application/json";
        private readonly JsonSerializerSettings _serializerSettings = new JsonSerializerSettings
        {
            // Swagger generated types generally hide default constructors.
            ConstructorHandling = ConstructorHandling.AllowNonPublicDefaultConstructor
        };

        public CustomJsonCodec(IReadableConfiguration configuration)
        {
            _configuration = configuration;
            _serializer = JsonSerializer.Create(_serializerSettings);
        }

        public CustomJsonCodec(JsonSerializerSettings serializerSettings, IReadableConfiguration configuration)
        {
            _serializerSettings = serializerSettings;
            _serializer = JsonSerializer.Create(_serializerSettings);
            _configuration = configuration;
        }

        public string Serialize(object obj)
        {
            using (var writer = new StringWriter())
            using (var jsonWriter = new JsonTextWriter(writer)
            {
                Formatting = Formatting.None, 
                DateFormatString = _configuration.DateTimeFormat
            })
            {
                _serializer.Serialize(jsonWriter, obj);
                return writer.ToString();
            }
        }

        public T Deserialize<T>(IRestResponse response)
        {
            return (T) Deserialize(response, typeof(T));
        }

        /// <summary>
        /// Deserialize the JSON string into a proper object.
        /// </summary>
        /// <param name="response">The HTTP response.</param>
        /// <param name="type">Object type.</param>
        /// <returns>Object representation of the JSON string.</returns>
        internal object Deserialize(IRestResponse response, Type type)
        {
            IList<Parameter> headers = response.Headers;
            if (type == typeof(byte[])) // return byte array
            {
                return response.RawBytes;
            }

            // TODO: ? if (type.IsAssignableFrom(typeof(Stream)))
            if (type == typeof(Stream))
            {
                if (headers != null)
                {
                    var filePath = String.IsNullOrEmpty(_configuration.TempFolderPath)
                        ? Path.GetTempPath()
                        : _configuration.TempFolderPath;
                    var regex = new Regex(@"Content-Disposition=.*filename=['""]?([^'""\s]+)['""]?$");
                    foreach (var header in headers)
                    {
                        var match = regex.Match(header.ToString());
                        if (match.Success)
                        {
                            string fileName = filePath + ClientUtils.SanitizeFilename(match.Groups[1].Value.Replace("\"", "").Replace("'", ""));
                            File.WriteAllBytes(fileName, response.RawBytes);
                            return new FileStream(fileName, FileMode.Open);
                        }
                    }
                }
                var stream = new MemoryStream(response.RawBytes);
                return stream;
            }

            if (type.Name.StartsWith("System.Nullable`1[[System.DateTime")) // return a datetime object
            {
                return DateTime.Parse(response.Content,  null, System.Globalization.DateTimeStyles.RoundtripKind);
            }

            if (type == typeof(String) || type.Name.StartsWith("System.Nullable")) // return primitive type
            {
                return ClientUtils.ConvertType(response.Content, type);
            }

            // at this point, it must be a model (json)
            try
            {
                return JsonConvert.DeserializeObject(response.Content, type, _serializerSettings);
            }
            catch (Exception e)
            {
                throw new ApiException(500, e.Message);
            }
        }

        public string RootElement { get; set; }
        public string Namespace { get; set; }
        public string DateFormat { get; set; }

        public string ContentType
        {
            get { return _contentType; }
            set { throw new InvalidOperationException("Not allowed to set content type."); }
        }
    }
    /// <summary>
    /// Provides a default implementation of an Api client (both synchronous and asynchronous implementatios),
    /// encapsulating general REST accessor use cases.
    /// </summary>
    public partial class ApiClient : ISynchronousClient, IAsynchronousClient
    {
        private readonly String _baseUrl;

        /// <summary>
        /// Allows for extending request processing for <see cref="ApiClient"/> generated code.
        /// </summary>
        /// <param name="request">The RestSharp request object</param>
        partial void InterceptRequest(IRestRequest request);

        /// <summary>
        /// Allows for extending response processing for <see cref="ApiClient"/> generated code.
        /// </summary>
        /// <param name="request">The RestSharp request object</param>
        /// <param name="response">The RestSharp response object</param>
        partial void InterceptResponse(IRestRequest request, IRestResponse response);

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiClient" />, defaulting to the global configurations' base url.
        /// </summary>
        public ApiClient()
        {
            _baseUrl = Org.OpenAPITools.Client.GlobalConfiguration.Instance.BasePath;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiClient" />
        /// </summary>
        /// <param name="baseUrl">The target service's base path in URL format.</param>
        /// <exception cref="ArgumentException"></exception>
        public ApiClient(String basePath)
        {
           if (String.IsNullOrEmpty(basePath))
                throw new ArgumentException("basePath cannot be empty");

            _baseUrl = basePath;
        }

        /// <summary>
        /// Constructs the RestSharp version of an http method
        /// </summary>
        /// <param name="method">Swagger Client Custom HttpMethod</param>
        /// <returns>RestSharp's HttpMethod instance.</returns>
        /// <exception cref="ArgumentOutOfRangeException"></exception>
        private RestSharpMethod Method(HttpMethod method)
        {
            RestSharpMethod other;
            switch (method)
            {
                case HttpMethod.Get:
                    other = RestSharpMethod.GET;
                    break;
                case HttpMethod.Post:
                    other = RestSharpMethod.POST;
                    break;
                case HttpMethod.Put:
                    other = RestSharpMethod.PUT;
                    break;
                case HttpMethod.Delete:
                    other = RestSharpMethod.DELETE;
                    break;
                case HttpMethod.Head:
                    other = RestSharpMethod.HEAD;
                    break;
                case HttpMethod.Options:
                    other = RestSharpMethod.OPTIONS;
                    break;
                case HttpMethod.Patch:
                    other = RestSharpMethod.PATCH;
                    break;
                default:
                    throw new ArgumentOutOfRangeException("method", method, null);
            }

            return other;
        }

        /// <summary>
        /// Provides all logic for constructing a new RestSharp <see cref="RestRequest"/>.
        /// At this point, all information for querying the service is known. Here, it is simply
        /// mapped into the RestSharp request.
        /// </summary>
        /// <param name="method">The http verb.</param>
        /// <param name="path">The target path (or resource).</param>
        /// <param name="options">The additional request options.</param>
        /// <param name="configuration">A per-request configuration object. It is assumed that any merge with
        /// GlobalConfiguration has been done before calling this method.</param>
        /// <returns>[private] A new RestRequest instance.</returns>
        /// <exception cref="ArgumentNullException"></exception>
        private RestRequest newRequest(
            HttpMethod method,
            String path,
            RequestOptions options,
            IReadableConfiguration configuration)
        {
            if (path == null) throw new ArgumentNullException("path");
            if (options == null) throw new ArgumentNullException("options");
            if (configuration == null) throw new ArgumentNullException("configuration");
            
            RestRequest request = new RestRequest(path, Method(method));

            if (options.PathParameters != null)
            {
                foreach (var pathParam in options.PathParameters)
                {
                    request.AddParameter(pathParam.Key, pathParam.Value, ParameterType.UrlSegment);
                }
            }
            
            if (options.QueryParameters != null)
            {
                foreach (var queryParam in options.QueryParameters)
                {
                    foreach (var value in queryParam.Value)
                    {
                        request.AddQueryParameter(queryParam.Key, value);
                    }
                }
            }

            if (options.HeaderParameters != null)
            {
                foreach (var headerParam in options.HeaderParameters)
                {
                    foreach (var value in headerParam.Value)
                    {
                        request.AddHeader(headerParam.Key, value);
                    }
                }
            }

            if (options.FormParameters != null)
            {
                foreach (var formParam in options.FormParameters)
                {
                    request.AddParameter(formParam.Key, formParam.Value);
                }
            }

            if (options.Data != null)
            {
                if (options.HeaderParameters != null)
                {
                    var contentTypes = options.HeaderParameters["Content-Type"];
                    if (contentTypes == null || contentTypes.Any(header => header.Contains("application/json")))
                    {
                        request.RequestFormat = DataFormat.Json;
                    }
                    else
                    {
                        // TODO: Generated client user should add additional handlers. RestSharp only supports XML and JSON, with XML as default.
                    }
                }
                else
                {
                    // Here, we'll assume JSON APIs are more common. XML can be forced by adding produces/consumes to openapi spec explicitly.
                    request.RequestFormat = DataFormat.Json;
                }

                request.AddBody(options.Data);
            }

            if (options.FileParameters != null)
            {
                foreach (var fileParam in options.FileParameters)
                {
                    var bytes = ClientUtils.ReadAsBytes(fileParam.Value);
                    var fileStream = fileParam.Value as FileStream;
                    if (fileStream != null)
                        FileParameter.Create(fileParam.Key, bytes, System.IO.Path.GetFileName(fileStream.Name));
                    else
                        FileParameter.Create(fileParam.Key, bytes, "no_file_name_provided");
                }
            }

            if (options.Cookies != null && options.Cookies.Count > 0)
            {
                foreach (var cookie in options.Cookies)
                {
                    request.AddCookie(cookie.Name, cookie.Value);
                }
            }
            
            return request;
        }

        private ApiResponse<T> toApiResponse<T>(IRestResponse<T> response)
        {
            T result = response.Data;
            var transformed = new ApiResponse<T>(response.StatusCode, new Multimap<string, string>(), result)
            {
                ErrorText = response.ErrorMessage,
                Cookies = new List<Cookie>()
            };
            
            if (response.Headers != null)
            {
                foreach (var responseHeader in response.Headers)
                {
                    transformed.Headers.Add(responseHeader.Name, ClientUtils.ParameterToString(responseHeader.Value));
                }
            }

            if (response.Cookies != null)
            {
                foreach (var responseCookies in response.Cookies)
                {
                    transformed.Cookies.Add(
                        new Cookie(
                            responseCookies.Name, 
                            responseCookies.Value, 
                            responseCookies.Path, 
                            responseCookies.Domain)
                        );
                }
            }

            return transformed;
        }

        private async Task<ApiResponse<T>> Exec<T>(RestRequest req, IReadableConfiguration configuration)
        {
            RestClient client = new RestClient(_baseUrl);

            var codec = new CustomJsonCodec(configuration);
            req.JsonSerializer = codec;
            client.AddHandler(codec.ContentType, codec);

            client.Timeout = configuration.Timeout;

            if (configuration.UserAgent != null)
            {
                client.UserAgent = configuration.UserAgent;
            }
            
            InterceptRequest(req);
            var response = await client.ExecuteTaskAsync<T>(req);
            InterceptResponse(req, response);

            var result = toApiResponse(response);
            if (response.ErrorMessage != null)
            {
                result.ErrorText = response.ErrorMessage;
            }

            if (response.Cookies != null && response.Cookies.Count > 0)
            {
                if(result.Cookies == null) result.Cookies = new List<Cookie>();
                foreach (var restResponseCookie in response.Cookies)
                {
                    var cookie = new Cookie(
                        restResponseCookie.Name,
                        restResponseCookie.Value,
                        restResponseCookie.Path,
                        restResponseCookie.Domain
                    )
                    {
                        Comment = restResponseCookie.Comment,
                        CommentUri = restResponseCookie.CommentUri,
                        Discard = restResponseCookie.Discard,
                        Expired = restResponseCookie.Expired,
                        Expires = restResponseCookie.Expires,
                        HttpOnly = restResponseCookie.HttpOnly,
                        Port = restResponseCookie.Port,
                        Secure = restResponseCookie.Secure,
                        Version = restResponseCookie.Version
                    };
                    
                    result.Cookies.Add(cookie);
                }
            }
            return result;
        }
        
        #region IAsynchronousClient
        public async Task<ApiResponse<T>> GetAsync<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            var config = configuration ?? GlobalConfiguration.Instance;
            return await Exec<T>(newRequest(HttpMethod.Get, path, options, config), config);
        }

        public async Task<ApiResponse<T>> PostAsync<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            var config = configuration ?? GlobalConfiguration.Instance;
            return await Exec<T>(newRequest(HttpMethod.Post, path, options, config), config);
        }

        public async Task<ApiResponse<T>> PutAsync<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            var config = configuration ?? GlobalConfiguration.Instance;
            return await Exec<T>(newRequest(HttpMethod.Put, path, options, config), config);
        }

        public async Task<ApiResponse<T>> DeleteAsync<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            var config = configuration ?? GlobalConfiguration.Instance;
            return await Exec<T>(newRequest(HttpMethod.Delete, path, options, config), config);
        }

        public async Task<ApiResponse<T>> HeadAsync<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            var config = configuration ?? GlobalConfiguration.Instance;
            return await Exec<T>(newRequest(HttpMethod.Head, path, options, config), config);
        }

        public async Task<ApiResponse<T>> OptionsAsync<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            var config = configuration ?? GlobalConfiguration.Instance;
            return await Exec<T>(newRequest(HttpMethod.Options, path, options, config), config);
        }

        public async Task<ApiResponse<T>> PatchAsync<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            var config = configuration ?? GlobalConfiguration.Instance;
            return await Exec<T>(newRequest(HttpMethod.Patch, path, options, config), config);
        }
        #endregion IAsynchronousClient

        #region ISynchronousClient
        public ApiResponse<T> Get<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            return GetAsync<T>(path, options, configuration).Result;
        }

        public ApiResponse<T> Post<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            return PostAsync<T>(path, options, configuration).Result;
        }

        public ApiResponse<T> Put<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            return PutAsync<T>(path, options, configuration).Result;
        }

        public ApiResponse<T> Delete<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            return DeleteAsync<T>(path, options, configuration).Result;
        }

        public ApiResponse<T> Head<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            return HeadAsync<T>(path, options, configuration).Result;
        }

        public ApiResponse<T> Options<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            return OptionsAsync<T>(path, options, configuration).Result;
        }

        public ApiResponse<T> Patch<T>(string path, RequestOptions options, IReadableConfiguration configuration = null)
        {
            return PatchAsync<T>(path, options, configuration).Result;
        }
        #endregion ISynchronousClient
    }
}
