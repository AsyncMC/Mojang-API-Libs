function New-ReducedUserData {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String]]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.GameProfileProperty[]]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ReducedUserData' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ReducedUserData -ArgumentList @(
            ${id},
            ${properties}
        )
    }
}
