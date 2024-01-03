package com.ems.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.UserEntity;
import com.ems.model.UserLoginRequest;
import com.ems.model.UserModel;
import com.ems.repository.UserRepository;
import com.ems.service.UserServiceImpl;

@RestController
@RequestMapping(path = "/api")
public class UserControler {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserServiceImpl userServiceImpl;


	@PostMapping("/signup")
	public ResponseEntity<UserModel> signup(@RequestBody UserModel userModel) {
		UserModel response = new UserModel();
		try {
			 response = userServiceImpl.signup(userModel);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserLoginRequest userLoginReq) {
		if (userLoginReq.getEmailId() != null && userLoginReq.getPassword() != null) {
			UserEntity entity = userRepository.findByEmailIdIgnoreCaseAndPassword(userLoginReq.getEmailId(),
					userLoginReq.getPassword());
			if (entity != null) {
				LocalDateTime updatedAt = LocalDateTime.now();
				entity.setUpdatedAt(updatedAt);

				userRepository.save(entity);
				return ResponseEntity.status(HttpStatus.OK).body(entity.getTokens());
			} else {
				return ResponseEntity.status(HttpStatus.OK).body("Login Failed");
			}
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Input parameter");
		}
	}

	@GetMapping("/get/user")
	public ResponseEntity<Optional<UserEntity>> getUser(@RequestBody UserModel userReq) throws Exception {
		Optional<UserEntity> entity = userRepository.findById(userReq.getId());
		if (userReq.getId() >= 0) {
			if (entity != null) {
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(entity);
			}
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(entity);
		}
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

}
