using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools..Models;
using Org.OpenAPITools..Utils;
using NodaTime;

namespace Org.OpenAPITools..Modules
{ 

    /// <summary>
    /// Module processing requests of Default domain.
    /// </summary>
    public sealed class DefaultModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public DefaultModule(DefaultService service) : base("/")
        { 
            Get["/check"] = parameters =>
            {
                
                return service.CheckStatuses(Context).ToArray();
            };
        }
    }

    /// <summary>
    /// Service handling Default requests.
    /// </summary>
    public interface DefaultService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>List&lt;Dictionary&lt;string, ApiStatus&gt;&gt;</returns>
        List<Dictionary<string, ApiStatus>> CheckStatuses(NancyContext context);
    }

    /// <summary>
    /// Abstraction of DefaultService.
    /// </summary>
    public abstract class AbstractDefaultService: DefaultService
    {
        public virtual List<Dictionary<string, ApiStatus>> CheckStatuses(NancyContext context)
        {
            return CheckStatuses();
        }

        protected abstract List<Dictionary<string, ApiStatus>> CheckStatuses();
    }

}
