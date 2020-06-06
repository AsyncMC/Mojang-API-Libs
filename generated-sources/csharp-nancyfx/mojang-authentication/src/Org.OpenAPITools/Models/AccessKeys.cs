using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// AccessKeys
    /// </summary>
    public class AccessKeys:  IEquatable<AccessKeys>
    { 
        /// <summary>
        /// AccessToken
        /// </summary>
        public string AccessToken { get; private set; }

        /// <summary>
        /// ClientToken
        /// </summary>
        public string ClientToken { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AccessKeys.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AccessKeys()
        {
        }

        protected AccessKeys(string AccessToken, string ClientToken)
        {
            
            this.AccessToken = AccessToken;
            
            this.ClientToken = ClientToken;
            
        }

        /// <summary>
        /// Returns builder of AccessKeys.
        /// </summary>
        /// <returns>AccessKeysBuilder</returns>
        public static AccessKeysBuilder Builder()
        {
            return new AccessKeysBuilder();
        }

        /// <summary>
        /// Returns AccessKeysBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AccessKeysBuilder</returns>
        public AccessKeysBuilder With()
        {
            return Builder()
                .AccessToken(AccessToken)
                .ClientToken(ClientToken);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AccessKeys other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AccessKeys.
        /// </summary>
        /// <param name="left">Compared (AccessKeys</param>
        /// <param name="right">Compared (AccessKeys</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AccessKeys left, AccessKeys right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AccessKeys.
        /// </summary>
        /// <param name="left">Compared (AccessKeys</param>
        /// <param name="right">Compared (AccessKeys</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AccessKeys left, AccessKeys right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AccessKeys.
        /// </summary>
        public sealed class AccessKeysBuilder
        {
            private string _AccessToken;
            private string _ClientToken;

            internal AccessKeysBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AccessKeys.AccessToken property.
            /// </summary>
            /// <param name="value">AccessToken</param>
            public AccessKeysBuilder AccessToken(string value)
            {
                _AccessToken = value;
                return this;
            }

            /// <summary>
            /// Sets value for AccessKeys.ClientToken property.
            /// </summary>
            /// <param name="value">ClientToken</param>
            public AccessKeysBuilder ClientToken(string value)
            {
                _ClientToken = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AccessKeys.
            /// </summary>
            /// <returns>AccessKeys</returns>
            public AccessKeys Build()
            {
                Validate();
                return new AccessKeys(
                    AccessToken: _AccessToken,
                    ClientToken: _ClientToken
                );
            }

            private void Validate()
            { 
                if (_AccessToken == null)
                {
                    throw new ArgumentException("AccessToken is a required property for AccessKeys and cannot be null");
                } 
            }
        }

        
    }
}