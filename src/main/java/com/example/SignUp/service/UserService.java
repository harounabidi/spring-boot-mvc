package com.example.SignUp.service;

import com.example.SignUp.model.UserModel;
import com.example.SignUp.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UsersRepository usersRepository;

  public UserService(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }


  public UserModel userRegistration(String username, String password) {
    if (username == null || password == null) {
      return null;
    } else {
      UserModel user = new UserModel();
      user.setUsername(username);
      user.setPassword(password);
      return usersRepository.save(user);
    }
  }
}