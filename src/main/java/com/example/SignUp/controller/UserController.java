package com.example.SignUp.controller;

import com.example.SignUp.model.UserModel;
import com.example.SignUp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/signup")
  public String getSignUpPage(Model model) {
    model.addAttribute("signupRequest", new UserModel());
    return "SignUpPage";
  }

  @PostMapping("/signup")
  public String signUp(@ModelAttribute UserModel userModel) {

    UserModel registeredUser = userService.userRegistration(userModel.getUsername(), userModel.getPassword());

    return  registeredUser == null ? "error_page" : "redirect:/";
  }

}
