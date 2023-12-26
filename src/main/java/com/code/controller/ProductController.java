package com.code.controller;

import com.code.model.Agent;
import com.code.model.Product;
import com.code.service.ProductService;
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
@RequestMapping("/admin/product")
public class ProductController {

	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService){
		this.productService = productService;
	}

	@GetMapping("")
	public String product(Model model,@Param("keyword") String keyword){
		List<Product> list = new ArrayList<>();
		if(keyword != null){
			list = productService.searchProduct(keyword);
		}
		else {
			list = productService.getProduct();
		}
		System.out.println(keyword);
		model.addAttribute("linkEdit","/admin/product/edit/");
		model.addAttribute("link","/admin/product/");
		model.addAttribute("products", list);
		model.addAttribute("keyword",keyword);
		return "admin/product";
	}

	@GetMapping("/addProduct")
	public String addProduct(){
		return "admin/product/addProduct";
	}

	@PostMapping("/addProduct")
	public String addProduct(Product p){
		productService.addProduct(p);
		return "redirect:/admin/product";
	}

	@GetMapping("/edit/{id}")
	public String updateProduct(@PathVariable int id, Model model){
		Product product = productService.findProductById(id);
		model.addAttribute("product", product);
		model.addAttribute("link", "/admin/product/edit/");
		return "/admin/product/editProduct";
	}

	@PostMapping("/edit/{id}")
	public String updateProduct(@PathVariable int id, Product productRequest){
		productService.updateProduct(id, productRequest);
		return "redirect:/admin/product";
	}

	@GetMapping("/{id}")
	public String viewProduct(@PathVariable int id, Model model){
		Product product = productService.findProductById(id);
		System.out.println(product);
		model.addAttribute("link","/admin/product/edit/");
		model.addAttribute("product", product);
		return "/admin/product/viewProduct";
	}
}
