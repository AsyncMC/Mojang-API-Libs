using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// PlayerProfile
    /// </summary>
    public sealed class PlayerProfile:  IEquatable<PlayerProfile>
    { 
        /// <summary>
        /// The player UUID without hyphens
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
        /// </summary>
        public bool? Legacy { get; private set; }

        /// <summary>
        /// An array with all player properties, like skin and cape
        /// </summary>
        public List<PlayerProfileProperty> Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PlayerProfile.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PlayerProfile()
        {
        }

        private PlayerProfile(string Id, string Name, bool? Legacy, List<PlayerProfileProperty> Properties)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Legacy = Legacy;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of PlayerProfile.
        /// </summary>
        /// <returns>PlayerProfileBuilder</returns>
        public static PlayerProfileBuilder Builder()
        {
            return new PlayerProfileBuilder();
        }

        /// <summary>
        /// Returns PlayerProfileBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PlayerProfileBuilder</returns>
        public PlayerProfileBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .Legacy(Legacy)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PlayerProfile other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PlayerProfile.
        /// </summary>
        /// <param name="left">Compared (PlayerProfile</param>
        /// <param name="right">Compared (PlayerProfile</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PlayerProfile left, PlayerProfile right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PlayerProfile.
        /// </summary>
        /// <param name="left">Compared (PlayerProfile</param>
        /// <param name="right">Compared (PlayerProfile</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PlayerProfile left, PlayerProfile right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PlayerProfile.
        /// </summary>
        public sealed class PlayerProfileBuilder
        {
            private string _Id;
            private string _Name;
            private bool? _Legacy;
            private List<PlayerProfileProperty> _Properties;

            internal PlayerProfileBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _Legacy = false;
            }

            /// <summary>
            /// Sets value for PlayerProfile.Id property.
            /// </summary>
            /// <param name="value">The player UUID without hyphens</param>
            public PlayerProfileBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfile.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public PlayerProfileBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfile.Legacy property.
            /// </summary>
            /// <param name="value">Will appear in the response if the user has not migrated their minecraft.net account to Mojang.</param>
            public PlayerProfileBuilder Legacy(bool? value)
            {
                _Legacy = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerProfile.Properties property.
            /// </summary>
            /// <param name="value">An array with all player properties, like skin and cape</param>
            public PlayerProfileBuilder Properties(List<PlayerProfileProperty> value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PlayerProfile.
            /// </summary>
            /// <returns>PlayerProfile</returns>
            public PlayerProfile Build()
            {
                Validate();
                return new PlayerProfile(
                    Id: _Id,
                    Name: _Name,
                    Legacy: _Legacy,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for PlayerProfile and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for PlayerProfile and cannot be null");
                } 
                if (_Properties == null)
                {
                    throw new ArgumentException("Properties is a required property for PlayerProfile and cannot be null");
                } 
            }
        }

        
    }
}