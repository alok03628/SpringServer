package com.employeemanage.springserver;

import com.employeemanage.springserver.model.Employee;
import com.employeemanage.springserver.model.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setEmpName("Shyam");
		employee.setAddress("Varanasi");
		employee.setAmount(25000);
		employee.setDate(15032023);
		employee.setPartyName("SSKV");
		employee.setPaymentType("RTGS");
		employeeDao.save(employee);
	}

	//@Test
	void getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees() ;
			System.out.println(employees);
		}


}
