package com.ems.service;

import java.util.List;

import com.ems.model.EmployeeModel;

public interface EmployeeService {

	public EmployeeModel addEmp(EmployeeModel request) throws Exception;

	public EmployeeModel getEmpById(Integer Id)throws Exception;

	public List<EmployeeModel> getEmpList() throws Exception;
}
