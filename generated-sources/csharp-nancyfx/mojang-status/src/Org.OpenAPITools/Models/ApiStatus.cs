using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
    /// </summary>
    /// <value>The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).</value>
    public enum ApiStatus
    {
        
        /// <summary>
        /// Enum Green
        /// </summary>
        Green = 1,
        
        /// <summary>
        /// Enum Yellow
        /// </summary>
        Yellow = 2,
        
        /// <summary>
        /// Enum Red
        /// </summary>
        Red = 3
    }

}