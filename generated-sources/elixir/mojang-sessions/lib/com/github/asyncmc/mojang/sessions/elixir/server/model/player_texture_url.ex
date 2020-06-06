# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.sessions.elixir.server.Model.PlayerTextureUrl do
  @moduledoc """
  Wraps the URL to the texture
  """

  @derive [Poison.Encoder]
  defstruct [
    :"url"
  ]

  @type t :: %__MODULE__{
    :"url" => String.t
  }
end

defimpl Poison.Decoder, for: com.github.asyncmc.mojang.sessions.elixir.server.Model.PlayerTextureUrl do
  def decode(value, _options) do
    value
  end
end

