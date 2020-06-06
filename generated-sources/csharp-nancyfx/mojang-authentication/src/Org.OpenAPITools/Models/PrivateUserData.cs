using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// PrivateUserData
    /// </summary>
    public sealed class PrivateUserData: ReducedUserData,  IEquatable<PrivateUserData>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PrivateUserData.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PrivateUserData() : base()
        {
        }

        private PrivateUserData() : base()
        {
            
        }

        /// <summary>
        /// Returns builder of PrivateUserData.
        /// </summary>
        /// <returns>PrivateUserDataBuilder</returns>
        public static new PrivateUserDataBuilder Builder()
        {
            return new PrivateUserDataBuilder();
        }

        /// <summary>
        /// Returns PrivateUserDataBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PrivateUserDataBuilder</returns>
        public new PrivateUserDataBuilder With()
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

        public bool Equals(PrivateUserData other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PrivateUserData.
        /// </summary>
        /// <param name="left">Compared (PrivateUserData</param>
        /// <param name="right">Compared (PrivateUserData</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PrivateUserData left, PrivateUserData right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PrivateUserData.
        /// </summary>
        /// <param name="left">Compared (PrivateUserData</param>
        /// <param name="right">Compared (PrivateUserData</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PrivateUserData left, PrivateUserData right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PrivateUserData.
        /// </summary>
        public sealed class PrivateUserDataBuilder
        {

            internal PrivateUserDataBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of PrivateUserData.
            /// </summary>
            /// <returns>PrivateUserData</returns>
            public PrivateUserData Build()
            {
                Validate();
                return new PrivateUserData(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}