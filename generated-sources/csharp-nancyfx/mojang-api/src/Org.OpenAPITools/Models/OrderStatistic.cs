using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Valid options to query the order statistics
    /// </summary>
    /// <value>Valid options to query the order statistics</value>
    public enum OrderStatistic
    {
        
        /// <summary>
        /// Enum ItemSoldMinecraft
        /// </summary>
        ItemSoldMinecraft = 1,
        
        /// <summary>
        /// Enum PrepaidCardRedeemedMinecraft
        /// </summary>
        PrepaidCardRedeemedMinecraft = 2,
        
        /// <summary>
        /// Enum ItemSoldCobalt
        /// </summary>
        ItemSoldCobalt = 3,
        
        /// <summary>
        /// Enum ItemSoldScrolls
        /// </summary>
        ItemSoldScrolls = 4,
        
        /// <summary>
        /// Enum PrepaidCardRedeemedCobalt
        /// </summary>
        PrepaidCardRedeemedCobalt = 5,
        
        /// <summary>
        /// Enum ItemSoldDungeons
        /// </summary>
        ItemSoldDungeons = 6
    }

}