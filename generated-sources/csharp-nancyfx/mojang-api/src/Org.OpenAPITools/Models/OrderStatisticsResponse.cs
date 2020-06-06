using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
    /// </summary>
    public sealed class OrderStatisticsResponse:  IEquatable<OrderStatisticsResponse>
    { 
        /// <summary>
        /// total amount sold
        /// </summary>
        public long? Total { get; private set; }

        /// <summary>
        /// total sold in last 24 hours
        /// </summary>
        public long? Last24h { get; private set; }

        /// <summary>
        /// decimal average sales per second
        /// </summary>
        public double? SaleVelocityPerSeconds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrderStatisticsResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrderStatisticsResponse()
        {
        }

        private OrderStatisticsResponse(long? Total, long? Last24h, double? SaleVelocityPerSeconds)
        {
            
            this.Total = Total;
            
            this.Last24h = Last24h;
            
            this.SaleVelocityPerSeconds = SaleVelocityPerSeconds;
            
        }

        /// <summary>
        /// Returns builder of OrderStatisticsResponse.
        /// </summary>
        /// <returns>OrderStatisticsResponseBuilder</returns>
        public static OrderStatisticsResponseBuilder Builder()
        {
            return new OrderStatisticsResponseBuilder();
        }

        /// <summary>
        /// Returns OrderStatisticsResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrderStatisticsResponseBuilder</returns>
        public OrderStatisticsResponseBuilder With()
        {
            return Builder()
                .Total(Total)
                .Last24h(Last24h)
                .SaleVelocityPerSeconds(SaleVelocityPerSeconds);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrderStatisticsResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrderStatisticsResponse.
        /// </summary>
        /// <param name="left">Compared (OrderStatisticsResponse</param>
        /// <param name="right">Compared (OrderStatisticsResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrderStatisticsResponse left, OrderStatisticsResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrderStatisticsResponse.
        /// </summary>
        /// <param name="left">Compared (OrderStatisticsResponse</param>
        /// <param name="right">Compared (OrderStatisticsResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrderStatisticsResponse left, OrderStatisticsResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrderStatisticsResponse.
        /// </summary>
        public sealed class OrderStatisticsResponseBuilder
        {
            private long? _Total;
            private long? _Last24h;
            private double? _SaleVelocityPerSeconds;

            internal OrderStatisticsResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrderStatisticsResponse.Total property.
            /// </summary>
            /// <param name="value">total amount sold</param>
            public OrderStatisticsResponseBuilder Total(long? value)
            {
                _Total = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrderStatisticsResponse.Last24h property.
            /// </summary>
            /// <param name="value">total sold in last 24 hours</param>
            public OrderStatisticsResponseBuilder Last24h(long? value)
            {
                _Last24h = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrderStatisticsResponse.SaleVelocityPerSeconds property.
            /// </summary>
            /// <param name="value">decimal average sales per second</param>
            public OrderStatisticsResponseBuilder SaleVelocityPerSeconds(double? value)
            {
                _SaleVelocityPerSeconds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrderStatisticsResponse.
            /// </summary>
            /// <returns>OrderStatisticsResponse</returns>
            public OrderStatisticsResponse Build()
            {
                Validate();
                return new OrderStatisticsResponse(
                    Total: _Total,
                    Last24h: _Last24h,
                    SaleVelocityPerSeconds: _SaleVelocityPerSeconds
                );
            }

            private void Validate()
            { 
                if (_Total == null)
                {
                    throw new ArgumentException("Total is a required property for OrderStatisticsResponse and cannot be null");
                } 
                if (_Last24h == null)
                {
                    throw new ArgumentException("Last24h is a required property for OrderStatisticsResponse and cannot be null");
                } 
                if (_SaleVelocityPerSeconds == null)
                {
                    throw new ArgumentException("SaleVelocityPerSeconds is a required property for OrderStatisticsResponse and cannot be null");
                } 
            }
        }

        
    }
}