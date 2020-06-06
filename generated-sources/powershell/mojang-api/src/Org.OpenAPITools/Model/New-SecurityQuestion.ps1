function New-SecurityQuestion {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${question}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SecurityQuestion' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SecurityQuestion -ArgumentList @(
            ${id},
            ${question}
        )
    }
}
