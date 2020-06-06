using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// A security question answer id given by Mojang
    /// </summary>
    public class SecurityAnswerId:  IEquatable<SecurityAnswerId>
    { 
        /// <summary>
        /// A number giver by Mojang to reply a question
        /// </summary>
        public int? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SecurityAnswerId.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SecurityAnswerId()
        {
        }

        protected SecurityAnswerId(int? Id)
        {
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of SecurityAnswerId.
        /// </summary>
        /// <returns>SecurityAnswerIdBuilder</returns>
        public static SecurityAnswerIdBuilder Builder()
        {
            return new SecurityAnswerIdBuilder();
        }

        /// <summary>
        /// Returns SecurityAnswerIdBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SecurityAnswerIdBuilder</returns>
        public SecurityAnswerIdBuilder With()
        {
            return Builder()
                .Id(Id);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SecurityAnswerId other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SecurityAnswerId.
        /// </summary>
        /// <param name="left">Compared (SecurityAnswerId</param>
        /// <param name="right">Compared (SecurityAnswerId</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SecurityAnswerId left, SecurityAnswerId right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SecurityAnswerId.
        /// </summary>
        /// <param name="left">Compared (SecurityAnswerId</param>
        /// <param name="right">Compared (SecurityAnswerId</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SecurityAnswerId left, SecurityAnswerId right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SecurityAnswerId.
        /// </summary>
        public sealed class SecurityAnswerIdBuilder
        {
            private int? _Id;

            internal SecurityAnswerIdBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SecurityAnswerId.Id property.
            /// </summary>
            /// <param name="value">A number giver by Mojang to reply a question</param>
            public SecurityAnswerIdBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SecurityAnswerId.
            /// </summary>
            /// <returns>SecurityAnswerId</returns>
            public SecurityAnswerId Build()
            {
                Validate();
                return new SecurityAnswerId(
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for SecurityAnswerId and cannot be null");
                } 
            }
        }

        
    }
}