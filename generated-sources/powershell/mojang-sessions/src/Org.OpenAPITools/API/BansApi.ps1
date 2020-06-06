function Invoke-BansApiGetBlockedServerHashes {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: BansApi-GetBlockedServerHashes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:BansApi.GetBlockedServerHashes(
        )
    }
}

