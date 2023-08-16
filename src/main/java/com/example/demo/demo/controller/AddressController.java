package com.example.demo.demo.controller;

import com.example.demo.demo.Address;
import com.example.demo.demo.Student;
import com.example.demo.demo.service.AddressService;
import com.example.demo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/address")
public class AddressController {
    private final AddressService addressService;
    @Autowired
    public AddressController(AddressService addressService) {

        this.addressService = addressService;
    }

    @GetMapping("/GetAll")
    public List<Address> getAddress(){return addressService.getAddress();
    }

    @PostMapping
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }
    @PutMapping
    public Address updateAddress(@RequestBody Address address){return addressService.updateAddress(address);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
    }
    //swagger geliştirmeleri yapılıyor

}
