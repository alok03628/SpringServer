package com.employeemanage.springserver.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends CrudRepository<Employee,Integer>  {
}
