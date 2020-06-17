package com.address.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.app.dao.AddressRepo;
import com.address.app.dto.AddressRequestDto;
import com.address.app.dto.AddressResponseDto;
import com.address.app.entity.Address;
import com.address.app.exception.AddressNotFoundExceptionHandler;
import com.address.app.util.AddressConvertor;

@Service
public class AddressService {
	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private AddressConvertor addressConvertor;

	public AddressResponseDto createAddress(AddressRequestDto addressRequestDto) {
		Address address = addressConvertor.convertAddressRequestDtoToAddress(addressRequestDto);
		addressRepo.save(address);
		AddressResponseDto addressResponseDto = addressConvertor.convertAddressToAddressResponseDto(address);
		return addressResponseDto;
	}

	public AddressResponseDto getAddressById(Integer id) throws AddressNotFoundExceptionHandler {
		Address address = addressRepo.findAddressById(id);
		if (address == null)
			throw new AddressNotFoundExceptionHandler("Address not found with id :: " + id);
		return addressConvertor.convertAddressToAddressResponseDto(address);
	}

	public AddressResponseDto updateAddressById(Integer id, AddressRequestDto addressRequestDto)
			throws AddressNotFoundExceptionHandler {
		Address address = addressRepo.findAddressById(id);
		if (address == null)
			throw new AddressNotFoundExceptionHandler("Address not found with id :: " + id);
		else {
			address = addressConvertor.convertAddressRequestDtoToAddress(addressRequestDto);
			address.setId(id);
			addressRepo.save(address);
		}

		return addressConvertor.convertAddressToAddressResponseDto(address);
	}

	public void deleteAddressById(int id) {
		addressRepo.deleteById(id);
	}

	public List<AddressResponseDto> getAllAddress() {
		List<Address> list = addressRepo.findAll();
		return list.stream().map(address -> addressConvertor.convertAddressToAddressResponseDto(address))
				.collect(Collectors.toList());

	}

}
