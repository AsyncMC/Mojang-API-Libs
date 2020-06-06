function New-RefreshResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${clientToken}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.RefreshResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.RefreshResponse -ArgumentList @(
            ${accessToken},
            ${clientToken}
        )
    }
}
