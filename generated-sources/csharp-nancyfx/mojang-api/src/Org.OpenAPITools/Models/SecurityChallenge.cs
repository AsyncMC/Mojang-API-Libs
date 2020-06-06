using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Binds a question to an answer id, the answer must respect the answer id.
    /// </summary>
    public sealed class SecurityChallenge:  IEquatable<SecurityChallenge>
    { 
        /// <summary>
        /// Question
        /// </summary>
        public SecurityQuestion Question { get; private set; }

        /// <summary>
        /// Answer
        /// </summary>
        public SecurityAnswerId Answer { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SecurityChallenge.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SecurityChallenge()
        {
        }

        private SecurityChallenge(SecurityQuestion Question, SecurityAnswerId Answer)
        {
            
            this.Question = Question;
            
            this.Answer = Answer;
            
        }

        /// <summary>
        /// Returns builder of SecurityChallenge.
        /// </summary>
        /// <returns>SecurityChallengeBuilder</returns>
        public static SecurityChallengeBuilder Builder()
        {
            return new SecurityChallengeBuilder();
        }

        /// <summary>
        /// Returns SecurityChallengeBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SecurityChallengeBuilder</returns>
        public SecurityChallengeBuilder With()
        {
            return Builder()
                .Question(Question)
                .Answer(Answer);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SecurityChallenge other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SecurityChallenge.
        /// </summary>
        /// <param name="left">Compared (SecurityChallenge</param>
        /// <param name="right">Compared (SecurityChallenge</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SecurityChallenge left, SecurityChallenge right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SecurityChallenge.
        /// </summary>
        /// <param name="left">Compared (SecurityChallenge</param>
        /// <param name="right">Compared (SecurityChallenge</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SecurityChallenge left, SecurityChallenge right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SecurityChallenge.
        /// </summary>
        public sealed class SecurityChallengeBuilder
        {
            private SecurityQuestion _Question;
            private SecurityAnswerId _Answer;

            internal SecurityChallengeBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SecurityChallenge.Question property.
            /// </summary>
            /// <param name="value">Question</param>
            public SecurityChallengeBuilder Question(SecurityQuestion value)
            {
                _Question = value;
                return this;
            }

            /// <summary>
            /// Sets value for SecurityChallenge.Answer property.
            /// </summary>
            /// <param name="value">Answer</param>
            public SecurityChallengeBuilder Answer(SecurityAnswerId value)
            {
                _Answer = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SecurityChallenge.
            /// </summary>
            /// <returns>SecurityChallenge</returns>
            public SecurityChallenge Build()
            {
                Validate();
                return new SecurityChallenge(
                    Question: _Question,
                    Answer: _Answer
                );
            }

            private void Validate()
            { 
                if (_Question == null)
                {
                    throw new ArgumentException("Question is a required property for SecurityChallenge and cannot be null");
                } 
                if (_Answer == null)
                {
                    throw new ArgumentException("Answer is a required property for SecurityChallenge and cannot be null");
                } 
            }
        }

        
    }
}