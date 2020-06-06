using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Wraps the URL to the texture
    /// </summary>
    public class PlayerTextureURL:  IEquatable<PlayerTextureURL>
    { 
        /// <summary>
        /// The URL to the texture, must be in Mojang&#39;s domains.
        /// </summary>
        public string Url { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PlayerTextureURL.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PlayerTextureURL()
        {
        }

        protected PlayerTextureURL(string Url)
        {
            
            this.Url = Url;
            
        }

        /// <summary>
        /// Returns builder of PlayerTextureURL.
        /// </summary>
        /// <returns>PlayerTextureURLBuilder</returns>
        public static PlayerTextureURLBuilder Builder()
        {
            return new PlayerTextureURLBuilder();
        }

        /// <summary>
        /// Returns PlayerTextureURLBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PlayerTextureURLBuilder</returns>
        public PlayerTextureURLBuilder With()
        {
            return Builder()
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

        public bool Equals(PlayerTextureURL other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PlayerTextureURL.
        /// </summary>
        /// <param name="left">Compared (PlayerTextureURL</param>
        /// <param name="right">Compared (PlayerTextureURL</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PlayerTextureURL left, PlayerTextureURL right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PlayerTextureURL.
        /// </summary>
        /// <param name="left">Compared (PlayerTextureURL</param>
        /// <param name="right">Compared (PlayerTextureURL</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PlayerTextureURL left, PlayerTextureURL right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PlayerTextureURL.
        /// </summary>
        public sealed class PlayerTextureURLBuilder
        {
            private string _Url;

            internal PlayerTextureURLBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PlayerTextureURL.Url property.
            /// </summary>
            /// <param name="value">The URL to the texture, must be in Mojang&#39;s domains.</param>
            public PlayerTextureURLBuilder Url(string value)
            {
                _Url = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PlayerTextureURL.
            /// </summary>
            /// <returns>PlayerTextureURL</returns>
            public PlayerTextureURL Build()
            {
                Validate();
                return new PlayerTextureURL(
                    Url: _Url
                );
            }

            private void Validate()
            { 
                if (_Url == null)
                {
                    throw new ArgumentException("Url is a required property for PlayerTextureURL and cannot be null");
                } 
            }
        }

        
    }
}