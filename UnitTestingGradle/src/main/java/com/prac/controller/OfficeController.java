package com.prac.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prac.model.Employee;
import com.prac.service.OfficeService;

@RestController
public class OfficeController {

	@Autowired
	OfficeService officeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return officeService.getAllEmployee();
	}
	
	@GetMapping("/employee/{name}")
	public Employee getEmployee(@PathVariable String name){
		return officeService.getEmployee(name);
	}
}
