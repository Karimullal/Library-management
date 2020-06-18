package com.user.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.app.dao.UserRepo;
import com.user.app.entity.User;
import com.user.app.model.AddressRequestDto;
import com.user.app.model.AddressResponseDto;
import com.user.app.model.UserRequestDto;
import com.user.app.model.UserResponseDto;
import com.user.app.util.UserConvertion;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RestTemplate template;
	@Autowired
	private UserConvertion userConvertion;

	public UserResponseDto createUser(UserRequestDto userRequestDto) {
		AddressRequestDto addressRequestDto = userRequestDto.getAddressRequestDto();
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<AddressRequestDto> httpEntity = new HttpEntity<>(addressRequestDto, headers);
		ResponseEntity<AddressResponseDto> responseEntity = this.template.exchange(
				"http://localhost:9091/address-ms/address", HttpMethod.POST, httpEntity, AddressResponseDto.class);
		AddressResponseDto responseDto = responseEntity.getBody();
		User user = userConvertion.convertUserRequestDtoToUser(userRequestDto);
		user.setAddressId(responseDto.getId());
		userRepo.save(user);
		return userConvertion.convertUserToUserResponseDto(user);
	}
}
