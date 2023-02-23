package com.project.employee.pojo;

public class EmployeeAddress {

	private String address;
	private String city;
	private String state;
	private String zipcode;
	
	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeAddress(String address, String city, String state, String zipcode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ "]";
	}
	
	
}
