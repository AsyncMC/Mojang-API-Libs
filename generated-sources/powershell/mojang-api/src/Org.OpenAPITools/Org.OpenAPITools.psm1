#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: Org.OpenAPITools.Api.MiscellaneousApi' | Write-Verbose
$Script:MiscellaneousApi= New-Object -TypeName Org.OpenAPITools.Api.MiscellaneousApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.NameHistoryApi' | Write-Verbose
$Script:NameHistoryApi= New-Object -TypeName Org.OpenAPITools.Api.NameHistoryApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.SecurityQuestionAnswerApi' | Write-Verbose
$Script:SecurityQuestionAnswerApi= New-Object -TypeName Org.OpenAPITools.Api.SecurityQuestionAnswerApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.SkinOperationsApi' | Write-Verbose
$Script:SkinOperationsApi= New-Object -TypeName Org.OpenAPITools.Api.SkinOperationsApi -ArgumentList @($null)


#endregion
