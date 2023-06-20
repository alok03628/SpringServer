package com.employeemanage.springserver.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public EmployeeInput getById(int receiptNo){
        Optional<EmployeeInput> employeeInput = repository.findById(receiptNo);
        if(employeeInput.isPresent()){
            return employeeInput.get();
        }
        throw new RuntimeException("id not found"+receiptNo);
    }

    public void delete(EmployeeInput employeeInput){
        repository.delete(employeeInput);
    }
}
