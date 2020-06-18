package com.user.app.model;

public class UserRequestDto {
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String mobile;
	private String dob;
	private AddressRequestDto addressRequestDto;

	public UserRequestDto() {
	}

	public UserRequestDto(String username, String firstname, String lastname, String email, String password,
			String mobile, String dob, AddressRequestDto addressRequestDto) {
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.dob = dob;
		this.addressRequestDto = addressRequestDto;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public AddressRequestDto getAddressRequestDto() {
		return addressRequestDto;
	}

	public void setAddressRequestDto(AddressRequestDto addressRequestDto) {
		this.addressRequestDto = addressRequestDto;
	}

}
