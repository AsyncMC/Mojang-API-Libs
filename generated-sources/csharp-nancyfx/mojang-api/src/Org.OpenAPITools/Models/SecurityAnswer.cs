using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// A security question answer given by the player using the id given by Mojang
    /// </summary>
    public sealed class SecurityAnswer: SecurityAnswerId,  IEquatable<SecurityAnswer>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SecurityAnswer.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SecurityAnswer() : base()
        {
        }

        private SecurityAnswer() : base()
        {
            
        }

        /// <summary>
        /// Returns builder of SecurityAnswer.
        /// </summary>
        /// <returns>SecurityAnswerBuilder</returns>
        public static new SecurityAnswerBuilder Builder()
        {
            return new SecurityAnswerBuilder();
        }

        /// <summary>
        /// Returns SecurityAnswerBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SecurityAnswerBuilder</returns>
        public new SecurityAnswerBuilder With()
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

        public bool Equals(SecurityAnswer other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SecurityAnswer.
        /// </summary>
        /// <param name="left">Compared (SecurityAnswer</param>
        /// <param name="right">Compared (SecurityAnswer</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SecurityAnswer left, SecurityAnswer right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SecurityAnswer.
        /// </summary>
        /// <param name="left">Compared (SecurityAnswer</param>
        /// <param name="right">Compared (SecurityAnswer</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SecurityAnswer left, SecurityAnswer right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SecurityAnswer.
        /// </summary>
        public sealed class SecurityAnswerBuilder
        {

            internal SecurityAnswerBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of SecurityAnswer.
            /// </summary>
            /// <returns>SecurityAnswer</returns>
            public SecurityAnswer Build()
            {
                Validate();
                return new SecurityAnswer(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}