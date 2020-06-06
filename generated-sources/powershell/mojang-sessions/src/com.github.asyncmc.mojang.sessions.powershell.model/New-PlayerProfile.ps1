function New-PlayerProfile {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${legacy},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.PlayerProfileProperty[]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PlayerProfile' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PlayerProfile -ArgumentList @(
            ${id},
            ${name},
            ${legacy},
            ${properties}
        )
    }
}
