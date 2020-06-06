function New-PlayerProfileTexturePropertyValue {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${timestamp},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${profileId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${profileName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${signatureRequired},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.PlayerTexture]]
        ${textures}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PlayerProfileTexturePropertyValue' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PlayerProfileTexturePropertyValue -ArgumentList @(
            ${timestamp},
            ${profileId},
            ${profileName},
            ${signatureRequired},
            ${textures}
        )
    }
}
