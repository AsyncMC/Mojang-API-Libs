function New-UploadSkinRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SkinModel]]
        ${model},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${file}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.UploadSkinRequest' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.UploadSkinRequest -ArgumentList @(
            ${model},
            ${file}
        )
    }
}
