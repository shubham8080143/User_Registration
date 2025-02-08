package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.User;
import com.api.repo.UserRepo;

@Service
public class UserServiceImple implements UserService{
	
	@Autowired
	private UserRepo repo;
	
	

	@Override
	public void register(User user) {
		repo.save(user);
		
	}

}
