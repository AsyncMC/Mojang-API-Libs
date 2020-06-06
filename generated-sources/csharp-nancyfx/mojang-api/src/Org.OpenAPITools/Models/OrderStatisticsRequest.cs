using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// The body of the request to get the order statistics
    /// </summary>
    public sealed class OrderStatisticsRequest:  IEquatable<OrderStatisticsRequest>
    { 
        /// <summary>
        /// MetricKeys
        /// </summary>
        public List<OrderStatistic> MetricKeys { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrderStatisticsRequest.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrderStatisticsRequest()
        {
        }

        private OrderStatisticsRequest(List<OrderStatistic> MetricKeys)
        {
            
            this.MetricKeys = MetricKeys;
            
        }

        /// <summary>
        /// Returns builder of OrderStatisticsRequest.
        /// </summary>
        /// <returns>OrderStatisticsRequestBuilder</returns>
        public static OrderStatisticsRequestBuilder Builder()
        {
            return new OrderStatisticsRequestBuilder();
        }

        /// <summary>
        /// Returns OrderStatisticsRequestBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrderStatisticsRequestBuilder</returns>
        public OrderStatisticsRequestBuilder With()
        {
            return Builder()
                .MetricKeys(MetricKeys);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrderStatisticsRequest other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrderStatisticsRequest.
        /// </summary>
        /// <param name="left">Compared (OrderStatisticsRequest</param>
        /// <param name="right">Compared (OrderStatisticsRequest</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrderStatisticsRequest left, OrderStatisticsRequest right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrderStatisticsRequest.
        /// </summary>
        /// <param name="left">Compared (OrderStatisticsRequest</param>
        /// <param name="right">Compared (OrderStatisticsRequest</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrderStatisticsRequest left, OrderStatisticsRequest right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrderStatisticsRequest.
        /// </summary>
        public sealed class OrderStatisticsRequestBuilder
        {
            private List<OrderStatistic> _MetricKeys;

            internal OrderStatisticsRequestBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrderStatisticsRequest.MetricKeys property.
            /// </summary>
            /// <param name="value">MetricKeys</param>
            public OrderStatisticsRequestBuilder MetricKeys(List<OrderStatistic> value)
            {
                _MetricKeys = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrderStatisticsRequest.
            /// </summary>
            /// <returns>OrderStatisticsRequest</returns>
            public OrderStatisticsRequest Build()
            {
                Validate();
                return new OrderStatisticsRequest(
                    MetricKeys: _MetricKeys
                );
            }

            private void Validate()
            { 
                if (_MetricKeys == null)
                {
                    throw new ArgumentException("MetricKeys is a required property for OrderStatisticsRequest and cannot be null");
                } 
            }
        }

        
    }
}