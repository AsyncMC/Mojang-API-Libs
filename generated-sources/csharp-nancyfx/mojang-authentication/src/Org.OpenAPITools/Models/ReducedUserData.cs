using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ReducedUserData
    /// </summary>
    public class ReducedUserData:  IEquatable<ReducedUserData>
    { 
        /// <summary>
        /// Id
        /// </summary>
        public System.IO.Stream Id { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public List<GameProfileProperty> Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ReducedUserData.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ReducedUserData()
        {
        }

        protected ReducedUserData(System.IO.Stream Id, List<GameProfileProperty> Properties)
        {
            
            this.Id = Id;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ReducedUserData.
        /// </summary>
        /// <returns>ReducedUserDataBuilder</returns>
        public static ReducedUserDataBuilder Builder()
        {
            return new ReducedUserDataBuilder();
        }

        /// <summary>
        /// Returns ReducedUserDataBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ReducedUserDataBuilder</returns>
        public ReducedUserDataBuilder With()
        {
            return Builder()
                .Id(Id)
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

        public bool Equals(ReducedUserData other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ReducedUserData.
        /// </summary>
        /// <param name="left">Compared (ReducedUserData</param>
        /// <param name="right">Compared (ReducedUserData</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ReducedUserData left, ReducedUserData right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ReducedUserData.
        /// </summary>
        /// <param name="left">Compared (ReducedUserData</param>
        /// <param name="right">Compared (ReducedUserData</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ReducedUserData left, ReducedUserData right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ReducedUserData.
        /// </summary>
        public sealed class ReducedUserDataBuilder
        {
            private System.IO.Stream _Id;
            private List<GameProfileProperty> _Properties;

            internal ReducedUserDataBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ReducedUserData.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public ReducedUserDataBuilder Id(System.IO.Stream value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for ReducedUserData.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ReducedUserDataBuilder Properties(List<GameProfileProperty> value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ReducedUserData.
            /// </summary>
            /// <returns>ReducedUserData</returns>
            public ReducedUserData Build()
            {
                Validate();
                return new ReducedUserData(
                    Id: _Id,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}