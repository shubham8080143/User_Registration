package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

	
	

}
