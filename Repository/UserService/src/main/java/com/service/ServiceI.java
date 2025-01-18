package com.service;

import org.springframework.stereotype.Service;

import com.model.UserDetails;

@Service
public interface ServiceI {

	UserDetails addUserData(UserDetails usde);

	UserDetails getUserData(int id);

}
