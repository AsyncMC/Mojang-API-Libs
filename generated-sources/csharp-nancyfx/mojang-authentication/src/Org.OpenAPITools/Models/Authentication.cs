using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Authentication
    /// </summary>
    public sealed class Authentication: AccessKeys,  IEquatable<Authentication>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Authentication.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Authentication() : base()
        {
        }

        private Authentication() : base()
        {
            
        }

        /// <summary>
        /// Returns builder of Authentication.
        /// </summary>
        /// <returns>AuthenticationBuilder</returns>
        public static new AuthenticationBuilder Builder()
        {
            return new AuthenticationBuilder();
        }

        /// <summary>
        /// Returns AuthenticationBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AuthenticationBuilder</returns>
        public new AuthenticationBuilder With()
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

        public bool Equals(Authentication other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Authentication.
        /// </summary>
        /// <param name="left">Compared (Authentication</param>
        /// <param name="right">Compared (Authentication</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Authentication left, Authentication right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Authentication.
        /// </summary>
        /// <param name="left">Compared (Authentication</param>
        /// <param name="right">Compared (Authentication</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Authentication left, Authentication right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Authentication.
        /// </summary>
        public sealed class AuthenticationBuilder
        {

            internal AuthenticationBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of Authentication.
            /// </summary>
            /// <returns>Authentication</returns>
            public Authentication Build()
            {
                Validate();
                return new Authentication(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}