package com.prac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac.dao.OfficeDao;
import com.prac.model.Employee;

@Service
public class OfficeService {

	@Autowired
	OfficeDao officeDao;
	
	public Employee getEmployee(String name) {
		return officeDao.getEmployee(name);
	}
	
	public List<Employee> getAllEmployee() {
		return officeDao.getAllEmployees();
	}
}

