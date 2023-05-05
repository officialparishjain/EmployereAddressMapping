package com.parishjain.EmployeeMappingProject.controller;

import com.parishjain.EmployeeMappingProject.models.Address;
import com.parishjain.EmployeeMappingProject.models.Employee;
import com.parishjain.EmployeeMappingProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {

//    EmployeeController:



    @Autowired
    EmployeeService employeeService;

    //    GET /employees - get all employees
    @GetMapping(value = "/get/all")
    public Iterable<Employee> getAllEmployee(){
        return  employeeService.fetchAllEmployee();
    }


    //    GET /employees/{id} - get an employee by id
    @GetMapping(value = "/get/{id}")
    public Employee getAddressById(@PathVariable Long id){
        return employeeService.fetchEmployeeById(id);
    }

    //    POST /employees - create a new employee
    @PostMapping(value = "/add")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    //    DELETE /employees/{id} - delete an employee by id
    @DeleteMapping(value = "/delete/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }


    //    PUT /employees/{id} - update an employee by id
    @PutMapping(value = "/update/{id}/lastname/{lastName}")
    public String updateEmployeeById(@PathVariable Long id,@PathVariable String lastName){
        return employeeService.updateEmployeeById(id,lastName);
    }
}
