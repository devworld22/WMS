package com.ems.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Table(name="user_details")
public class UserEntity {
 @Id
 private Integer id;
 
 @Column(name = "name")
 private String name;
 @Column(name = "email_id")
 private String emailId;
 @Column(name = "gender")
 private String gender;
 @Column(name = "password")
 private String password;
 @Column(name = "is_active")
 private Boolean isActive;
 @Column(name = "role")
 private String role;
 @Column(name = "careated_at")
 private LocalDateTime createdAt;
 @Column(name = "updated_at")
 private LocalDateTime updatedAt;
 @Column(name = "login_count")
 private String loginCount;
 @Column(name = "tokens")
 private String tokens;
 
 
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getTokens() {
	return tokens;
}
public void setTokens(String tokens) {
	this.tokens = tokens;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Boolean getIsActive() {
	return isActive;
}
public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
}

public LocalDateTime getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}
public LocalDateTime getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(LocalDateTime updatedAt) {
	this.updatedAt = updatedAt;
}
public String getLoginCount() {
	return loginCount;
}
public void setLoginCount(String loginCount) {
	this.loginCount = loginCount;
}
 
 
 
}
