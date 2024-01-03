package com.ems.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class EmployeeModel {
	 private Integer id;
	 private String firstName;
	 private String lastName;
	 private String emailId;
	 private LocalDate dob;
	 private String phoneNumber;
	 private String gender;
	 private Integer addressIdk;
	 private Integer organizationIdk;
	 private Boolean isActive;
	 private LocalDateTime createdTime;
	 private LocalDateTime updatedTime;
	 private String createdBy;
	 private String updatedBy;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAddressIdk() {
		return addressIdk;
	}
	public void setAddressIdk(Integer addressIdk) {
		this.addressIdk = addressIdk;
	}
	public Integer getOrganizationIdk() {
		return organizationIdk;
	}
	public void setOrganizationIdk(Integer organizationIdk) {
		this.organizationIdk = organizationIdk;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}
	public LocalDateTime getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(LocalDateTime updatedTime) {
		this.updatedTime = updatedTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public EmployeeModel(Integer id, String firstName, String lastName, String emailId, LocalDate dob,
			String phoneNumber, String gender, Integer addressIdk, Integer organizationIdk, Boolean isActive,
			LocalDateTime createdTime, LocalDateTime updatedTime, String createdBy, String updatedBy) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.addressIdk = addressIdk;
		this.organizationIdk = organizationIdk;
		this.isActive = isActive;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}
	 
	public EmployeeModel() {
		super();
	}
}
