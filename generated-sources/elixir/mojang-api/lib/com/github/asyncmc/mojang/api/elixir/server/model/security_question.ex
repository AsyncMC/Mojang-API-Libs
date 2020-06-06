# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.api.elixir.server.Model.SecurityQuestion do
  @moduledoc """
  A security question requested by Mojang
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"question"
  ]

  @type t :: %__MODULE__{
    :"id" => integer(),
    :"question" => String.t
  }
end

defimpl Poison.Decoder, for: com.github.asyncmc.mojang.api.elixir.server.Model.SecurityQuestion do
  def decode(value, _options) do
    value
  end
end

