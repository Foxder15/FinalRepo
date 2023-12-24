package com.code.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index/index";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin/admin";
    }

    @GetMapping("/user")
    public String user(){
        return "admin/user";
    }

    @GetMapping("/product")
    public String product(){
        return "admin/product";
    }

    @GetMapping("/agent")
    public String agent(){
        return "admin/agent";
    }

    @GetMapping("/error")
    public String errorHandler(HttpServletRequest req, Model model){
        int code = (int) req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String url = (String) req.getAttribute(RequestDispatcher.ERROR_REQUEST_URI);

        model.addAttribute("code", code);
        model.addAttribute("URL", url);
        return "index/error";
    }


}
