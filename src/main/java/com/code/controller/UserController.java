package com.code.controller;

import com.code.model.User;
import com.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService){
		this.userService = userService;
	}
	@GetMapping("")
	public String user(Model model, @Param("keyword") String keyword) {
		List<User> list = new ArrayList<>();

		if (keyword != null) {
			list = userService.searchUser(keyword);
		} else {
			list = userService.getUser();
		}
		System.out.println(keyword);
		model.addAttribute("linkEdit", "/admin/user/edit/");
		model.addAttribute("link", "/admin/user/");
		model.addAttribute("users", list);
		model.addAttribute("keyword", keyword);
		return "admin/user";
	}

	@GetMapping("/addUser")
	public String addUser(){
		return "admin/user/addUser";
	}

	@PostMapping("/addUser")
	public String addUser(User u){
		userService.addUser(u);
		return"redirect:/admin/user";
	}

	@GetMapping("/edit/{id}")
	public String updateUser(@PathVariable int id, Model model){
		User user = userService.findUserById(id);
		model.addAttribute("user", user);
		model.addAttribute("link","/admin/user/edit/");
		return "/admin/user/editUser";
	}

	@PostMapping("/edit/{id}")
	public String updateUser(@PathVariable int id, User userRequest){
		userService.updateUser(id, userRequest);
		return "redirect:/admin/user";
	}

	@GetMapping("/{id}")
	public String viewUser(@PathVariable int id, Model model){
		User user = userService.findUserById(id);
		System.out.println(user);
		model.addAttribute("link","/admin/agent/edit/");
		model.addAttribute("agent", user);
		return "/admin/user/viewUser";
	}


}

