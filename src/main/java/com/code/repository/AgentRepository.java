package com.code.repository;

import com.code.model.Agent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface AgentRepository extends CrudRepository<Agent, String> {
}
