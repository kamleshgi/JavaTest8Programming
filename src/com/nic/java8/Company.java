package com.nic.java8;

import java.util.List;

public class Company {
	  private String name;
	  private Address address;
	  private List<Person> personList;
	  
	  
	  
	  
	public Company(String name, Address address, List<Person> personList) {
		super();
		this.name = name;
		this.address = address;
		this.personList = personList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
}
