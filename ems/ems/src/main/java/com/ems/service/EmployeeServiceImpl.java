package com.ems.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.EmployeeEntity;
import com.ems.model.EmployeeModel;
import com.ems.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeRepository empRepo;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@Override
	public EmployeeModel addEmp(EmployeeModel request) throws Exception {
		EmployeeModel response = new EmployeeModel();
	        try{
	        	EmployeeEntity empEntity = new EmployeeEntity();
	        	if(request!=null) {
	        empEntity.setId(request.getId());
	        empEntity.setFirstName(request.getFirstName());
	        empEntity.setLastName(request.getLastName());
	        empEntity.setAddressIdk(request.getAddressIdk());
	        empEntity.setDob(request.getDob());
	        empEntity.setEmailId(request.getEmailId());
	        empEntity.setPhoneNumber(request.getPhoneNumber());
	        empEntity.setIsActive(request.getIsActive());
	        empEntity.setOrganizationIdk(request.getOrganizationIdk());
	        empEntity.setCreatedBy(request.getCreatedBy());
	        empEntity.setCreatedTime(request.getCreatedTime());
	        empEntity.setUpdatedBy(request.getUpdatedBy());
	        empEntity.setUpdatedTime(request.getUpdatedTime());
	        empEntity.setGender(request.getGender());
	        empRepo.save(empEntity);
	        
	        response = modelMapper.map(empEntity, EmployeeModel.class);
	        	} else {
	        		throw new Exception("Invalid input");
	        	}
	        }catch (Exception e) {
	            throw new Exception("Error occurred while adding an employee", e);
	        }
	        return response;
	}

	@Override
	public EmployeeModel getEmpById(Integer Id) throws Exception {
		return null;
	}

	@Override
	public List<EmployeeModel> getEmpList() throws Exception {
		return null;
	}

}
