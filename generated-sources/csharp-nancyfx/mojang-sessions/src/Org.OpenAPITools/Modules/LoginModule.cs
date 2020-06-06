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
    /// Module processing requests of Login domain.
    /// </summary>
    public sealed class LoginModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public LoginModule(LoginService service) : base("/")
        { 
            Get["/session/minecraft/profile/{stripped_uuid}"] = parameters =>
            {
                var strippedUuid = Parameters.ValueOf<string>(parameters, Context.Request, "strippedUuid", ParameterType.Path);
                var unsigned = Parameters.ValueOf<bool?>(parameters, Context.Request, "unsigned", ParameterType.Query);
                Preconditions.IsNotNull(strippedUuid, "Required parameter: 'strippedUuid' is missing at 'GetPlayerProfile'");
                
                return service.GetPlayerProfile(Context, strippedUuid, unsigned);
            };
        }
    }

    /// <summary>
    /// Service handling Login requests.
    /// </summary>
    public interface LoginService
    {
        /// <summary>
        /// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>PlayerProfile</returns>
        PlayerProfile GetPlayerProfile(NancyContext context, string strippedUuid, bool? unsigned);
    }

    /// <summary>
    /// Abstraction of LoginService.
    /// </summary>
    public abstract class AbstractLoginService: LoginService
    {
        public virtual PlayerProfile GetPlayerProfile(NancyContext context, string strippedUuid, bool? unsigned)
        {
            return GetPlayerProfile(strippedUuid, unsigned);
        }

        protected abstract PlayerProfile GetPlayerProfile(string strippedUuid, bool? unsigned);
    }

}
