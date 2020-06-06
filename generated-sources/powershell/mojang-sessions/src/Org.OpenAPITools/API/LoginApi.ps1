function Invoke-LoginApiGetPlayerProfile {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${strippedUuid},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${unsigned}
    )

    Process {
        'Calling method: LoginApi-GetPlayerProfile' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:LoginApi.GetPlayerProfile(
            ${strippedUuid},
            ${unsigned}
        )
    }
}

