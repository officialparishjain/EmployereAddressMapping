package com.parishjain.EmployeeMappingProject.repository;

import com.parishjain.EmployeeMappingProject.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepository extends CrudRepository<Address,Long> {

}
