package com.code.model;

import jakarta.persistence.Entity;
import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
	private String userId;
	private String username;
	private String gmail;
	private String password;
	private String gender;
	private String phone;
	private Date dateOfBirth;
	private String role;
	private String status = "newActive";
	private String picture;
	private String agent;
}
