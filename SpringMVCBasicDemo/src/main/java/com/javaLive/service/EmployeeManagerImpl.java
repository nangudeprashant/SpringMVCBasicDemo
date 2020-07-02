package com.javaLive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaLive.dao.EmployeeDAO;
import com.javaLive.model.Employee;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> getAllEmployees() 
	{
		return dao.getAllEmployees();
	}
}
