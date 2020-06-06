function New-AccessKeys {
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
        'Creating object: Org.OpenAPITools.Model.AccessKeys' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AccessKeys -ArgumentList @(
            ${accessToken},
            ${clientToken}
        )
    }
}
