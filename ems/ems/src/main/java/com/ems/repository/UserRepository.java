package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findByEmailIdIgnoreCaseAndPassword(String emailId, String password);

	UserEntity findByEmailIdIgnoreCase(String emailId);

}
