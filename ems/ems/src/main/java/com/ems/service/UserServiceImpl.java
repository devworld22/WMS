package com.ems.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ems.entity.UserEntity;
import com.ems.model.UserLoginRequest;
import com.ems.model.UserModel;
import com.ems.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
//	 private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	 
	@Autowired
    private ModelMapper modelMapper;

	
	public UserModel signup(@RequestBody UserModel userModel) throws Exception {
		UserEntity entity = new UserEntity();
		UserModel response = new UserModel();
		if (userModel.getEmailId() != null && userModel.getPassword() != null && userModel.getName() != null
				&& userModel.getRole() != null) {
			UserEntity emailValid = userRepository.findByEmailIdIgnoreCase(userModel.getEmailId());
			if (emailValid != null) {
				 throw new Exception("Email already Exists");
			} else {
				entity.setId(userModel.getId());
				entity.setName(userModel.getName());
				entity.setEmailId(userModel.getEmailId());
				entity.setPassword(userModel.getPassword());
				LocalDateTime at = LocalDateTime.now();
				entity.setCreatedAt(at);
				entity.setGender(userModel.getGender());
				entity.setIsActive(userModel.getIsActive());
				entity.setUpdatedAt(at);
				entity.setRole(userModel.getRole());
				
				userRepository.save(entity);
				 response = modelMapper.map(entity, UserModel.class);
			}
		} else {
			throw new Exception("Invalid Input");
		}

		return response;
	}

	public String login(@RequestBody UserLoginRequest userLoginReq) {
		String response = null;
		if (userLoginReq.getEmailId() != null && userLoginReq.getPassword() != null) {
			UserEntity entity = userRepository.findByEmailIdIgnoreCaseAndPassword(userLoginReq.getEmailId(),
					userLoginReq.getPassword());
			if (entity != null) {
				LocalDateTime updatedAt = LocalDateTime.now();
				entity.setUpdatedAt(updatedAt);

				userRepository.save(entity);
				response = entity.getTokens();
				return response;
			} else {
				response = "Login Failed";
				return response;
			}
		} else {
			response = "Invalid input parameter";
			return response;
		}
	}

	public UserModel getUser(@RequestBody UserModel userReq) throws Exception {
		UserModel response = new UserModel();
		Optional<UserEntity> entity = userRepository.findById(userReq.getId());
		if (userReq.getId() >= 0) {
			if (entity != null) {
				response = modelMapper.map(entity, UserModel.class);
			} else {
				throw new Exception("User not found");
			}
		} else {
			throw new Exception("Invalid user id");
		}
		return response;
	}

}
