function Invoke-DefaultApiAuthenticate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.AuthenticationRequest]
        ${authenticationRequest}
    )

    Process {
        'Calling method: DefaultApi-Authenticate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.Authenticate(
            ${authenticationRequest}
        )
    }
}

function Invoke-DefaultApiInvalidate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.AccessKeys]
        ${accessKeys}
    )

    Process {
        'Calling method: DefaultApi-Invalidate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.Invalidate(
            ${accessKeys}
        )
    }
}

function Invoke-DefaultApiRefresh {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.RefreshRequest]
        ${refreshRequest}
    )

    Process {
        'Calling method: DefaultApi-Refresh' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.Refresh(
            ${refreshRequest}
        )
    }
}

function Invoke-DefaultApiSiginout {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.UsernamePassword]
        ${usernamePassword}
    )

    Process {
        'Calling method: DefaultApi-Siginout' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.Siginout(
            ${usernamePassword}
        )
    }
}

function Invoke-DefaultApiValidate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.AccessKeys]
        ${accessKeys}
    )

    Process {
        'Calling method: DefaultApi-Validate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.Validate(
            ${accessKeys}
        )
    }
}

