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
    /// Module processing requests of SkinOperations domain.
    /// </summary>
    public sealed class SkinOperationsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SkinOperationsModule(SkinOperationsService service) : base("/")
        { 
            Post["/user/profile/{stripped_uuid}/skin"] = parameters =>
            {
                var strippedUuid = Parameters.ValueOf<string>(parameters, Context.Request, "strippedUuid", ParameterType.Path);
                var url = Parameters.ValueOf<string>(parameters, Context.Request, "url", ParameterType.Undefined);
                var model = Parameters.ValueOf<SkinModel>(parameters, Context.Request, "model", ParameterType.Undefined);
                Preconditions.IsNotNull(strippedUuid, "Required parameter: 'strippedUuid' is missing at 'ChangePlayerSkin'");
                
                Preconditions.IsNotNull(url, "Required parameter: 'url' is missing at 'ChangePlayerSkin'");
                
                service.ChangePlayerSkin(Context, strippedUuid, url, model);
                return new Response { ContentType = "application/json"};
            };

            Delete["/user/profile/{stripped_uuid}/skin"] = parameters =>
            {
                var strippedUuid = Parameters.ValueOf<string>(parameters, Context.Request, "strippedUuid", ParameterType.Path);
                Preconditions.IsNotNull(strippedUuid, "Required parameter: 'strippedUuid' is missing at 'ResetPlayerSkin'");
                
                service.ResetPlayerSkin(Context, strippedUuid);
                return new Response { ContentType = "application/json"};
            };

            Put["/user/profile/{stripped_uuid}/skin"] = parameters =>
            {
                var strippedUuid = Parameters.ValueOf<string>(parameters, Context.Request, "strippedUuid", ParameterType.Path);
                var file = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "file", ParameterType.Undefined);
                var model = Parameters.ValueOf<SkinModel>(parameters, Context.Request, "model", ParameterType.Undefined);
                Preconditions.IsNotNull(strippedUuid, "Required parameter: 'strippedUuid' is missing at 'UploadPlayerSkin'");
                
                Preconditions.IsNotNull(file, "Required parameter: 'file' is missing at 'UploadPlayerSkin'");
                
                service.UploadPlayerSkin(Context, strippedUuid, file, model);
                return new Response { ContentType = "application/json"};
            };
        }
    }

    /// <summary>
    /// Service handling SkinOperations requests.
    /// </summary>
    public interface SkinOperationsService
    {
        /// <summary>
        /// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns></returns>
        void ChangePlayerSkin(NancyContext context, string strippedUuid, string url, SkinModel model);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns></returns>
        void ResetPlayerSkin(NancyContext context, string strippedUuid);

        /// <summary>
        /// This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns></returns>
        void UploadPlayerSkin(NancyContext context, string strippedUuid, System.IO.Stream file, SkinModel model);
    }

    /// <summary>
    /// Abstraction of SkinOperationsService.
    /// </summary>
    public abstract class AbstractSkinOperationsService: SkinOperationsService
    {
        public virtual void ChangePlayerSkin(NancyContext context, string strippedUuid, string url, SkinModel model)
        {
            ChangePlayerSkin(strippedUuid, url, model);
        }

        public virtual void ResetPlayerSkin(NancyContext context, string strippedUuid)
        {
            ResetPlayerSkin(strippedUuid);
        }

        public virtual void UploadPlayerSkin(NancyContext context, string strippedUuid, System.IO.Stream file, SkinModel model)
        {
            UploadPlayerSkin(strippedUuid, file, model);
        }

        protected abstract void ChangePlayerSkin(string strippedUuid, string url, SkinModel model);

        protected abstract void ResetPlayerSkin(string strippedUuid);

        protected abstract void UploadPlayerSkin(string strippedUuid, System.IO.Stream file, SkinModel model);
    }

}
