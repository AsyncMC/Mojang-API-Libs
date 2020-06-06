using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
    /// </summary>
    public sealed class AuthenticationRequest: UsernamePassword,  IEquatable<AuthenticationRequest>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AuthenticationRequest.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AuthenticationRequest() : base()
        {
        }

        private AuthenticationRequest() : base()
        {
            
        }

        /// <summary>
        /// Returns builder of AuthenticationRequest.
        /// </summary>
        /// <returns>AuthenticationRequestBuilder</returns>
        public static new AuthenticationRequestBuilder Builder()
        {
            return new AuthenticationRequestBuilder();
        }

        /// <summary>
        /// Returns AuthenticationRequestBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AuthenticationRequestBuilder</returns>
        public new AuthenticationRequestBuilder With()
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

        public bool Equals(AuthenticationRequest other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AuthenticationRequest.
        /// </summary>
        /// <param name="left">Compared (AuthenticationRequest</param>
        /// <param name="right">Compared (AuthenticationRequest</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AuthenticationRequest left, AuthenticationRequest right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AuthenticationRequest.
        /// </summary>
        /// <param name="left">Compared (AuthenticationRequest</param>
        /// <param name="right">Compared (AuthenticationRequest</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AuthenticationRequest left, AuthenticationRequest right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AuthenticationRequest.
        /// </summary>
        public sealed class AuthenticationRequestBuilder
        {

            internal AuthenticationRequestBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of AuthenticationRequest.
            /// </summary>
            /// <returns>AuthenticationRequest</returns>
            public AuthenticationRequest Build()
            {
                Validate();
                return new AuthenticationRequest(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}