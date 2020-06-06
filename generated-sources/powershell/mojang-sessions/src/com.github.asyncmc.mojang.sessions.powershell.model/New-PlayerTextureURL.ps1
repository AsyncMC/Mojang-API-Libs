function New-PlayerTextureURL {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${url}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PlayerTextureURL' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PlayerTextureURL -ArgumentList @(
            ${url}
        )
    }
}
