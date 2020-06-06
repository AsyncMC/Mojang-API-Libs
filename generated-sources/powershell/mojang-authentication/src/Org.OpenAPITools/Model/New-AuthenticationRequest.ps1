function New-AuthenticationRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${username},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${password}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AuthenticationRequest' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AuthenticationRequest -ArgumentList @(
            ${username},
            ${password}
        )
    }
}
