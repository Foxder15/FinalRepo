package com.code.controller;

import com.code.model.Agent;
import com.code.service.AgentService;
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

	private final AgentService agentService;

	@Autowired
	public AgentController(AgentService agentService){
		this.agentService = agentService;
	}

	@GetMapping("")
	public String agent(Model model,@Param("keyword") String keyword){
		List<Agent> list = new ArrayList<>();
		if(keyword != null){
			list = agentService.searchAgent(keyword);
		}
		else {
			list = agentService.getAgent();
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
	public String addAgent(Agent a){
		agentService.addAgent(a);
		return "redirect:/admin/agent";
	}

	@PutMapping("/{id}")
	public String updateAgent(@PathVariable int id, Agent agentRequest){
		agentService.updateAgent(id, agentRequest);
		return "redirect:/admin/agent";
	}

	@GetMapping("/{id}")
	public String viewAgent(@PathVariable int id, Model model){
		Agent agent = agentService.findAgentById(id);
		model.addAttribute("agent", agent);
		return "/admin/agent/viewAgent";
	}


}
