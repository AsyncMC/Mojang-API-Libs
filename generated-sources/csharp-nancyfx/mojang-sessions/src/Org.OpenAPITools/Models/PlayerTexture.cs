using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Provide links to the player&#39;s skin and cape
    /// </summary>
    public sealed class PlayerTexture:  IEquatable<PlayerTexture>
    { 
        /// <summary>
        /// SKIN
        /// </summary>
        public PlayerSkinURL SKIN { get; private set; }

        /// <summary>
        /// CAPE
        /// </summary>
        public PlayerTextureURL CAPE { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PlayerTexture.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PlayerTexture()
        {
        }

        private PlayerTexture(PlayerSkinURL SKIN, PlayerTextureURL CAPE)
        {
            
            this.SKIN = SKIN;
            
            this.CAPE = CAPE;
            
        }

        /// <summary>
        /// Returns builder of PlayerTexture.
        /// </summary>
        /// <returns>PlayerTextureBuilder</returns>
        public static PlayerTextureBuilder Builder()
        {
            return new PlayerTextureBuilder();
        }

        /// <summary>
        /// Returns PlayerTextureBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PlayerTextureBuilder</returns>
        public PlayerTextureBuilder With()
        {
            return Builder()
                .SKIN(SKIN)
                .CAPE(CAPE);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PlayerTexture other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PlayerTexture.
        /// </summary>
        /// <param name="left">Compared (PlayerTexture</param>
        /// <param name="right">Compared (PlayerTexture</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PlayerTexture left, PlayerTexture right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PlayerTexture.
        /// </summary>
        /// <param name="left">Compared (PlayerTexture</param>
        /// <param name="right">Compared (PlayerTexture</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PlayerTexture left, PlayerTexture right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PlayerTexture.
        /// </summary>
        public sealed class PlayerTextureBuilder
        {
            private PlayerSkinURL _SKIN;
            private PlayerTextureURL _CAPE;

            internal PlayerTextureBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PlayerTexture.SKIN property.
            /// </summary>
            /// <param name="value">SKIN</param>
            public PlayerTextureBuilder SKIN(PlayerSkinURL value)
            {
                _SKIN = value;
                return this;
            }

            /// <summary>
            /// Sets value for PlayerTexture.CAPE property.
            /// </summary>
            /// <param name="value">CAPE</param>
            public PlayerTextureBuilder CAPE(PlayerTextureURL value)
            {
                _CAPE = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PlayerTexture.
            /// </summary>
            /// <returns>PlayerTexture</returns>
            public PlayerTexture Build()
            {
                Validate();
                return new PlayerTexture(
                    SKIN: _SKIN,
                    CAPE: _CAPE
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}