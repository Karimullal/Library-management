package com.address.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.app.dto.AddressRequestDto;
import com.address.app.dto.AddressResponseDto;
import com.address.app.exception.AddressNotFoundExceptionHandler;
import com.address.app.service.AddressService;

@RestController
@RequestMapping(path = "address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	@PostMapping
	private ResponseEntity<AddressResponseDto> createAddress(@RequestBody AddressRequestDto addressRequestDto) {
		return new ResponseEntity<AddressResponseDto>(addressService.createAddress(addressRequestDto),
				HttpStatus.CREATED);
	}

	@GetMapping(path = "/{addressId}")
	private ResponseEntity<AddressResponseDto> getAddressById(@PathVariable("addressId") Integer id)
			throws AddressNotFoundExceptionHandler {
		return new ResponseEntity<AddressResponseDto>(addressService.getAddressById(id), HttpStatus.OK);
	}

	@PutMapping(path = "/{addressId}")
	private ResponseEntity<AddressResponseDto> updateAddressById(@PathVariable("addressId") Integer id,
			@RequestBody AddressRequestDto addressRequestDto) throws AddressNotFoundExceptionHandler {
		return new ResponseEntity<AddressResponseDto>(addressService.updateAddressById(id, addressRequestDto),
				HttpStatus.OK);
	}

	@DeleteMapping(path = "/{addressId}")
	private ResponseEntity<?> deleteAddressById(@PathVariable("addressId") Integer id)
			throws AddressNotFoundExceptionHandler {
		addressService.deleteAddressById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping
	private ResponseEntity<List<AddressResponseDto>> getAllAddress() {
		return new ResponseEntity<List<AddressResponseDto>>(addressService.getAllAddress(), HttpStatus.OK);
	}
}
