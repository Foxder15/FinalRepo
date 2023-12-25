package com.code.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId;
	private String username;
	private String gmail;
	private String password;
	private String gender;
	private String phone;
	private LocalDate dateOfBirth;
	private String role;
	private String status = "newActive";
	private String picture;
	private String agent;
}
