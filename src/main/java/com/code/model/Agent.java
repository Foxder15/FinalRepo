package com.code.model;

public class Agent {
	private String agentId;
	private String agentName;
	private String agentAddress;

	public Agent() {
	}

	public Agent(String agentId, String agentName, String agentAddress) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentAddress = agentAddress;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentAddress() {
		return agentAddress;
	}

	public void setAgentAddress(String agentAddress) {
		this.agentAddress = agentAddress;
	}

	@Override
	public String toString() {
		return "Agent{" +
				"agentId='" + agentId + '\'' +
				", agentName='" + agentName + '\'' +
				", agentAddress='" + agentAddress + '\'' +
				'}';
	}
}
