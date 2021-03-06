# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.api.elixir.server.Api.SkinOperations do
  @moduledoc """
  API calls for all endpoints tagged `SkinOperations`.
  """

  alias com.github.asyncmc.mojang.api.elixir.server.Connection
  import com.github.asyncmc.mojang.api.elixir.server.RequestBuilder


  @doc """
  Changes the player skin by URL
  This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.

  ## Parameters

  - connection (com.github.asyncmc.mojang.api.elixir.server.Connection): Connection to server
  - stripped_uuid (String.t): The player UUID without hyphens
  - url (String.t): The URL which Mojang servers will download and apply the skin
  - opts (KeywordList): [optional] Optional parameters
    - :model (SkinModel): 
  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec change_player_skin(Tesla.Env.client, String.t, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def change_player_skin(connection, stripped_uuid, url, opts \\ []) do
    optional_params = %{
      :"model" => :form
    }
    %{}
    |> method(:post)
    |> url("/user/profile/#{stripped_uuid}/skin")
    |> add_param(:form, :"url", url)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Resets the player skin to default

  ## Parameters

  - connection (com.github.asyncmc.mojang.api.elixir.server.Connection): Connection to server
  - stripped_uuid (String.t): The player UUID without hyphens
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec reset_player_skin(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def reset_player_skin(connection, stripped_uuid, _opts \\ []) do
    %{}
    |> method(:delete)
    |> url("/user/profile/#{stripped_uuid}/skin")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Changes the player skin by upload
  This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.

  ## Parameters

  - connection (com.github.asyncmc.mojang.api.elixir.server.Connection): Connection to server
  - stripped_uuid (String.t): The player UUID without hyphens
  - file (String.t): The skin image in PNG format
  - opts (KeywordList): [optional] Optional parameters
    - :model (SkinModel): 
  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec upload_player_skin(Tesla.Env.client, String.t, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def upload_player_skin(connection, stripped_uuid, file, opts \\ []) do
    optional_params = %{
      :"model" => :form
    }
    %{}
    |> method(:put)
    |> url("/user/profile/#{stripped_uuid}/skin")
    |> add_param(:file, :"file", file)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end
end
