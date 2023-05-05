package com.parishjain.EmployeeMappingProject.service;

import com.parishjain.EmployeeMappingProject.models.Address;
import com.parishjain.EmployeeMappingProject.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepository addressRepository;

    public Iterable<Address> fetchAllAddress() {
        return addressRepository.findAll();
    }

    public Address fetchAddressById(Long id) {
        Optional<Address> addressOptional = addressRepository.findById(id);
        if(addressOptional.isPresent()){
            Address address = addressOptional.get();
            return address;
        }
        else return null;
    }

    public String saveAddress(Address address) {
        addressRepository.save(address);
        return "Your record has been saved.";
    }

    public String deleteAddressById(Long id) {
        addressRepository.deleteById(id);
        return "Your record has been deleted.";
    }
}
