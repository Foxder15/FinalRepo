package com.code.repository;

import com.code.model.Agent;
import com.code.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	@Query("SELECT u FROM User u where u.username LIKE %?1% or u.gmail LIKE %?1% or u.role LIKE %?1%")
	List<User> searchUser(String keyword);

	User findUserByGmailAndAndPassword(String gmail, String password);
}

