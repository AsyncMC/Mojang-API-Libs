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
    /// Module processing requests of Bans domain.
    /// </summary>
    public sealed class BansModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public BansModule(BansService service) : base("/")
        { 
            Get["/blockedservers"] = parameters =>
            {
                
                return service.GetBlockedServerHashes(Context);
            };
        }
    }

    /// <summary>
    /// Service handling Bans requests.
    /// </summary>
    public interface BansService
    {
        /// <summary>
        /// Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>string</returns>
        string GetBlockedServerHashes(NancyContext context);
    }

    /// <summary>
    /// Abstraction of BansService.
    /// </summary>
    public abstract class AbstractBansService: BansService
    {
        public virtual string GetBlockedServerHashes(NancyContext context)
        {
            return GetBlockedServerHashes();
        }

        protected abstract string GetBlockedServerHashes();
    }

}
