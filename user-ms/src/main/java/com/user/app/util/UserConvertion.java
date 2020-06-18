package com.user.app.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.user.app.entity.User;
import com.user.app.model.UserRequestDto;
import com.user.app.model.UserResponseDto;

@Component
public class UserConvertion {

	public User convertUserRequestDtoToUser(UserRequestDto userRequestDto) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper.map(userRequestDto, User.class);
	}
	
	public UserResponseDto convertUserToUserResponseDto(User user) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper.map(user, UserResponseDto.class);
	}
}
