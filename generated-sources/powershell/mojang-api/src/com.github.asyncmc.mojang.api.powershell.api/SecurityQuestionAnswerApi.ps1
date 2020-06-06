function Invoke-SecurityQuestionAnswerApiCheckSecurityStatus {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: SecurityQuestionAnswerApi-CheckSecurityStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SecurityQuestionAnswerApi.CheckSecurityStatus(
        )
    }
}

function Invoke-SecurityQuestionAnswerApiListPendingSecurityQuestions {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: SecurityQuestionAnswerApi-ListPendingSecurityQuestions' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SecurityQuestionAnswerApi.ListPendingSecurityQuestions(
        )
    }
}

function Invoke-SecurityQuestionAnswerApiSendSecurityQuestionAnswers {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.SecurityAnswer[]]
        ${securityAnswer}
    )

    Process {
        'Calling method: SecurityQuestionAnswerApi-SendSecurityQuestionAnswers' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SecurityQuestionAnswerApi.SendSecurityQuestionAnswers(
            ${securityAnswer}
        )
    }
}

