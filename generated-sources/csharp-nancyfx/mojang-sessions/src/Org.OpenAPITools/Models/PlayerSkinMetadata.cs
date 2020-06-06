using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Contains details about the skin
    /// </summary>
    public sealed class PlayerSkinMetadata:  IEquatable<PlayerSkinMetadata>
    { 
        /// <summary>
        /// The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.
        /// </summary>
        public ModelEnum? Model { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PlayerSkinMetadata.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PlayerSkinMetadata()
        {
        }

        private PlayerSkinMetadata(ModelEnum? Model)
        {
            
            this.Model = Model;
            
        }

        /// <summary>
        /// Returns builder of PlayerSkinMetadata.
        /// </summary>
        /// <returns>PlayerSkinMetadataBuilder</returns>
        public static PlayerSkinMetadataBuilder Builder()
        {
            return new PlayerSkinMetadataBuilder();
        }

        /// <summary>
        /// Returns PlayerSkinMetadataBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PlayerSkinMetadataBuilder</returns>
        public PlayerSkinMetadataBuilder With()
        {
            return Builder()
                .Model(Model);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PlayerSkinMetadata other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PlayerSkinMetadata.
        /// </summary>
        /// <param name="left">Compared (PlayerSkinMetadata</param>
        /// <param name="right">Compared (PlayerSkinMetadata</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PlayerSkinMetadata left, PlayerSkinMetadata right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PlayerSkinMetadata.
        /// </summary>
        /// <param name="left">Compared (PlayerSkinMetadata</param>
        /// <param name="right">Compared (PlayerSkinMetadata</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PlayerSkinMetadata left, PlayerSkinMetadata right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PlayerSkinMetadata.
        /// </summary>
        public sealed class PlayerSkinMetadataBuilder
        {
            private ModelEnum? _Model;

            internal PlayerSkinMetadataBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PlayerSkinMetadata.Model property.
            /// </summary>
            /// <param name="value">The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.</param>
            public PlayerSkinMetadataBuilder Model(ModelEnum? value)
            {
                _Model = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PlayerSkinMetadata.
            /// </summary>
            /// <returns>PlayerSkinMetadata</returns>
            public PlayerSkinMetadata Build()
            {
                Validate();
                return new PlayerSkinMetadata(
                    Model: _Model
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum ModelEnum { Slim };
    }
}