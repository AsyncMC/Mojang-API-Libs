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
            Post["/authenticate"] = parameters =>
            {
                var authenticationRequest = this.Bind<AuthenticationRequest>();
                Preconditions.IsNotNull(authenticationRequest, "Required parameter: 'authenticationRequest' is missing at 'Authenticate'");
                
                return service.Authenticate(Context, authenticationRequest);
            };

            Post["/invalidate"] = parameters =>
            {
                var accessKeys = this.Bind<AccessKeys>();
                Preconditions.IsNotNull(accessKeys, "Required parameter: 'accessKeys' is missing at 'Invalidate'");
                
                service.Invalidate(Context, accessKeys);
                return new Response { ContentType = "application/json"};
            };

            Post["/refresh"] = parameters =>
            {
                var refreshRequest = this.Bind<RefreshRequest>();
                Preconditions.IsNotNull(refreshRequest, "Required parameter: 'refreshRequest' is missing at 'Refresh'");
                
                return service.Refresh(Context, refreshRequest);
            };

            Post["/signout"] = parameters =>
            {
                var usernamePassword = this.Bind<UsernamePassword>();
                Preconditions.IsNotNull(usernamePassword, "Required parameter: 'usernamePassword' is missing at 'Siginout'");
                
                service.Siginout(Context, usernamePassword);
                return new Response { ContentType = "application/json"};
            };

            Post["/validate"] = parameters =>
            {
                var accessKeys = this.Bind<AccessKeys>();
                Preconditions.IsNotNull(accessKeys, "Required parameter: 'accessKeys' is missing at 'Validate'");
                
                service.Validate(Context, accessKeys);
                return new Response { ContentType = "application/json"};
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
        /// <param name="authenticationRequest"></param>
        /// <returns>Authentication</returns>
        Authentication Authenticate(NancyContext context, AuthenticationRequest authenticationRequest);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        void Invalidate(NancyContext context, AccessKeys accessKeys);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="refreshRequest"></param>
        /// <returns>RefreshResponse</returns>
        RefreshResponse Refresh(NancyContext context, RefreshRequest refreshRequest);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="usernamePassword"></param>
        /// <returns></returns>
        void Siginout(NancyContext context, UsernamePassword usernamePassword);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        void Validate(NancyContext context, AccessKeys accessKeys);
    }

    /// <summary>
    /// Abstraction of DefaultService.
    /// </summary>
    public abstract class AbstractDefaultService: DefaultService
    {
        public virtual Authentication Authenticate(NancyContext context, AuthenticationRequest authenticationRequest)
        {
            return Authenticate(authenticationRequest);
        }

        public virtual void Invalidate(NancyContext context, AccessKeys accessKeys)
        {
            Invalidate(accessKeys);
        }

        public virtual RefreshResponse Refresh(NancyContext context, RefreshRequest refreshRequest)
        {
            return Refresh(refreshRequest);
        }

        public virtual void Siginout(NancyContext context, UsernamePassword usernamePassword)
        {
            Siginout(usernamePassword);
        }

        public virtual void Validate(NancyContext context, AccessKeys accessKeys)
        {
            Validate(accessKeys);
        }

        protected abstract Authentication Authenticate(AuthenticationRequest authenticationRequest);

        protected abstract void Invalidate(AccessKeys accessKeys);

        protected abstract RefreshResponse Refresh(RefreshRequest refreshRequest);

        protected abstract void Siginout(UsernamePassword usernamePassword);

        protected abstract void Validate(AccessKeys accessKeys);
    }

}
