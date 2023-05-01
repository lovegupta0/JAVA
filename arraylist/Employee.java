package com.arraylist;


public class Employee implements Comparable <Employee> {
	int eId;
	String name;
	Address address;
	Employee(){
		//
	}
	Employee(int eId,String name,Address address){
		this.eId=eId;
		this.name=name;
		// proper encapsulation
		this.address=new Address(address.getStreet(),address.getPinCode());
	}
	
	public Address getAddress() {
		return new Address(this.address.getStreet(),this.address.getPinCode());
	}
	public void setAddress(Address address) {
		this.address = new Address(address.getStreet(),address.getPinCode());;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Employee[eId= "+eId+", name= "+name+", "+address+"]";
	}
	
	@Override
	public int compareTo(Employee e2) {
		return this.getName().compareTo(e2.getName());
	}

}
