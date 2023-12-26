package com.code.service;

import com.code.model.User;
import com.code.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	public List<User> getUser(){
		return (List<User>) userRepository.findAll();
	}

	public List<User> searchUser(String keyword){
		return userRepository.searchUser(keyword);
	}

	public void addUser(User user){
		userRepository.save(user);
	}
	public void updateUser(int id, User userRequest){
		User user = userRepository.findById(id).get();
		user.setUsername(userRequest.getUsername());
		user.setGmail(userRequest.getGmail());
		user.setPassword(userRequest.getPassword());
		user.setGender(userRequest.getGender());
		user.setPhone(userRequest.getPhone());
		user.setDob(userRequest.getDob());
		user.setRole(userRequest.getRole());
		user.setStatus(userRequest.getStatus());
		userRepository.save(user);
	}

	public User findUserById(int id){
		return userRepository.findById(id).get();
	}

	public User findUserByEmailAndPassword(String email, String password){
		return userRepository.findUserByGmailAndAndPassword(email, password);
	}
}
