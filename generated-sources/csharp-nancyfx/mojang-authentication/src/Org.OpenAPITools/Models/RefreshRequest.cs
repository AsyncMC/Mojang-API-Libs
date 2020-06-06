using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// RefreshRequest
    /// </summary>
    public class RefreshRequest: AccessKeys,  IEquatable<RefreshRequest>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RefreshRequest.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RefreshRequest() : base()
        {
        }

        protected RefreshRequest() : base()
        {
            
        }

        /// <summary>
        /// Returns builder of RefreshRequest.
        /// </summary>
        /// <returns>RefreshRequestBuilder</returns>
        public static new RefreshRequestBuilder Builder()
        {
            return new RefreshRequestBuilder();
        }

        /// <summary>
        /// Returns RefreshRequestBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RefreshRequestBuilder</returns>
        public new RefreshRequestBuilder With()
        {
            return Builder()
;
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RefreshRequest other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RefreshRequest.
        /// </summary>
        /// <param name="left">Compared (RefreshRequest</param>
        /// <param name="right">Compared (RefreshRequest</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RefreshRequest left, RefreshRequest right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RefreshRequest.
        /// </summary>
        /// <param name="left">Compared (RefreshRequest</param>
        /// <param name="right">Compared (RefreshRequest</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RefreshRequest left, RefreshRequest right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RefreshRequest.
        /// </summary>
        public sealed class RefreshRequestBuilder
        {

            internal RefreshRequestBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of RefreshRequest.
            /// </summary>
            /// <returns>RefreshRequest</returns>
            public RefreshRequest Build()
            {
                Validate();
                return new RefreshRequest(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}