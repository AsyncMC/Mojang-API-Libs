using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// A registered name change.
    /// </summary>
    public sealed class NameChange:  IEquatable<NameChange>
    { 
        /// <summary>
        /// The new player name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
        /// </summary>
        public long? ChangedToAt { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use NameChange.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public NameChange()
        {
        }

        private NameChange(string Name, long? ChangedToAt)
        {
            
            this.Name = Name;
            
            this.ChangedToAt = ChangedToAt;
            
        }

        /// <summary>
        /// Returns builder of NameChange.
        /// </summary>
        /// <returns>NameChangeBuilder</returns>
        public static NameChangeBuilder Builder()
        {
            return new NameChangeBuilder();
        }

        /// <summary>
        /// Returns NameChangeBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>NameChangeBuilder</returns>
        public NameChangeBuilder With()
        {
            return Builder()
                .Name(Name)
                .ChangedToAt(ChangedToAt);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(NameChange other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (NameChange.
        /// </summary>
        /// <param name="left">Compared (NameChange</param>
        /// <param name="right">Compared (NameChange</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (NameChange left, NameChange right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (NameChange.
        /// </summary>
        /// <param name="left">Compared (NameChange</param>
        /// <param name="right">Compared (NameChange</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (NameChange left, NameChange right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of NameChange.
        /// </summary>
        public sealed class NameChangeBuilder
        {
            private string _Name;
            private long? _ChangedToAt;

            internal NameChangeBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for NameChange.Name property.
            /// </summary>
            /// <param name="value">The new player name</param>
            public NameChangeBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for NameChange.ChangedToAt property.
            /// </summary>
            /// <param name="value">Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.</param>
            public NameChangeBuilder ChangedToAt(long? value)
            {
                _ChangedToAt = value;
                return this;
            }


            /// <summary>
            /// Builds instance of NameChange.
            /// </summary>
            /// <returns>NameChange</returns>
            public NameChange Build()
            {
                Validate();
                return new NameChange(
                    Name: _Name,
                    ChangedToAt: _ChangedToAt
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for NameChange and cannot be null");
                } 
            }
        }

        
    }
}