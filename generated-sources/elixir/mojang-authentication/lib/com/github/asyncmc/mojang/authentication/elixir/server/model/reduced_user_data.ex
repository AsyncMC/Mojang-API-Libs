# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.authentication.elixir.server.Model.ReducedUserData do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"properties"
  ]

  @type t :: %__MODULE__{
    :"id" => String.t | nil,
    :"properties" => [GameProfileProperty] | nil
  }
end

defimpl Poison.Decoder, for: com.github.asyncmc.mojang.authentication.elixir.server.Model.ReducedUserData do
  import com.github.asyncmc.mojang.authentication.elixir.server.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"properties", :list, com.github.asyncmc.mojang.authentication.elixir.server.Model.GameProfileProperty, options)
  end
end

