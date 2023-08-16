package com.example.demo.demo.service;

import com.example.demo.demo.Address;
import com.example.demo.demo.Student;
import com.example.demo.demo.repository.AddressRepository;
import com.example.demo.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAddress() {

        return addressRepository.findAll();
    }
    public Address saveAddress(Address address) {

        return addressRepository.save(address);
    }
    public Address updateAddress(Address address){
        return addressRepository.save(address);
    }
    public void deleteAddress(Long id){addressRepository.deleteById(id);
    }
}
