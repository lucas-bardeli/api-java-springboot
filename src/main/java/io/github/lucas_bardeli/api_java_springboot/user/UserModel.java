package io.github.lucas_bardeli.api_java_springboot.user;

public class UserModel {

  private String username;
  private String name;
  private String password;

  // Getters
  public String getUsername() {
    return username;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  // Setters
  public void setUsername(String username) {
    this.username = username;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
