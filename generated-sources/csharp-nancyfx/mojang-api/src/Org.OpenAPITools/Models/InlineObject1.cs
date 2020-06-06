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
    public sealed class InlineObject1:  IEquatable<InlineObject1>
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
        /// Use InlineObject1.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject1()
        {
        }

        private InlineObject1(SkinModel? Model, string Url)
        {
            
            this.Model = Model;
            
            this.Url = Url;
            
        }

        /// <summary>
        /// Returns builder of InlineObject1.
        /// </summary>
        /// <returns>InlineObject1Builder</returns>
        public static InlineObject1Builder Builder()
        {
            return new InlineObject1Builder();
        }

        /// <summary>
        /// Returns InlineObject1Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject1Builder</returns>
        public InlineObject1Builder With()
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

        public bool Equals(InlineObject1 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject1.
        /// </summary>
        /// <param name="left">Compared (InlineObject1</param>
        /// <param name="right">Compared (InlineObject1</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject1 left, InlineObject1 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject1.
        /// </summary>
        /// <param name="left">Compared (InlineObject1</param>
        /// <param name="right">Compared (InlineObject1</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject1 left, InlineObject1 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject1.
        /// </summary>
        public sealed class InlineObject1Builder
        {
            private SkinModel? _Model;
            private string _Url;

            internal InlineObject1Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject1.Model property.
            /// </summary>
            /// <param name="value">Model</param>
            public InlineObject1Builder Model(SkinModel? value)
            {
                _Model = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject1.Url property.
            /// </summary>
            /// <param name="value">The URL which Mojang servers will download and apply the skin</param>
            public InlineObject1Builder Url(string value)
            {
                _Url = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject1.
            /// </summary>
            /// <returns>InlineObject1</returns>
            public InlineObject1 Build()
            {
                Validate();
                return new InlineObject1(
                    Model: _Model,
                    Url: _Url
                );
            }

            private void Validate()
            { 
                if (_Url == null)
                {
                    throw new ArgumentException("Url is a required property for InlineObject1 and cannot be null");
                } 
            }
        }

        
        public enum SkinModel { Empty, Slim };
    }
}