package com.example.SignUp.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UserModel {

  @Id
  @SequenceGenerator (
          name = "customer_id_sequence",
          sequenceName = "customer_id_sequence",
          allocationSize = 1
  )
  @GeneratedValue (
          strategy = GenerationType.SEQUENCE,
          generator = "customer_id_sequence"
  )

  private Integer userId;
  private String username;
  private String password;


  public UserModel(Integer userId, String username, String password) {
    this.userId = userId;
    this.username = username;
    this.password = password;
  }


  public UserModel() {
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserModel userModel = (UserModel) o;
    return Objects.equals(userId, userModel.userId) && Objects.equals(username, userModel.username) && Objects.equals(password, userModel.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, password);
  }

  @Override
  public String toString() {
    return "UserModel{" +
            "userId=" + userId +
            ", userName='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
