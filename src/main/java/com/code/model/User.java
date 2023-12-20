package com.code.model;

import java.util.Date;

public class User {
	private String userId;
	private String username;
	private String fullName;
	private String gmail;
	private String password;
	private String gender;
	private String numberPhone;
	private Date dateOfBirth;
	private String role;
	private String status = "newActive";
	private String picture;
	private String workingPlace;

	public User() {
	}

	public User(String userId, String username, String fullName, String gmail, String password, String gender, String numberPhone, Date dateOfBirth, String role, String status, String picture, String workingPlace) {
		this.userId = userId;
		this.username = username;
		this.fullName = fullName;
		this.gmail = gmail;
		this.password = password;
		this.gender = gender;
		this.numberPhone = numberPhone;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.status = status;
		this.picture = picture;
		this.workingPlace = workingPlace;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getWorkingPlace() {
		return workingPlace;
	}

	public void setWorkingPlace(String workingPlace) {
		this.workingPlace = workingPlace;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId='" + userId + '\'' +
				", username='" + username + '\'' +
				", fullName='" + fullName + '\'' +
				", gmail='" + gmail + '\'' +
				", password='" + password + '\'' +
				", gender='" + gender + '\'' +
				", numberPhone='" + numberPhone + '\'' +
				", dateOfBirth=" + dateOfBirth +
				", role='" + role + '\'' +
				", status='" + status + '\'' +
				", picture='" + picture + '\'' +
				", workingPlace='" + workingPlace + '\'' +
				'}';
	}
}
