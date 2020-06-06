using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// An object describing giving a bit of information about the error
    /// </summary>
    public sealed class SessionApiError:  IEquatable<SessionApiError>
    { 
        /// <summary>
        /// A message describing the error
        /// </summary>
        public string Error { get; private set; }

        /// <summary>
        /// The request path
        /// </summary>
        public string Path { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SessionApiError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SessionApiError()
        {
        }

        private SessionApiError(string Error, string Path)
        {
            
            this.Error = Error;
            
            this.Path = Path;
            
        }

        /// <summary>
        /// Returns builder of SessionApiError.
        /// </summary>
        /// <returns>SessionApiErrorBuilder</returns>
        public static SessionApiErrorBuilder Builder()
        {
            return new SessionApiErrorBuilder();
        }

        /// <summary>
        /// Returns SessionApiErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SessionApiErrorBuilder</returns>
        public SessionApiErrorBuilder With()
        {
            return Builder()
                .Error(Error)
                .Path(Path);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SessionApiError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SessionApiError.
        /// </summary>
        /// <param name="left">Compared (SessionApiError</param>
        /// <param name="right">Compared (SessionApiError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SessionApiError left, SessionApiError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SessionApiError.
        /// </summary>
        /// <param name="left">Compared (SessionApiError</param>
        /// <param name="right">Compared (SessionApiError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SessionApiError left, SessionApiError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SessionApiError.
        /// </summary>
        public sealed class SessionApiErrorBuilder
        {
            private string _Error;
            private string _Path;

            internal SessionApiErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SessionApiError.Error property.
            /// </summary>
            /// <param name="value">A message describing the error</param>
            public SessionApiErrorBuilder Error(string value)
            {
                _Error = value;
                return this;
            }

            /// <summary>
            /// Sets value for SessionApiError.Path property.
            /// </summary>
            /// <param name="value">The request path</param>
            public SessionApiErrorBuilder Path(string value)
            {
                _Path = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SessionApiError.
            /// </summary>
            /// <returns>SessionApiError</returns>
            public SessionApiError Build()
            {
                Validate();
                return new SessionApiError(
                    Error: _Error,
                    Path: _Path
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}