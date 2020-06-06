function New-PrivateUserData {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.GameProfileProperty[]]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PrivateUserData' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PrivateUserData -ArgumentList @(
            ${id},
            ${properties}
        )
    }
}
