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
    /// Module processing requests of Miscellaneous domain.
    /// </summary>
    public sealed class MiscellaneousModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public MiscellaneousModule(MiscellaneousService service) : base("/")
        { 
            Post["/orders/statistics"] = parameters =>
            {
                var orderStatisticsRequest = this.Bind<OrderStatisticsRequest>();
                Preconditions.IsNotNull(orderStatisticsRequest, "Required parameter: 'orderStatisticsRequest' is missing at 'GetOrdersStatistics'");
                
                return service.GetOrdersStatistics(Context, orderStatisticsRequest);
            };
        }
    }

    /// <summary>
    /// Service handling Miscellaneous requests.
    /// </summary>
    public interface MiscellaneousService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="orderStatisticsRequest">The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/</param>
        /// <returns>OrderStatisticsResponse</returns>
        OrderStatisticsResponse GetOrdersStatistics(NancyContext context, OrderStatisticsRequest orderStatisticsRequest);
    }

    /// <summary>
    /// Abstraction of MiscellaneousService.
    /// </summary>
    public abstract class AbstractMiscellaneousService: MiscellaneousService
    {
        public virtual OrderStatisticsResponse GetOrdersStatistics(NancyContext context, OrderStatisticsRequest orderStatisticsRequest)
        {
            return GetOrdersStatistics(orderStatisticsRequest);
        }

        protected abstract OrderStatisticsResponse GetOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest);
    }

}
