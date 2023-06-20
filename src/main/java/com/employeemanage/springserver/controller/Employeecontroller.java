package com.employeemanage.springserver.controller;

import com.employeemanage.springserver.model.EmployeeInput;
import com.employeemanage.springserver.model.EmployeeDao;
import com.employeemanage.springserver.model.User;
import com.employeemanage.springserver.model.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Employeecontroller {

    @Autowired
    private EmployeeDao employeeDao;
    private UserDao userDao;
    @GetMapping("/employeeInput/get-all")
    public List<EmployeeInput> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }

    @GetMapping("/employeeInput/get-byId")
    public EmployeeInput findbyid(@PathVariable int receiptNo){
        return employeeDao.getById(receiptNo);
    }

    @PostMapping("/employeeInput/save")
    public EmployeeInput save(@RequestBody EmployeeInput employeeInput){
        return employeeDao.save(employeeInput);
    }

}
