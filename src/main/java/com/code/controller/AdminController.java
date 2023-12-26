package com.code.controller;

import com.code.model.Product;
import com.code.model.User;
import com.code.service.ProductService;
import com.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private final UserService userService;
	private final ProductService productService;

	@Autowired
	public AdminController(UserService userService, ProductService productService){

		this.userService = userService;
		this.productService = productService;
	}
	@GetMapping("")
	public String admin(@Param("gmail") String gmail, @Param("password") String password, Model model){
		User user = userService.findUserByEmailAndPassword(gmail, password);
		List<Product> list = productService.getProduct();
		if(gmail.equals("admin@gmail.com") && password.equals("123456")){
			model.addAttribute("email", gmail);
			model.addAttribute("pass", password);
			return "admin/admin";
		} else if (gmail.equals(user.getGmail()) && password.equals(user.getPassword())){

			model.addAttribute("name", user.getUsername());
			model.addAttribute("role", user.getRole());
			model.addAttribute("direct","/image/");
			model.addAttribute("file",".png");
			model.addAttribute("list", list);
			return "admin/employee";
		}


		return "redirect:/";
	}

}
