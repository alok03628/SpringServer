package com.employeemanage.springserver.controller;

import com.employeemanage.springserver.model.EmployeeInput;
import com.employeemanage.springserver.model.User;
import com.employeemanage.springserver.model.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Usercontroller {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/get-all")
    public List<User> detailsforUser(){
        return userDao.getEmployeesDetails();
    }

    @PostMapping("/user/save")
    public User saves(@RequestBody User user){
        return userDao.save(user);
    }

}
