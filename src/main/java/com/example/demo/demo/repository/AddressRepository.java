package com.example.demo.demo.repository;

import com.example.demo.demo.Address;
import com.example.demo.demo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{


}
