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
    /// Module processing requests of NameHistory domain.
    /// </summary>
    public sealed class NameHistoryModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public NameHistoryModule(NameHistoryService service) : base("/")
        { 
            Post["/profiles/minecraft"] = parameters =>
            {
                var requestBody = this.Bind<List<string>>();
                Preconditions.IsNotNull(requestBody, "Required parameter: 'requestBody' is missing at 'FindUniqueIdsByName'");
                
                return service.FindUniqueIdsByName(Context, requestBody).ToArray();
            };

            Get["/user/profiles/{stripped_uuid}/names"] = parameters =>
            {
                var strippedUuid = Parameters.ValueOf<string>(parameters, Context.Request, "strippedUuid", ParameterType.Path);
                Preconditions.IsNotNull(strippedUuid, "Required parameter: 'strippedUuid' is missing at 'GetNameHistory'");
                
                return service.GetNameHistory(Context, strippedUuid).ToArray();
            };

            Get["/users/profiles/minecraft/{username}"] = parameters =>
            {
                var username = Parameters.ValueOf<string>(parameters, Context.Request, "username", ParameterType.Path);
                var at = Parameters.ValueOf<long?>(parameters, Context.Request, "at", ParameterType.Query);
                Preconditions.IsNotNull(username, "Required parameter: 'username' is missing at 'GetUniqueIdByName'");
                
                return service.GetUniqueIdByName(Context, username, at);
            };
        }
    }

    /// <summary>
    /// Service handling NameHistory requests.
    /// </summary>
    public interface NameHistoryService
    {
        /// <summary>
        /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>List&lt;CurrentPlayerIDs&gt;</returns>
        List<CurrentPlayerIDs> FindUniqueIdsByName(NancyContext context, List<string> requestBody);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>List&lt;NameChange&gt;</returns>
        List<NameChange> GetNameHistory(NancyContext context, string strippedUuid);

        /// <summary>
        /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>CurrentPlayerIDs</returns>
        CurrentPlayerIDs GetUniqueIdByName(NancyContext context, string username, long? at);
    }

    /// <summary>
    /// Abstraction of NameHistoryService.
    /// </summary>
    public abstract class AbstractNameHistoryService: NameHistoryService
    {
        public virtual List<CurrentPlayerIDs> FindUniqueIdsByName(NancyContext context, List<string> requestBody)
        {
            return FindUniqueIdsByName(requestBody);
        }

        public virtual List<NameChange> GetNameHistory(NancyContext context, string strippedUuid)
        {
            return GetNameHistory(strippedUuid);
        }

        public virtual CurrentPlayerIDs GetUniqueIdByName(NancyContext context, string username, long? at)
        {
            return GetUniqueIdByName(username, at);
        }

        protected abstract List<CurrentPlayerIDs> FindUniqueIdsByName(List<string> requestBody);

        protected abstract List<NameChange> GetNameHistory(string strippedUuid);

        protected abstract CurrentPlayerIDs GetUniqueIdByName(string username, long? at);
    }

}
