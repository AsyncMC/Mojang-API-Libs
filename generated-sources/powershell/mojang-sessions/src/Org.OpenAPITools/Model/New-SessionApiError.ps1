function New-SessionApiError {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${error},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${path}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SessionApiError' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SessionApiError -ArgumentList @(
            ${error},
            ${path}
        )
    }
}
