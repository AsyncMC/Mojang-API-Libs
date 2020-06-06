function Invoke-MiscellaneousApiGetOrdersStatistics {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.OrderStatisticsRequest]
        ${orderStatisticsRequest}
    )

    Process {
        'Calling method: MiscellaneousApi-GetOrdersStatistics' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:MiscellaneousApi.GetOrdersStatistics(
            ${orderStatisticsRequest}
        )
    }
}

