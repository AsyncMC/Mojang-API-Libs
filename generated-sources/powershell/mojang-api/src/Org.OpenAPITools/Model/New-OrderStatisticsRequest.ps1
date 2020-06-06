function New-OrderStatisticsRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.OrderStatistic[]]
        ${metricKeys}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrderStatisticsRequest' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrderStatisticsRequest -ArgumentList @(
            ${metricKeys}
        )
    }
}
