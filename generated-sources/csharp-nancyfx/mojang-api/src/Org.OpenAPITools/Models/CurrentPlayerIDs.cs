using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// The current player, demo and legacy status of a player identified by the id
    /// </summary>
    public sealed class CurrentPlayerIDs:  IEquatable<CurrentPlayerIDs>
    { 
        /// <summary>
        /// The player UUID without hyphens
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// The current name being used by this player
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// If account has not been converted
        /// </summary>
        public bool? Legacy { get; private set; }

        /// <summary>
        /// If the player has not puchased the game
        /// </summary>
        public bool? Demo { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CurrentPlayerIDs.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CurrentPlayerIDs()
        {
        }

        private CurrentPlayerIDs(string Id, string Name, bool? Legacy, bool? Demo)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Legacy = Legacy;
            
            this.Demo = Demo;
            
        }

        /// <summary>
        /// Returns builder of CurrentPlayerIDs.
        /// </summary>
        /// <returns>CurrentPlayerIDsBuilder</returns>
        public static CurrentPlayerIDsBuilder Builder()
        {
            return new CurrentPlayerIDsBuilder();
        }

        /// <summary>
        /// Returns CurrentPlayerIDsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CurrentPlayerIDsBuilder</returns>
        public CurrentPlayerIDsBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .Legacy(Legacy)
                .Demo(Demo);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(CurrentPlayerIDs other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CurrentPlayerIDs.
        /// </summary>
        /// <param name="left">Compared (CurrentPlayerIDs</param>
        /// <param name="right">Compared (CurrentPlayerIDs</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CurrentPlayerIDs left, CurrentPlayerIDs right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CurrentPlayerIDs.
        /// </summary>
        /// <param name="left">Compared (CurrentPlayerIDs</param>
        /// <param name="right">Compared (CurrentPlayerIDs</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CurrentPlayerIDs left, CurrentPlayerIDs right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CurrentPlayerIDs.
        /// </summary>
        public sealed class CurrentPlayerIDsBuilder
        {
            private string _Id;
            private string _Name;
            private bool? _Legacy;
            private bool? _Demo;

            internal CurrentPlayerIDsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _Legacy = false;
                _Demo = false;
            }

            /// <summary>
            /// Sets value for CurrentPlayerIDs.Id property.
            /// </summary>
            /// <param name="value">The player UUID without hyphens</param>
            public CurrentPlayerIDsBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for CurrentPlayerIDs.Name property.
            /// </summary>
            /// <param name="value">The current name being used by this player</param>
            public CurrentPlayerIDsBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for CurrentPlayerIDs.Legacy property.
            /// </summary>
            /// <param name="value">If account has not been converted</param>
            public CurrentPlayerIDsBuilder Legacy(bool? value)
            {
                _Legacy = value;
                return this;
            }

            /// <summary>
            /// Sets value for CurrentPlayerIDs.Demo property.
            /// </summary>
            /// <param name="value">If the player has not puchased the game</param>
            public CurrentPlayerIDsBuilder Demo(bool? value)
            {
                _Demo = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CurrentPlayerIDs.
            /// </summary>
            /// <returns>CurrentPlayerIDs</returns>
            public CurrentPlayerIDs Build()
            {
                Validate();
                return new CurrentPlayerIDs(
                    Id: _Id,
                    Name: _Name,
                    Legacy: _Legacy,
                    Demo: _Demo
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for CurrentPlayerIDs and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for CurrentPlayerIDs and cannot be null");
                } 
            }
        }

        
    }
}