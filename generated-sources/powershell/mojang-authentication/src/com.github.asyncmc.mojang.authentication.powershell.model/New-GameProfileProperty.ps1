function New-GameProfileProperty {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${value}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.GameProfileProperty' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.GameProfileProperty -ArgumentList @(
            ${name},
            ${value}
        )
    }
}
