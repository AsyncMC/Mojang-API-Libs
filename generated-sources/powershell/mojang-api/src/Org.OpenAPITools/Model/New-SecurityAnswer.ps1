function New-SecurityAnswer {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SecurityAnswer' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SecurityAnswer -ArgumentList @(
            ${id}
        )
    }
}
