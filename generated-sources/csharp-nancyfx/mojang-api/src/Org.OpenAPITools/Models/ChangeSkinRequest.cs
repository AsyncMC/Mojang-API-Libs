using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Request Mojang to download a skin from an URL and apply to the player
    /// </summary>
    public sealed class ChangeSkinRequest:  IEquatable<ChangeSkinRequest>
    { 
        /// <summary>
        /// Model
        /// </summary>
        public SkinModel? Model { get; private set; }

        /// <summary>
        /// The URL which Mojang servers will download and apply the skin
        /// </summary>
        public string Url { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ChangeSkinRequest.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ChangeSkinRequest()
        {
        }

        private ChangeSkinRequest(SkinModel? Model, string Url)
        {
            
            this.Model = Model;
            
            this.Url = Url;
            
        }

        /// <summary>
        /// Returns builder of ChangeSkinRequest.
        /// </summary>
        /// <returns>ChangeSkinRequestBuilder</returns>
        public static ChangeSkinRequestBuilder Builder()
        {
            return new ChangeSkinRequestBuilder();
        }

        /// <summary>
        /// Returns ChangeSkinRequestBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ChangeSkinRequestBuilder</returns>
        public ChangeSkinRequestBuilder With()
        {
            return Builder()
                .Model(Model)
                .Url(Url);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ChangeSkinRequest other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ChangeSkinRequest.
        /// </summary>
        /// <param name="left">Compared (ChangeSkinRequest</param>
        /// <param name="right">Compared (ChangeSkinRequest</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ChangeSkinRequest left, ChangeSkinRequest right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ChangeSkinRequest.
        /// </summary>
        /// <param name="left">Compared (ChangeSkinRequest</param>
        /// <param name="right">Compared (ChangeSkinRequest</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ChangeSkinRequest left, ChangeSkinRequest right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ChangeSkinRequest.
        /// </summary>
        public sealed class ChangeSkinRequestBuilder
        {
            private SkinModel? _Model;
            private string _Url;

            internal ChangeSkinRequestBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ChangeSkinRequest.Model property.
            /// </summary>
            /// <param name="value">Model</param>
            public ChangeSkinRequestBuilder Model(SkinModel? value)
            {
                _Model = value;
                return this;
            }

            /// <summary>
            /// Sets value for ChangeSkinRequest.Url property.
            /// </summary>
            /// <param name="value">The URL which Mojang servers will download and apply the skin</param>
            public ChangeSkinRequestBuilder Url(string value)
            {
                _Url = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ChangeSkinRequest.
            /// </summary>
            /// <returns>ChangeSkinRequest</returns>
            public ChangeSkinRequest Build()
            {
                Validate();
                return new ChangeSkinRequest(
                    Model: _Model,
                    Url: _Url
                );
            }

            private void Validate()
            { 
                if (_Url == null)
                {
                    throw new ArgumentException("Url is a required property for ChangeSkinRequest and cannot be null");
                } 
            }
        }

        
        public enum SkinModel { Empty, Slim };
    }
}