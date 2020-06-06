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
    /// Module processing requests of SecurityQuestionAnswer domain.
    /// </summary>
    public sealed class SecurityQuestionAnswerModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SecurityQuestionAnswerModule(SecurityQuestionAnswerService service) : base("/")
        { 
            Get["/user/security/location"] = parameters =>
            {
                
                service.CheckSecurityStatus(Context);
                return new Response { ContentType = "application/json"};
            };

            Get["/user/security/challenges"] = parameters =>
            {
                
                return service.ListPendingSecurityQuestions(Context).ToArray();
            };

            Post["/user/security/location"] = parameters =>
            {
                var securityAnswer = this.Bind<List<SecurityAnswer>>();
                Preconditions.IsNotNull(securityAnswer, "Required parameter: 'securityAnswer' is missing at 'SendSecurityQuestionAnswers'");
                
                service.SendSecurityQuestionAnswers(Context, securityAnswer);
                return new Response { ContentType = "application/json"};
            };
        }
    }

    /// <summary>
    /// Service handling SecurityQuestionAnswer requests.
    /// </summary>
    public interface SecurityQuestionAnswerService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns></returns>
        void CheckSecurityStatus(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>List&lt;SecurityChallenge&gt;</returns>
        List<SecurityChallenge> ListPendingSecurityQuestions(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="securityAnswer">An array with all the answers</param>
        /// <returns></returns>
        void SendSecurityQuestionAnswers(NancyContext context, List<SecurityAnswer> securityAnswer);
    }

    /// <summary>
    /// Abstraction of SecurityQuestionAnswerService.
    /// </summary>
    public abstract class AbstractSecurityQuestionAnswerService: SecurityQuestionAnswerService
    {
        public virtual void CheckSecurityStatus(NancyContext context)
        {
            CheckSecurityStatus();
        }

        public virtual List<SecurityChallenge> ListPendingSecurityQuestions(NancyContext context)
        {
            return ListPendingSecurityQuestions();
        }

        public virtual void SendSecurityQuestionAnswers(NancyContext context, List<SecurityAnswer> securityAnswer)
        {
            SendSecurityQuestionAnswers(securityAnswer);
        }

        protected abstract void CheckSecurityStatus();

        protected abstract List<SecurityChallenge> ListPendingSecurityQuestions();

        protected abstract void SendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer);
    }

}
