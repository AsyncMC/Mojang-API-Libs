using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// RefreshResponse
    /// </summary>
    public sealed class RefreshResponse: RefreshRequest,  IEquatable<RefreshResponse>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RefreshResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RefreshResponse() : base()
        {
        }

        private RefreshResponse() : base()
        {
            
        }

        /// <summary>
        /// Returns builder of RefreshResponse.
        /// </summary>
        /// <returns>RefreshResponseBuilder</returns>
        public static new RefreshResponseBuilder Builder()
        {
            return new RefreshResponseBuilder();
        }

        /// <summary>
        /// Returns RefreshResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RefreshResponseBuilder</returns>
        public new RefreshResponseBuilder With()
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

        public bool Equals(RefreshResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RefreshResponse.
        /// </summary>
        /// <param name="left">Compared (RefreshResponse</param>
        /// <param name="right">Compared (RefreshResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RefreshResponse left, RefreshResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RefreshResponse.
        /// </summary>
        /// <param name="left">Compared (RefreshResponse</param>
        /// <param name="right">Compared (RefreshResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RefreshResponse left, RefreshResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RefreshResponse.
        /// </summary>
        public sealed class RefreshResponseBuilder
        {

            internal RefreshResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of RefreshResponse.
            /// </summary>
            /// <returns>RefreshResponse</returns>
            public RefreshResponse Build()
            {
                Validate();
                return new RefreshResponse(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}