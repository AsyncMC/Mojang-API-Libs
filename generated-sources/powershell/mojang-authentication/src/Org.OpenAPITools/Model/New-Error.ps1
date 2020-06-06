function New-Error {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${error},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${errorMessage}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Error' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Error -ArgumentList @(
            ${error},
            ${errorMessage}
        )
    }
}
