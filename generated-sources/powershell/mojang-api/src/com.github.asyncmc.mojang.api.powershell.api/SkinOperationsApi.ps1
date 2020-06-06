function Invoke-SkinOperationsApiChangePlayerSkin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${strippedUuid},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${url},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.Org.OpenAPITools.Model.SkinModel]
        ${model}
    )

    Process {
        'Calling method: SkinOperationsApi-ChangePlayerSkin' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SkinOperationsApi.ChangePlayerSkin(
            ${strippedUuid},
            ${url},
            ${model}
        )
    }
}

function Invoke-SkinOperationsApiResetPlayerSkin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${strippedUuid}
    )

    Process {
        'Calling method: SkinOperationsApi-ResetPlayerSkin' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SkinOperationsApi.ResetPlayerSkin(
            ${strippedUuid}
        )
    }
}

function Invoke-SkinOperationsApiUploadPlayerSkin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${strippedUuid},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${file},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Org.OpenAPITools.Model.Org.OpenAPITools.Model.SkinModel]
        ${model}
    )

    Process {
        'Calling method: SkinOperationsApi-UploadPlayerSkin' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SkinOperationsApi.UploadPlayerSkin(
            ${strippedUuid},
            ${file},
            ${model}
        )
    }
}

