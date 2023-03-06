package com.example.SignUp.repository;

import com.example.SignUp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<UserModel, Integer> {
  Optional<UserModel> findByUsernameAndPassword(String username, String password);
}