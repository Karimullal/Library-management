package com.address.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.address.app.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{
	
	Address findAddressById(Integer id);

}
