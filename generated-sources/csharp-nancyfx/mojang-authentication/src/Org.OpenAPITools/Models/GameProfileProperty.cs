using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// GameProfileProperty
    /// </summary>
    public sealed class GameProfileProperty:  IEquatable<GameProfileProperty>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Value
        /// </summary>
        public string Value { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use GameProfileProperty.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public GameProfileProperty()
        {
        }

        private GameProfileProperty(string Name, string Value)
        {
            
            this.Name = Name;
            
            this.Value = Value;
            
        }

        /// <summary>
        /// Returns builder of GameProfileProperty.
        /// </summary>
        /// <returns>GameProfilePropertyBuilder</returns>
        public static GameProfilePropertyBuilder Builder()
        {
            return new GameProfilePropertyBuilder();
        }

        /// <summary>
        /// Returns GameProfilePropertyBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>GameProfilePropertyBuilder</returns>
        public GameProfilePropertyBuilder With()
        {
            return Builder()
                .Name(Name)
                .Value(Value);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(GameProfileProperty other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (GameProfileProperty.
        /// </summary>
        /// <param name="left">Compared (GameProfileProperty</param>
        /// <param name="right">Compared (GameProfileProperty</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (GameProfileProperty left, GameProfileProperty right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (GameProfileProperty.
        /// </summary>
        /// <param name="left">Compared (GameProfileProperty</param>
        /// <param name="right">Compared (GameProfileProperty</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (GameProfileProperty left, GameProfileProperty right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of GameProfileProperty.
        /// </summary>
        public sealed class GameProfilePropertyBuilder
        {
            private string _Name;
            private string _Value;

            internal GameProfilePropertyBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for GameProfileProperty.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public GameProfilePropertyBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfileProperty.Value property.
            /// </summary>
            /// <param name="value">Value</param>
            public GameProfilePropertyBuilder Value(string value)
            {
                _Value = value;
                return this;
            }


            /// <summary>
            /// Builds instance of GameProfileProperty.
            /// </summary>
            /// <returns>GameProfileProperty</returns>
            public GameProfileProperty Build()
            {
                Validate();
                return new GameProfileProperty(
                    Name: _Name,
                    Value: _Value
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}