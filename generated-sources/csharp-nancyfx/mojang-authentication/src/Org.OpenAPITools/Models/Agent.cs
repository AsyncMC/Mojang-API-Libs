using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Identifies the software doing the request
    /// </summary>
    public sealed class Agent:  IEquatable<Agent>
    { 
        /// <summary>
        /// The name of the game
        /// </summary>
        public NameEnum? Name { get; private set; }

        /// <summary>
        /// The agent version, usually 1.
        /// </summary>
        public int? Version { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Agent.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Agent()
        {
        }

        private Agent(NameEnum? Name, int? Version)
        {
            
            this.Name = Name;
            
            this.Version = Version;
            
        }

        /// <summary>
        /// Returns builder of Agent.
        /// </summary>
        /// <returns>AgentBuilder</returns>
        public static AgentBuilder Builder()
        {
            return new AgentBuilder();
        }

        /// <summary>
        /// Returns AgentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AgentBuilder</returns>
        public AgentBuilder With()
        {
            return Builder()
                .Name(Name)
                .Version(Version);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Agent other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Agent.
        /// </summary>
        /// <param name="left">Compared (Agent</param>
        /// <param name="right">Compared (Agent</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Agent left, Agent right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Agent.
        /// </summary>
        /// <param name="left">Compared (Agent</param>
        /// <param name="right">Compared (Agent</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Agent left, Agent right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Agent.
        /// </summary>
        public sealed class AgentBuilder
        {
            private NameEnum? _Name;
            private int? _Version;

            internal AgentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _Name = NameEnum.Minecraft;
                _Version = 1;
            }

            /// <summary>
            /// Sets value for Agent.Name property.
            /// </summary>
            /// <param name="value">The name of the game</param>
            public AgentBuilder Name(NameEnum? value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Agent.Version property.
            /// </summary>
            /// <param name="value">The agent version, usually 1.</param>
            public AgentBuilder Version(int? value)
            {
                _Version = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Agent.
            /// </summary>
            /// <returns>Agent</returns>
            public Agent Build()
            {
                Validate();
                return new Agent(
                    Name: _Name,
                    Version: _Version
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum NameEnum { Minecraft, Scrolls };
    }
}