package com.user.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.app.model.UserRequestDto;
import com.user.app.model.UserResponseDto;
import com.user.app.service.UserService;

@RestController
@RequestMapping(path = "user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	private ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto){
		return new ResponseEntity<UserResponseDto>(userService.createUser(userRequestDto), HttpStatus.CREATED);
	}
}
