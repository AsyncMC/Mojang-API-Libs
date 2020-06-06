function New-RefreshRequest {
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
        'Creating object: Org.OpenAPITools.Model.RefreshRequest' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.RefreshRequest -ArgumentList @(
            ${accessToken},
            ${clientToken}
        )
    }
}
