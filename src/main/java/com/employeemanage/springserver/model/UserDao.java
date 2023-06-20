package com.employeemanage.springserver.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {

    @Autowired
    private userRepository repository;

    public User save(User users){
        return repository.save(users);
    }

    public List<User> getEmployeesDetails(){
        List<User> detailsforUser = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(detailsforUser::add);
        return detailsforUser;
    }
}
