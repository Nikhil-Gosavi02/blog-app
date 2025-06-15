package com.blog.apis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.apis.payloads.UserDto;
import com.blog.apis.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UseerController {
	
	@Autowired
	private UserService userService;
		
	
	//post - create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
	{
		UserDto creatUserDto = this.userService.createUser(userDto);
		
		return new ResponseEntity<>(creatUserDto,HttpStatus.CREATED); 
	}
	
	//put - update user
	//delete - delete user
	//get - user get

}
