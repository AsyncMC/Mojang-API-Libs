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

'Creating object: Org.OpenAPITools.Api.BansApi' | Write-Verbose
$Script:BansApi= New-Object -TypeName Org.OpenAPITools.Api.BansApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.LoginApi' | Write-Verbose
$Script:LoginApi= New-Object -TypeName Org.OpenAPITools.Api.LoginApi -ArgumentList @($null)


#endregion
