# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.authentication.elixir.server.Model.UsernamePassword do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"username",
    :"password"
  ]

  @type t :: %__MODULE__{
    :"username" => String.t,
    :"password" => String.t
  }
end

defimpl Poison.Decoder, for: com.github.asyncmc.mojang.authentication.elixir.server.Model.UsernamePassword do
  def decode(value, _options) do
    value
  end
end

