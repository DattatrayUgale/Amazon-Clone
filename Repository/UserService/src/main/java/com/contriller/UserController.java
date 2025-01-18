package com.contriller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserDetails;
import com.service.ServiceI;


@RestController
@RequestMapping("/UserService")
public class UserController {

	@Autowired
	ServiceI usrsrvc;
	
	@PostMapping("/addUserDetails")
	public ResponseEntity<UserDetails> addData(@RequestBody UserDetails usde) 
	{
		 usrsrvc.addUserData(usde);
		 return new ResponseEntity<UserDetails>(usde, HttpStatus.CREATED);
	}
	
	@GetMapping("/getUserDetails/{id}")
	public ResponseEntity<UserDetails> getUserDetails(@PathVariable int id)
	{
		UserDetails us= usrsrvc.getUserData(id);
		return new ResponseEntity<UserDetails>(us, HttpStatus.OK);
	}
	
	
}
