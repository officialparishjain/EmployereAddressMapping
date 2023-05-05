package com.parishjain.EmployeeMappingProject.repository;

import com.parishjain.EmployeeMappingProject.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
