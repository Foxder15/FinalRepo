package com.code.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int agentId;
	private String agentName;
	private String agentAddress;
	private String status="Active";
}
