package com.arraylist;

public class Address {
	private String street;
	private int pinCode;
	Address(){}
	Address(String street,int pinCode){
		this.street=street;
		this.pinCode=pinCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String toString() {
		return "Address[steet= "+street+", pincode= "+pinCode+"]";
	}

}
