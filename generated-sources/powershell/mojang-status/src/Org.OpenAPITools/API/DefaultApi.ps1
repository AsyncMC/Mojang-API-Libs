function Invoke-DefaultApiCheckStatuses {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: DefaultApi-CheckStatuses' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.CheckStatuses(
        )
    }
}

