package com.parishjain.EmployeeMappingProject.controller;

import com.parishjain.EmployeeMappingProject.models.Address;
import com.parishjain.EmployeeMappingProject.models.Employee;
import com.parishjain.EmployeeMappingProject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressController {



    @Autowired
    AddressService addressService;

    //    GET /addresses - get all addresses
    @GetMapping(value = "/get/all")
    public Iterable<Address> getAllAddress(){
        return addressService.fetchAllAddress();
    }


    //    GET /addresses/{id} - get an address by id
    @GetMapping(value = "/get/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.fetchAddressById(id);
    }

    //    POST /addresses - create a new address
    @PostMapping(value = "/add")
    public String addAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    //    DELETE /addresses/{id} - delete an address by id
    @DeleteMapping(value = "/delete/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}
