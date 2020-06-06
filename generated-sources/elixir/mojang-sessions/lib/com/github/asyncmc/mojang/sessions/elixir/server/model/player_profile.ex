# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.sessions.elixir.server.Model.PlayerProfile do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"name",
    :"legacy",
    :"properties"
  ]

  @type t :: %__MODULE__{
    :"id" => String.t,
    :"name" => String.t,
    :"legacy" => boolean() | nil,
    :"properties" => [PlayerProfileProperty]
  }
end

defimpl Poison.Decoder, for: com.github.asyncmc.mojang.sessions.elixir.server.Model.PlayerProfile do
  import com.github.asyncmc.mojang.sessions.elixir.server.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"properties", :list, com.github.asyncmc.mojang.sessions.elixir.server.Model.PlayerProfileProperty, options)
  end
end

