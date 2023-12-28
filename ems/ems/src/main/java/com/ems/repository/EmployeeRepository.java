package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	
}
