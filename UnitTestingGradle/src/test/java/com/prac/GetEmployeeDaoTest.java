package com.prac;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.prac.dao.OfficeDao;
import com.prac.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class GetEmployeeDaoTest {
	@Mock
	static List<Employee> list = new ArrayList<Employee>();
	
	@InjectMocks
	OfficeDao officeDao;
	
	@BeforeClass
	public static void prepareDaoData() {
		Employee e1 = new Employee("Sam", 22, 20000.0);
		Employee e2 = new Employee("Macki", 28, 30000.0);
		Employee e3 = new Employee("Bllot", 24, 50000.0);
		Employee e4 = new Employee("Prae", 25, 27000.0);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
	}

	@Test
	public void testGetEmployee() {
		assertArrayEquals(new Employee("Sam", 22, 20000.0), officeDao.getEmployee("Sam"));	
	}

	private boolean assertArrayEquals(Employee employee, Employee employee2) {
		if(employee.getName().equals(employee2.getName())) {
			return true;
		}else {
			return false;
		}
	}
}
