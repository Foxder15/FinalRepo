package com.code.repository;

import com.code.model.Agent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentRepository extends CrudRepository<Agent, Integer> {

	@Query("SELECT a FROM Agent a where a.agentName LIKE %?1% or a.status LIKE %?1%")
	List<Agent> searchAgent(String keyword);
}
