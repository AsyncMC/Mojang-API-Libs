using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Wraps the URL to the texture and configures the player&#39;s model
    /// </summary>
    public sealed class PlayerSkinURL: PlayerTextureURL,  IEquatable<PlayerSkinURL>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PlayerSkinURL.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PlayerSkinURL() : base()
        {
        }

        private PlayerSkinURL() : base()
        {
            
        }

        /// <summary>
        /// Returns builder of PlayerSkinURL.
        /// </summary>
        /// <returns>PlayerSkinURLBuilder</returns>
        public static new PlayerSkinURLBuilder Builder()
        {
            return new PlayerSkinURLBuilder();
        }

        /// <summary>
        /// Returns PlayerSkinURLBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PlayerSkinURLBuilder</returns>
        public new PlayerSkinURLBuilder With()
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

        public bool Equals(PlayerSkinURL other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PlayerSkinURL.
        /// </summary>
        /// <param name="left">Compared (PlayerSkinURL</param>
        /// <param name="right">Compared (PlayerSkinURL</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PlayerSkinURL left, PlayerSkinURL right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PlayerSkinURL.
        /// </summary>
        /// <param name="left">Compared (PlayerSkinURL</param>
        /// <param name="right">Compared (PlayerSkinURL</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PlayerSkinURL left, PlayerSkinURL right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PlayerSkinURL.
        /// </summary>
        public sealed class PlayerSkinURLBuilder
        {

            internal PlayerSkinURLBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of PlayerSkinURL.
            /// </summary>
            /// <returns>PlayerSkinURL</returns>
            public PlayerSkinURL Build()
            {
                Validate();
                return new PlayerSkinURL(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}