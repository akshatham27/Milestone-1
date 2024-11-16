package com.catrionbe.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.catrionbe.api.model.UpdateUserDTO;
import com.catrionbe.api.model.UserDTO;
 import com.catrionbe.api.service.UserService;

 
@RestController
@CrossOrigin
public class UserController {

	
	@Autowired
	private UserService userDetailsService;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}

	
	@RequestMapping(value = "/updateuser", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@RequestBody UpdateUserDTO user) throws Exception {
		return ResponseEntity.ok(userDetailsService.update(user));
	}
	
	
	
	@RequestMapping(value = "/listallusersfromdb", method = RequestMethod.GET)
	public ResponseEntity<?> listallusersfromdb(@RequestParam(defaultValue = "0") final Integer pageNumber,
			@RequestParam(defaultValue = "10") final Integer size) throws Exception {
		return ResponseEntity.ok(userDetailsService.listallusersfromdb(pageNumber, size));
	}
	
	
	
}
