using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// GameProfile
    /// </summary>
    public sealed class GameProfile:  IEquatable<GameProfile>
    { 
        /// <summary>
        /// Agent
        /// </summary>
        public string Agent { get; private set; }

        /// <summary>
        /// Id
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// UserId
        /// </summary>
        public System.IO.Stream UserId { get; private set; }

        /// <summary>
        /// Unix timestamp in milliseconds
        /// </summary>
        public long? CreatedAt { get; private set; }

        /// <summary>
        /// LegacyProfile
        /// </summary>
        public bool? LegacyProfile { get; private set; }

        /// <summary>
        /// Suspended
        /// </summary>
        public bool? Suspended { get; private set; }

        /// <summary>
        /// Paid
        /// </summary>
        public bool? Paid { get; private set; }

        /// <summary>
        /// Migrated
        /// </summary>
        public bool? Migrated { get; private set; }

        /// <summary>
        /// Legacy
        /// </summary>
        public bool? Legacy { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use GameProfile.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public GameProfile()
        {
        }

        private GameProfile(string Agent, string Id, string Name, System.IO.Stream UserId, long? CreatedAt, bool? LegacyProfile, bool? Suspended, bool? Paid, bool? Migrated, bool? Legacy)
        {
            
            this.Agent = Agent;
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.UserId = UserId;
            
            this.CreatedAt = CreatedAt;
            
            this.LegacyProfile = LegacyProfile;
            
            this.Suspended = Suspended;
            
            this.Paid = Paid;
            
            this.Migrated = Migrated;
            
            this.Legacy = Legacy;
            
        }

        /// <summary>
        /// Returns builder of GameProfile.
        /// </summary>
        /// <returns>GameProfileBuilder</returns>
        public static GameProfileBuilder Builder()
        {
            return new GameProfileBuilder();
        }

        /// <summary>
        /// Returns GameProfileBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>GameProfileBuilder</returns>
        public GameProfileBuilder With()
        {
            return Builder()
                .Agent(Agent)
                .Id(Id)
                .Name(Name)
                .UserId(UserId)
                .CreatedAt(CreatedAt)
                .LegacyProfile(LegacyProfile)
                .Suspended(Suspended)
                .Paid(Paid)
                .Migrated(Migrated)
                .Legacy(Legacy);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(GameProfile other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (GameProfile.
        /// </summary>
        /// <param name="left">Compared (GameProfile</param>
        /// <param name="right">Compared (GameProfile</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (GameProfile left, GameProfile right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (GameProfile.
        /// </summary>
        /// <param name="left">Compared (GameProfile</param>
        /// <param name="right">Compared (GameProfile</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (GameProfile left, GameProfile right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of GameProfile.
        /// </summary>
        public sealed class GameProfileBuilder
        {
            private string _Agent;
            private string _Id;
            private string _Name;
            private System.IO.Stream _UserId;
            private long? _CreatedAt;
            private bool? _LegacyProfile;
            private bool? _Suspended;
            private bool? _Paid;
            private bool? _Migrated;
            private bool? _Legacy;

            internal GameProfileBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for GameProfile.Agent property.
            /// </summary>
            /// <param name="value">Agent</param>
            public GameProfileBuilder Agent(string value)
            {
                _Agent = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public GameProfileBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public GameProfileBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public GameProfileBuilder UserId(System.IO.Stream value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.CreatedAt property.
            /// </summary>
            /// <param name="value">Unix timestamp in milliseconds</param>
            public GameProfileBuilder CreatedAt(long? value)
            {
                _CreatedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.LegacyProfile property.
            /// </summary>
            /// <param name="value">LegacyProfile</param>
            public GameProfileBuilder LegacyProfile(bool? value)
            {
                _LegacyProfile = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.Suspended property.
            /// </summary>
            /// <param name="value">Suspended</param>
            public GameProfileBuilder Suspended(bool? value)
            {
                _Suspended = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.Paid property.
            /// </summary>
            /// <param name="value">Paid</param>
            public GameProfileBuilder Paid(bool? value)
            {
                _Paid = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.Migrated property.
            /// </summary>
            /// <param name="value">Migrated</param>
            public GameProfileBuilder Migrated(bool? value)
            {
                _Migrated = value;
                return this;
            }

            /// <summary>
            /// Sets value for GameProfile.Legacy property.
            /// </summary>
            /// <param name="value">Legacy</param>
            public GameProfileBuilder Legacy(bool? value)
            {
                _Legacy = value;
                return this;
            }


            /// <summary>
            /// Builds instance of GameProfile.
            /// </summary>
            /// <returns>GameProfile</returns>
            public GameProfile Build()
            {
                Validate();
                return new GameProfile(
                    Agent: _Agent,
                    Id: _Id,
                    Name: _Name,
                    UserId: _UserId,
                    CreatedAt: _CreatedAt,
                    LegacyProfile: _LegacyProfile,
                    Suspended: _Suspended,
                    Paid: _Paid,
                    Migrated: _Migrated,
                    Legacy: _Legacy
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}