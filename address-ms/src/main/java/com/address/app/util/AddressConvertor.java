package com.address.app.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.address.app.dto.AddressRequestDto;
import com.address.app.dto.AddressResponseDto;
import com.address.app.entity.Address;

@Component
public class AddressConvertor {

	public Address convertAddressRequestDtoToAddress(AddressRequestDto addressRequestDto) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper.map(addressRequestDto, Address.class);
	}
	
	public AddressResponseDto convertAddressToAddressResponseDto(Address address) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper.map(address, AddressResponseDto.class);
	}
}
