function New-PlayerSkinMetadata {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${model}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PlayerSkinMetadata' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PlayerSkinMetadata -ArgumentList @(
            ${model}
        )
    }
}
