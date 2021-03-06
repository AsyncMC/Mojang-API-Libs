# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.api.elixir.server.Model.SecurityAnswerId do
  @moduledoc """
  A security question answer id given by Mojang
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id"
  ]

  @type t :: %__MODULE__{
    :"id" => integer()
  }
end

defimpl Poison.Decoder, for: com.github.asyncmc.mojang.api.elixir.server.Model.SecurityAnswerId do
  def decode(value, _options) do
    value
  end
end

