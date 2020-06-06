using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// This is returned when the request fails
    /// </summary>
    public sealed class Error:  IEquatable<Error>
    { 
        /// <summary>
        /// _Error
        /// </summary>
        public string _Error { get; private set; }

        /// <summary>
        /// ErrorMessage
        /// </summary>
        public string ErrorMessage { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Error.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Error()
        {
        }

        private Error(string _Error, string ErrorMessage)
        {
            
            this._Error = _Error;
            
            this.ErrorMessage = ErrorMessage;
            
        }

        /// <summary>
        /// Returns builder of Error.
        /// </summary>
        /// <returns>ErrorBuilder</returns>
        public static ErrorBuilder Builder()
        {
            return new ErrorBuilder();
        }

        /// <summary>
        /// Returns ErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ErrorBuilder</returns>
        public ErrorBuilder With()
        {
            return Builder()
                ._Error(_Error)
                .ErrorMessage(ErrorMessage);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Error other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Error.
        /// </summary>
        /// <param name="left">Compared (Error</param>
        /// <param name="right">Compared (Error</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Error left, Error right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Error.
        /// </summary>
        /// <param name="left">Compared (Error</param>
        /// <param name="right">Compared (Error</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Error left, Error right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Error.
        /// </summary>
        public sealed class ErrorBuilder
        {
            private string __Error;
            private string _ErrorMessage;

            internal ErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Error._Error property.
            /// </summary>
            /// <param name="value">_Error</param>
            public ErrorBuilder _Error(string value)
            {
                __Error = value;
                return this;
            }

            /// <summary>
            /// Sets value for Error.ErrorMessage property.
            /// </summary>
            /// <param name="value">ErrorMessage</param>
            public ErrorBuilder ErrorMessage(string value)
            {
                _ErrorMessage = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Error.
            /// </summary>
            /// <returns>Error</returns>
            public Error Build()
            {
                Validate();
                return new Error(
                    _Error: __Error,
                    ErrorMessage: _ErrorMessage
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}