package com.prac.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prac.model.Employee;

@Repository
public class OfficeDao {
	
	private static Employee e1 = new Employee("Sam", 22, 20000.0);
	private static Employee e2 = new Employee("Macki", 28, 30000.0);
	private static Employee e3 = new Employee("Bllot", 24, 50000.0);
	private static Employee e4 = new Employee("Prae", 25, 27000.0);
	
	static List<Employee> list = new ArrayList<Employee>();
	static {
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
	}
	
	public List<Employee> getAllEmployees(){
		return list;
	}
	
	public Employee getEmployee(String name) {
		for(Employee e: list) {
			if(e.getName().equalsIgnoreCase(name)) {
				return e;
			}else {
				return null;
			}
		}
		return null;
	}
}