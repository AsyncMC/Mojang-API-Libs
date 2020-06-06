package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * UsernamePassword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:32.782277100-03:00[America/Sao_Paulo]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UsernamePassword   {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  public UsernamePassword username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The Mojang account e-mail or username. Never store it.
   * @return username
  **/
  @NotNull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UsernamePassword password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The Mojang account password, never store it.
   * @return password
  **/
  @NotNull
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsernamePassword usernamePassword = (UsernamePassword) o;
    return Objects.equals(username, usernamePassword.username) &&
        Objects.equals(password, usernamePassword.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsernamePassword {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

