package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The current player, demo and legacy status of a player identified by the id
 */
@ApiModel(description = "The current player, demo and legacy status of a player identified by the id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-05T23:36:11.663568600-03:00[America/Sao_Paulo]")

public class CurrentPlayerIDs   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("legacy")
  private Boolean legacy = false;

  @JsonProperty("demo")
  private Boolean demo = false;

  public CurrentPlayerIDs id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The player UUID without hyphens
   * @return id
  */
  @ApiModelProperty(example = "38ba542eb5924231a54cca0f2eac2b54", required = true, value = "The player UUID without hyphens")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurrentPlayerIDs name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The current name being used by this player
   * @return name
  */
  @ApiModelProperty(example = "Alonelord", required = true, value = "The current name being used by this player")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrentPlayerIDs legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

  /**
   * If account has not been converted
   * @return legacy
  */
  @ApiModelProperty(value = "If account has not been converted")


  public Boolean getLegacy() {
    return legacy;
  }

  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  public CurrentPlayerIDs demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

  /**
   * If the player has not puchased the game
   * @return demo
  */
  @ApiModelProperty(value = "If the player has not puchased the game")


  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentPlayerIDs currentPlayerIDs = (CurrentPlayerIDs) o;
    return Objects.equals(this.id, currentPlayerIDs.id) &&
        Objects.equals(this.name, currentPlayerIDs.name) &&
        Objects.equals(this.legacy, currentPlayerIDs.legacy) &&
        Objects.equals(this.demo, currentPlayerIDs.demo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, legacy, demo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentPlayerIDs {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

