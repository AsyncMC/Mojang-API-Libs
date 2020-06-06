function New-NameChange {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedToAt}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.NameChange' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.NameChange -ArgumentList @(
            ${name},
            ${changedToAt}
        )
    }
}
