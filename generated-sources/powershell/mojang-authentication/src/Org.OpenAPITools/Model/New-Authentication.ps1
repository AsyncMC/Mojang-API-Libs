function New-Authentication {
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
        'Creating object: Org.OpenAPITools.Model.Authentication' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Authentication -ArgumentList @(
            ${accessToken},
            ${clientToken}
        )
    }
}
