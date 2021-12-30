package com.example.codejava;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	@Autowired
	private UserRepository repo;
@GetMapping("")
public String viewHomePage() {
	return "index";
}
@GetMapping("/register")
public String showSignUpFrom(Model model) {
	model.addAttribute("user", new user());
	return "signup_form";
}
@PostMapping("/process_register")
public String processRegistransion(user user) {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	String encodedPass = encoder.encode(user.getPassword());
	user.setPassword(encodedPass);
	repo.save(user);
	return"register_success";
}
@GetMapping("/list_users")
public String viewUsersList(Model model) {
 List<user> listUsers = repo.findAll();
 model.addAttribute("listUsers", listUsers);
	return "users";
}
}
