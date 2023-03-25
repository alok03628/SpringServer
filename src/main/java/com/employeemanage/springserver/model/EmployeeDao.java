package com.employeemanage.springserver.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeDao {

    @Autowired
    private employeeRepository repository;

    public EmployeeInput save(EmployeeInput employeeInput){
        return repository.save(employeeInput);
    }



    public List<EmployeeInput> getAllEmployees(){
        List<EmployeeInput> employeeInputs = new ArrayList<>();
        Streamable.of(repository.findAll())
            .forEach(employeeInputs::add);
        return employeeInputs;
    }



    public void delete(EmployeeInput employeeInput){
        repository.delete(employeeInput);
    }
}
