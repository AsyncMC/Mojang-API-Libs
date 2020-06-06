using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// InlineObject
    /// </summary>
    public sealed class InlineObject:  IEquatable<InlineObject>
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
        /// Use InlineObject.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject()
        {
        }

        private InlineObject(SkinModel? Model, System.IO.Stream File)
        {
            
            this.Model = Model;
            
            this.File = File;
            
        }

        /// <summary>
        /// Returns builder of InlineObject.
        /// </summary>
        /// <returns>InlineObjectBuilder</returns>
        public static InlineObjectBuilder Builder()
        {
            return new InlineObjectBuilder();
        }

        /// <summary>
        /// Returns InlineObjectBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObjectBuilder</returns>
        public InlineObjectBuilder With()
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

        public bool Equals(InlineObject other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject.
        /// </summary>
        /// <param name="left">Compared (InlineObject</param>
        /// <param name="right">Compared (InlineObject</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject left, InlineObject right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject.
        /// </summary>
        /// <param name="left">Compared (InlineObject</param>
        /// <param name="right">Compared (InlineObject</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject left, InlineObject right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject.
        /// </summary>
        public sealed class InlineObjectBuilder
        {
            private SkinModel? _Model;
            private System.IO.Stream _File;

            internal InlineObjectBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject.Model property.
            /// </summary>
            /// <param name="value">Model</param>
            public InlineObjectBuilder Model(SkinModel? value)
            {
                _Model = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject.File property.
            /// </summary>
            /// <param name="value">The skin image in PNG format</param>
            public InlineObjectBuilder File(System.IO.Stream value)
            {
                _File = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject.
            /// </summary>
            /// <returns>InlineObject</returns>
            public InlineObject Build()
            {
                Validate();
                return new InlineObject(
                    Model: _Model,
                    File: _File
                );
            }

            private void Validate()
            { 
                if (_File == null)
                {
                    throw new ArgumentException("File is a required property for InlineObject and cannot be null");
                } 
            }
        }

        
        public enum SkinModel { Empty, Slim };
    }
}