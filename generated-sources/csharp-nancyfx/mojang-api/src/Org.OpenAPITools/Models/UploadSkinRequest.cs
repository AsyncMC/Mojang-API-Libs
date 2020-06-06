using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// UploadSkinRequest
    /// </summary>
    public sealed class UploadSkinRequest:  IEquatable<UploadSkinRequest>
    { 
        /// <summary>
        /// Model
        /// </summary>
        public SkinModel? Model { get; private set; }

        /// <summary>
        /// The skin image in PNG format
        /// </summary>
        public System.IO.Stream File { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UploadSkinRequest.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UploadSkinRequest()
        {
        }

        private UploadSkinRequest(SkinModel? Model, System.IO.Stream File)
        {
            
            this.Model = Model;
            
            this.File = File;
            
        }

        /// <summary>
        /// Returns builder of UploadSkinRequest.
        /// </summary>
        /// <returns>UploadSkinRequestBuilder</returns>
        public static UploadSkinRequestBuilder Builder()
        {
            return new UploadSkinRequestBuilder();
        }

        /// <summary>
        /// Returns UploadSkinRequestBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UploadSkinRequestBuilder</returns>
        public UploadSkinRequestBuilder With()
        {
            return Builder()
                .Model(Model)
                .File(File);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UploadSkinRequest other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UploadSkinRequest.
        /// </summary>
        /// <param name="left">Compared (UploadSkinRequest</param>
        /// <param name="right">Compared (UploadSkinRequest</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UploadSkinRequest left, UploadSkinRequest right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UploadSkinRequest.
        /// </summary>
        /// <param name="left">Compared (UploadSkinRequest</param>
        /// <param name="right">Compared (UploadSkinRequest</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UploadSkinRequest left, UploadSkinRequest right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UploadSkinRequest.
        /// </summary>
        public sealed class UploadSkinRequestBuilder
        {
            private SkinModel? _Model;
            private System.IO.Stream _File;

            internal UploadSkinRequestBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UploadSkinRequest.Model property.
            /// </summary>
            /// <param name="value">Model</param>
            public UploadSkinRequestBuilder Model(SkinModel? value)
            {
                _Model = value;
                return this;
            }

            /// <summary>
            /// Sets value for UploadSkinRequest.File property.
            /// </summary>
            /// <param name="value">The skin image in PNG format</param>
            public UploadSkinRequestBuilder File(System.IO.Stream value)
            {
                _File = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UploadSkinRequest.
            /// </summary>
            /// <returns>UploadSkinRequest</returns>
            public UploadSkinRequest Build()
            {
                Validate();
                return new UploadSkinRequest(
                    Model: _Model,
                    File: _File
                );
            }

            private void Validate()
            { 
                if (_File == null)
                {
                    throw new ArgumentException("File is a required property for UploadSkinRequest and cannot be null");
                } 
            }
        }

        
        public enum SkinModel { Empty, Slim };
    }
}