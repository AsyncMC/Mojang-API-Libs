using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// A security question requested by Mojang
    /// </summary>
    public sealed class SecurityQuestion:  IEquatable<SecurityQuestion>
    { 
        /// <summary>
        /// The possible IDs are these:   1  What is your favorite pet&#39;s name?   2  What is your favorite movie?   3  What is your favorite author&#39;s last name?   4  What is your favorite artist&#39;s last name?   5  What is your favorite actor&#39;s last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend&#39;s first name?   12 What is your favorite cousin&#39;s name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother&#39;s middle name?   16 What is your father&#39;s middle name?   17 What is your oldest sibling&#39;s middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother&#39;s first name?   32 What is your grandfather&#39;s first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// The question itself
        /// </summary>
        public string Question { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SecurityQuestion.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SecurityQuestion()
        {
        }

        private SecurityQuestion(int? Id, string Question)
        {
            
            this.Id = Id;
            
            this.Question = Question;
            
        }

        /// <summary>
        /// Returns builder of SecurityQuestion.
        /// </summary>
        /// <returns>SecurityQuestionBuilder</returns>
        public static SecurityQuestionBuilder Builder()
        {
            return new SecurityQuestionBuilder();
        }

        /// <summary>
        /// Returns SecurityQuestionBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SecurityQuestionBuilder</returns>
        public SecurityQuestionBuilder With()
        {
            return Builder()
                .Id(Id)
                .Question(Question);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SecurityQuestion other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SecurityQuestion.
        /// </summary>
        /// <param name="left">Compared (SecurityQuestion</param>
        /// <param name="right">Compared (SecurityQuestion</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SecurityQuestion left, SecurityQuestion right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SecurityQuestion.
        /// </summary>
        /// <param name="left">Compared (SecurityQuestion</param>
        /// <param name="right">Compared (SecurityQuestion</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SecurityQuestion left, SecurityQuestion right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SecurityQuestion.
        /// </summary>
        public sealed class SecurityQuestionBuilder
        {
            private int? _Id;
            private string _Question;

            internal SecurityQuestionBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SecurityQuestion.Id property.
            /// </summary>
            /// <param name="value">The possible IDs are these:   1  What is your favorite pet&#39;s name?   2  What is your favorite movie?   3  What is your favorite author&#39;s last name?   4  What is your favorite artist&#39;s last name?   5  What is your favorite actor&#39;s last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend&#39;s first name?   12 What is your favorite cousin&#39;s name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother&#39;s middle name?   16 What is your father&#39;s middle name?   17 What is your oldest sibling&#39;s middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother&#39;s first name?   32 What is your grandfather&#39;s first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?</param>
            public SecurityQuestionBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for SecurityQuestion.Question property.
            /// </summary>
            /// <param name="value">The question itself</param>
            public SecurityQuestionBuilder Question(string value)
            {
                _Question = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SecurityQuestion.
            /// </summary>
            /// <returns>SecurityQuestion</returns>
            public SecurityQuestion Build()
            {
                Validate();
                return new SecurityQuestion(
                    Id: _Id,
                    Question: _Question
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for SecurityQuestion and cannot be null");
                } 
                if (_Question == null)
                {
                    throw new ArgumentException("Question is a required property for SecurityQuestion and cannot be null");
                } 
            }
        }

        
    }
}