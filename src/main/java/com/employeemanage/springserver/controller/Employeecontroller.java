package com.employeemanage.springserver.controller;

import com.employeemanage.springserver.model.EmployeeInput;
import com.employeemanage.springserver.model.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Employeecontroller {

    @Autowired
    private EmployeeDao employeeDao;
    @GetMapping("/employeeInput/get-all")
    public List<EmployeeInput> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }

    @PostMapping("/employeeInput/save")
    public EmployeeInput save(@RequestBody EmployeeInput employeeInput){
        return employeeDao.save(employeeInput);
    }

}
