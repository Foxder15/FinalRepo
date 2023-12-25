package com.code.service;

import com.code.model.Agent;
import com.code.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

	private final AgentRepository agentRepository;

	@Autowired
	public AgentService(AgentRepository agentRepository){
		this.agentRepository = agentRepository;
	}

	public List<Agent> getAgent(){
		return (List<Agent>) agentRepository.findAll();
	}

	public List<Agent> searchAgent(String keyword){
		return agentRepository.searchAgent(keyword);
	}

	public void addAgent(Agent agent){
		agentRepository.save(agent);
	}
	public void updateAgent(int id, Agent agentRequest){
		Agent agent = agentRepository.findById(id).get();
		agent.setAgentName(agentRequest.getAgentName());
		agent.setAgentAddress(agentRequest.getAgentAddress());
		agent.setStatus(agentRequest.getStatus());
		agentRepository.save(agent);
	}

	public Agent findAgentById(int id){
		return agentRepository.findById(id).get();
	}
}
