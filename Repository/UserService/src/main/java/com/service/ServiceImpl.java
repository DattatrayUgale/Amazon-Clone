package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.UserDetails;
import com.repo.UserRepository;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	UserRepository ur;

	@Override
	public UserDetails addUserData(UserDetails usde) {
		UserDetails us = ur.save(usde);
		return us;
	}

	@Override
	public UserDetails getUserData(int id) {
		Optional<UserDetails> us=ur.findById(id);
		if(us.isPresent())
		{  
		UserDetails use= us.get();
		return use;
		}
		else {
			System.out.println("Id not Found");
		}
		UserDetails use= us.get();
		return use;
		
		
		}
}


