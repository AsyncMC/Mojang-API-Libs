# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.github.asyncmc.mojang.api.elixir.server.Model.UploadSkinRequest do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"model",
    :"file"
  ]

  @type t :: %__MODULE__{
    :"model" => SkinModel | nil,
    :"file" => String.t
  }
end

defimpl Poison.Decoder, for: com.github.asyncmc.mojang.api.elixir.server.Model.UploadSkinRequest do
  import com.github.asyncmc.mojang.api.elixir.server.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"model", :struct, com.github.asyncmc.mojang.api.elixir.server.Model.SkinModel, options)
  end
end
