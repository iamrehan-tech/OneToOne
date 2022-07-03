package com.onetoone.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onetoone.Main.User;
import com.onetoone.Main.Userprofile;
import com.onetoone.services.Userprofileservices;
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	 Userprofileservices userprofileservices;
	
	
//	@GetMapping("/")
//	public ResponseEntity<List<User>> getAllUser() {
//		return new ResponseEntity<>(userprofileservices.getAllUser(), HttpStatus.OK);
//	}
	
	@GetMapping("/{id}")
	public Optional<List<User>> getUser(@PathVariable("id") long id){
		return Optional.of(userprofileservices.getUser(id));
	}
	
	@GetMapping("/")
	public List<User> getAllUser() {
		return userprofileservices.getAllUser();
	}
	
	@GetMapping("/userprofile")
	public List<Userprofile> getAllUserprofile() {  
		return userprofileservices.getAllUserprofile();
	} 
	
//	@PostMapping("/")
//	public ResponseEntity<User> createUser(@RequestBody User usr) {
//		return new ResponseEntity<>(userprofileservices.createUser(usr), HttpStatus.CREATED);
//	}
	
}
