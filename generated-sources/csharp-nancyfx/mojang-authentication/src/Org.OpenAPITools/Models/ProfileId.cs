using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ProfileId
    /// </summary>
    public sealed class ProfileId:  IEquatable<ProfileId>
    { 
        /// <summary>
        /// Id
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// The player name
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ProfileId.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ProfileId()
        {
        }

        private ProfileId(string Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of ProfileId.
        /// </summary>
        /// <returns>ProfileIdBuilder</returns>
        public static ProfileIdBuilder Builder()
        {
            return new ProfileIdBuilder();
        }

        /// <summary>
        /// Returns ProfileIdBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProfileIdBuilder</returns>
        public ProfileIdBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ProfileId other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ProfileId.
        /// </summary>
        /// <param name="left">Compared (ProfileId</param>
        /// <param name="right">Compared (ProfileId</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ProfileId left, ProfileId right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ProfileId.
        /// </summary>
        /// <param name="left">Compared (ProfileId</param>
        /// <param name="right">Compared (ProfileId</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ProfileId left, ProfileId right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ProfileId.
        /// </summary>
        public sealed class ProfileIdBuilder
        {
            private string _Id;
            private string _Name;

            internal ProfileIdBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ProfileId.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public ProfileIdBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProfileId.Name property.
            /// </summary>
            /// <param name="value">The player name</param>
            public ProfileIdBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ProfileId.
            /// </summary>
            /// <returns>ProfileId</returns>
            public ProfileId Build()
            {
                Validate();
                return new ProfileId(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for ProfileId and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for ProfileId and cannot be null");
                } 
            }
        }

        
    }
}