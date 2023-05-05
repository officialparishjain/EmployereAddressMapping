package com.parishjain.EmployeeMappingProject.service;

import com.parishjain.EmployeeMappingProject.models.Employee;
import com.parishjain.EmployeeMappingProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> fetchAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee fetchEmployeeById(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            Employee employee = employeeOptional.get();
            return employee;
        }
        else return null;
    }

    public String saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Your record has been saved.";
    }

    public String deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
        return "Your record has been deleted";
    }

    public String updateEmployeeById(Long id, String lastName) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if(optionalEmployee.isPresent()){
            Employee employee = optionalEmployee.get();
            employee.setEmpLastName(lastName);
            employeeRepository.save(employee);
            return "Updated";
        }
        else return "Not Updated...";
    }
}
