package com.ems.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.ems.model.UserLoginRequest;
import com.ems.model.UserModel;

public interface UserService {

	public UserModel signup(@RequestBody UserModel userModel) throws Exception;
	
	public String login(@RequestBody UserLoginRequest userLoginReq) throws Exception;
	
	public UserModel getUser(@RequestBody UserModel userReq) throws Exception;
	
}
