function New-PlayerTexture {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.PlayerSkinURL]]
        ${SKIN},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.PlayerTextureURL]]
        ${CAPE}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PlayerTexture' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PlayerTexture -ArgumentList @(
            ${SKIN},
            ${CAPE}
        )
    }
}
