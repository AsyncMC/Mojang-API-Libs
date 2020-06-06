function Invoke-NameHistoryApiFindUniqueIdsByName {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String[]]
        ${requestBody}
    )

    Process {
        'Calling method: NameHistoryApi-FindUniqueIdsByName' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NameHistoryApi.FindUniqueIdsByName(
            ${requestBody}
        )
    }
}

function Invoke-NameHistoryApiGetNameHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${strippedUuid}
    )

    Process {
        'Calling method: NameHistoryApi-GetNameHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NameHistoryApi.GetNameHistory(
            ${strippedUuid}
        )
    }
}

function Invoke-NameHistoryApiGetUniqueIdByName {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${username},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${at}
    )

    Process {
        'Calling method: NameHistoryApi-GetUniqueIdByName' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NameHistoryApi.GetUniqueIdByName(
            ${username},
            ${at}
        )
    }
}

