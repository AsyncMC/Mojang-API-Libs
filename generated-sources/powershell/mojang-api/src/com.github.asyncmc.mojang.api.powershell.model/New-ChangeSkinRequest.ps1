function New-ChangeSkinRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SkinModel]]
        ${model},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${url}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ChangeSkinRequest' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ChangeSkinRequest -ArgumentList @(
            ${model},
            ${url}
        )
    }
}
