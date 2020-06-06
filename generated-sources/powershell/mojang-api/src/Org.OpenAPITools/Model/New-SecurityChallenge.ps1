function New-SecurityChallenge {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.SecurityQuestion]
        ${question},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.SecurityAnswerId]
        ${answer}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SecurityChallenge' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SecurityChallenge -ArgumentList @(
            ${question},
            ${answer}
        )
    }
}
