function New-PlayerProfileProperty {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.ByteArray]
        ${value},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ByteArray]]
        ${signature}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PlayerProfileProperty' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PlayerProfileProperty -ArgumentList @(
            ${name},
            ${value},
            ${signature}
        )
    }
}
