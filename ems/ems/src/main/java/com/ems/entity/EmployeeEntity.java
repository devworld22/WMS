package com.ems.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="emp_details")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
	 @Id
	 private Integer id;
	 @Valid
	 @Column(name = "first_name")
	 private String firstName;
	 @Column(name = "last_name")
	 private String lastName;
	 @Column(name = "email_id")
	 @Email(message = "Invalid email format")
	 private String emailId;
	 @Column(name = "dob")
	 private LocalDate dob;
	 @Column(name = "phone_number")
	 private String phoneNumber;
	 @Column(name = "gender")
	 private String gender;
	 @Column(name = "address_id_k")
	 private Integer addressIdk;
	 @Column(name = "organization_id_k")
	 private Integer organizationIdk;
	 @Column(name = "is_active")
	 private Boolean isActive;
	 @Column(name = "careated_time")
	 private LocalDateTime createdTime;
	 @Column(name = "updated_time")
	 private LocalDateTime updatedTime;
	 @Column(name = "created_by")
	 private String createdBy;
	 @Column(name = "updated_by")
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
	public EmployeeEntity(Integer id, @Valid String firstName, String lastName,
			@Email(message = "Invalid email format") String emailId, LocalDate dob, String phoneNumber, String gender,
			Integer addressIdk, Integer organizationIdk, Boolean isActive, LocalDateTime createdTime,
			LocalDateTime updatedTime, String createdBy, String updatedBy) {
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
	public EmployeeEntity() {
		super();
	}
	 
	 
}
