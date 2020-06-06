function New-OrderStatisticsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${total},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${last24h},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Double]
        ${saleVelocityPerSeconds}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrderStatisticsResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrderStatisticsResponse -ArgumentList @(
            ${total},
            ${last24h},
            ${saleVelocityPerSeconds}
        )
    }
}
