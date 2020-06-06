using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// UsernamePassword
    /// </summary>
    public class UsernamePassword:  IEquatable<UsernamePassword>
    { 
        /// <summary>
        /// The Mojang account e-mail or username. Never store it.
        /// </summary>
        public string Username { get; private set; }

        /// <summary>
        /// The Mojang account password, never store it.
        /// </summary>
        public string Password { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UsernamePassword.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UsernamePassword()
        {
        }

        protected UsernamePassword(string Username, string Password)
        {
            
            this.Username = Username;
            
            this.Password = Password;
            
        }

        /// <summary>
        /// Returns builder of UsernamePassword.
        /// </summary>
        /// <returns>UsernamePasswordBuilder</returns>
        public static UsernamePasswordBuilder Builder()
        {
            return new UsernamePasswordBuilder();
        }

        /// <summary>
        /// Returns UsernamePasswordBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UsernamePasswordBuilder</returns>
        public UsernamePasswordBuilder With()
        {
            return Builder()
                .Username(Username)
                .Password(Password);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UsernamePassword other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UsernamePassword.
        /// </summary>
        /// <param name="left">Compared (UsernamePassword</param>
        /// <param name="right">Compared (UsernamePassword</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UsernamePassword left, UsernamePassword right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UsernamePassword.
        /// </summary>
        /// <param name="left">Compared (UsernamePassword</param>
        /// <param name="right">Compared (UsernamePassword</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UsernamePassword left, UsernamePassword right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UsernamePassword.
        /// </summary>
        public sealed class UsernamePasswordBuilder
        {
            private string _Username;
            private string _Password;

            internal UsernamePasswordBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UsernamePassword.Username property.
            /// </summary>
            /// <param name="value">The Mojang account e-mail or username. Never store it.</param>
            public UsernamePasswordBuilder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for UsernamePassword.Password property.
            /// </summary>
            /// <param name="value">The Mojang account password, never store it.</param>
            public UsernamePasswordBuilder Password(string value)
            {
                _Password = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UsernamePassword.
            /// </summary>
            /// <returns>UsernamePassword</returns>
            public UsernamePassword Build()
            {
                Validate();
                return new UsernamePassword(
                    Username: _Username,
                    Password: _Password
                );
            }

            private void Validate()
            { 
                if (_Username == null)
                {
                    throw new ArgumentException("Username is a required property for UsernamePassword and cannot be null");
                } 
                if (_Password == null)
                {
                    throw new ArgumentException("Password is a required property for UsernamePassword and cannot be null");
                } 
            }
        }

        
    }
}