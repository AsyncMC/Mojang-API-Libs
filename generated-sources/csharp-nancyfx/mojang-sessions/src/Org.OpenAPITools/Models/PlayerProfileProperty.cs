using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
    /// </summary>
    public sealed class PlayerProfileProperty:  IEquatable<PlayerProfileProperty>
    { 
        /// <summary>
        /// The property name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The serialized property value in base64.
        /// </summary>
        public byte[] Value { get; private set; }

        /// <summary>
        /// signed data using Yggdrasil&#39;s private key
        /// </summary>
        public byte[] Signature { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PlayerProfileProperty.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PlayerProfileProperty()
        {
        }

        private PlayerProfileProperty(string Name, byte[] Value, byte[] Signature)
        {
            
            this.Name = Name;
            
            this.Value = Value;
            
            this.Signature = Signature;
            
        }

        /// <summary>
        /// Returns builder of PlayerProfileProperty.
        /// </summary>
        /// <returns>PlayerProfilePropertyBuilder</returns>
        public static PlayerProfilePropertyBuilder Builder()
        {
            return new PlayerProfilePropertyBuilder();
        }

        /// <summary>
        /// Returns PlayerProfilePropertyBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PlayerProfilePropertyBuilder</returns>
        public PlayerProfilePropertyBuilder With()
        {
            return Builder()
                .Name(Name)
                .Value(Value)
                .Signature(Signature);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PlayerProfileProperty other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PlayerProfileProperty.
        /// </summary>
        /// <param name="left">Compared (PlayerProfileProperty</param>
        /// <param name="right">Compared (PlayerProfileProperty</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PlayerProfileProperty left, PlayerProfileProperty right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PlayerProfileProperty.
        /// </summary>
        /// <param name="left">Compared (PlayerProfileProperty</param>
        /// <param name="right">Compared (PlayerProfileProperty</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PlayerProfileProperty left, PlayerProfileProperty right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PlayerProfileProperty.
        /// </summary>
        public sealed class PlayerProfilePropertyBuilder
        {
            private string _Name;
            private byte[] _Value;
            private byte[] _Signature;

            internal PlayerProfilePropertyBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PlayerProfileProperty.Name property.
            /// </summary>
            /// <param name="value">The property name</param>
            public PlayerProfilePropertyBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfileProperty.Value property.
            /// </summary>
            /// <param name="value">The serialized property value in base64.</param>
            public PlayerProfilePropertyBuilder Value(byte[] value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfileProperty.Signature property.
            /// </summary>
            /// <param name="value">signed data using Yggdrasil&#39;s private key</param>
            public PlayerProfilePropertyBuilder Signature(byte[] value)
            {
                _Signature = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PlayerProfileProperty.
            /// </summary>
            /// <returns>PlayerProfileProperty</returns>
            public PlayerProfileProperty Build()
            {
                Validate();
                return new PlayerProfileProperty(
                    Name: _Name,
                    Value: _Value,
                    Signature: _Signature
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for PlayerProfileProperty and cannot be null");
                } 
                if (_Value == null)
                {
                    throw new ArgumentException("Value is a required property for PlayerProfileProperty and cannot be null");
                } 
            }
        }

        
    }
}