package com.code.controller;

import com.code.model.Agent;
import com.code.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/agent")
public class AgentController {

	@Autowired
	AgentRepository agentDB;

	@GetMapping("")
	public String agent(Model model,@Param("keyword") String keyword){
		List<Agent> list = new ArrayList<>();
		if(keyword != null){
			list = agentDB.searchAgent(keyword);
		}
		else {
			agentDB.findAll().forEach(list::add);
		}
		System.out.println(keyword);
		model.addAttribute("agents", list);
		model.addAttribute("keyword",keyword);
		return "admin/agent";
	}
	@GetMapping("/addAgent")
	public String addAgent(){
		return "admin/agent/addAgent";
	}

	@PostMapping("/addAgent")
	public String addAgent(Agent a, Model model){
		agentDB.save(a);
		return "redirect:/admin/agent";
	}


}
