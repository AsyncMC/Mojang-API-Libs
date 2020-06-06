using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// This is obtained by decoding the \&quot;textures\&quot; property
    /// </summary>
    public sealed class PlayerProfileTexturePropertyValue:  IEquatable<PlayerProfileTexturePropertyValue>
    { 
        /// <summary>
        /// UNIX timestamp in milliseconds
        /// </summary>
        public long? Timestamp { get; private set; }

        /// <summary>
        /// The player UUID without hyphens
        /// </summary>
        public string ProfileId { get; private set; }

        /// <summary>
        /// The player&#39;s name
        /// </summary>
        public string ProfileName { get; private set; }

        /// <summary>
        /// Only present if unsigned was set to false in the request
        /// </summary>
        public bool? SignatureRequired { get; private set; }

        /// <summary>
        /// Textures
        /// </summary>
        public PlayerTexture Textures { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PlayerProfileTexturePropertyValue.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PlayerProfileTexturePropertyValue()
        {
        }

        private PlayerProfileTexturePropertyValue(long? Timestamp, string ProfileId, string ProfileName, bool? SignatureRequired, PlayerTexture Textures)
        {
            
            this.Timestamp = Timestamp;
            
            this.ProfileId = ProfileId;
            
            this.ProfileName = ProfileName;
            
            this.SignatureRequired = SignatureRequired;
            
            this.Textures = Textures;
            
        }

        /// <summary>
        /// Returns builder of PlayerProfileTexturePropertyValue.
        /// </summary>
        /// <returns>PlayerProfileTexturePropertyValueBuilder</returns>
        public static PlayerProfileTexturePropertyValueBuilder Builder()
        {
            return new PlayerProfileTexturePropertyValueBuilder();
        }

        /// <summary>
        /// Returns PlayerProfileTexturePropertyValueBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PlayerProfileTexturePropertyValueBuilder</returns>
        public PlayerProfileTexturePropertyValueBuilder With()
        {
            return Builder()
                .Timestamp(Timestamp)
                .ProfileId(ProfileId)
                .ProfileName(ProfileName)
                .SignatureRequired(SignatureRequired)
                .Textures(Textures);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PlayerProfileTexturePropertyValue other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PlayerProfileTexturePropertyValue.
        /// </summary>
        /// <param name="left">Compared (PlayerProfileTexturePropertyValue</param>
        /// <param name="right">Compared (PlayerProfileTexturePropertyValue</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PlayerProfileTexturePropertyValue left, PlayerProfileTexturePropertyValue right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PlayerProfileTexturePropertyValue.
        /// </summary>
        /// <param name="left">Compared (PlayerProfileTexturePropertyValue</param>
        /// <param name="right">Compared (PlayerProfileTexturePropertyValue</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PlayerProfileTexturePropertyValue left, PlayerProfileTexturePropertyValue right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PlayerProfileTexturePropertyValue.
        /// </summary>
        public sealed class PlayerProfileTexturePropertyValueBuilder
        {
            private long? _Timestamp;
            private string _ProfileId;
            private string _ProfileName;
            private bool? _SignatureRequired;
            private PlayerTexture _Textures;

            internal PlayerProfileTexturePropertyValueBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _SignatureRequired = false;
            }

            /// <summary>
            /// Sets value for PlayerProfileTexturePropertyValue.Timestamp property.
            /// </summary>
            /// <param name="value">UNIX timestamp in milliseconds</param>
            public PlayerProfileTexturePropertyValueBuilder Timestamp(long? value)
            {
                _Timestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfileTexturePropertyValue.ProfileId property.
            /// </summary>
            /// <param name="value">The player UUID without hyphens</param>
            public PlayerProfileTexturePropertyValueBuilder ProfileId(string value)
            {
                _ProfileId = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfileTexturePropertyValue.ProfileName property.
            /// </summary>
            /// <param name="value">The player&#39;s name</param>
            public PlayerProfileTexturePropertyValueBuilder ProfileName(string value)
            {
                _ProfileName = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfileTexturePropertyValue.SignatureRequired property.
            /// </summary>
            /// <param name="value">Only present if unsigned was set to false in the request</param>
            public PlayerProfileTexturePropertyValueBuilder SignatureRequired(bool? value)
            {
                _SignatureRequired = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfileTexturePropertyValue.Textures property.
            /// </summary>
            /// <param name="value">Textures</param>
            public PlayerProfileTexturePropertyValueBuilder Textures(PlayerTexture value)
            {
                _Textures = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PlayerProfileTexturePropertyValue.
            /// </summary>
            /// <returns>PlayerProfileTexturePropertyValue</returns>
            public PlayerProfileTexturePropertyValue Build()
            {
                Validate();
                return new PlayerProfileTexturePropertyValue(
                    Timestamp: _Timestamp,
                    ProfileId: _ProfileId,
                    ProfileName: _ProfileName,
                    SignatureRequired: _SignatureRequired,
                    Textures: _Textures
                );
            }

            private void Validate()
            { 
                if (_Timestamp == null)
                {
                    throw new ArgumentException("Timestamp is a required property for PlayerProfileTexturePropertyValue and cannot be null");
                } 
                if (_ProfileId == null)
                {
                    throw new ArgumentException("ProfileId is a required property for PlayerProfileTexturePropertyValue and cannot be null");
                } 
                if (_ProfileName == null)
                {
                    throw new ArgumentException("ProfileName is a required property for PlayerProfileTexturePropertyValue and cannot be null");
                } 
            }
        }

        
    }
}