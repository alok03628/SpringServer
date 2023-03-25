package com.employeemanage.springserver;

import com.employeemanage.springserver.model.EmployeeInput;
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
		EmployeeInput employeeInput = new EmployeeInput();
		employeeInput.setEmpName("Shyam");
		employeeInput.setAddress("Varanasi");
		employeeInput.setAmount(25000);
		employeeInput.setDate(15032023);
		employeeInput.setPartyName("SSKV");
		employeeInput.setPaymentType("RTGS");
		employeeDao.save(employeeInput);
	}

	//@Test
	void getAllEmployees() {
		List<EmployeeInput> employeeInputs = employeeDao.getAllEmployees() ;
			System.out.println(employeeInputs);
		}


}
