package com.user.app.model;

public class AddressResponseDto {

	private Integer id;
	private String street;
	private String area;
	private String town;
	private String city;
	private String pincode;

	public AddressResponseDto(Integer id, String street, String area, String town, String city, String pincode) {
		this.id = id;
		this.street = street;
		this.area = area;
		this.town = town;
		this.city = city;
		this.pincode = pincode;
	}

	public AddressResponseDto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
