package com.nic.java8.stream2;

import java.util.List;

public class Student {
 private int id;
 private String firstName;
 private String gender;
 private int age;
 private String dept;
 private String city;
 private String raink;
 private List<String> contacts;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getRaink() {
	return raink;
}
public void setRaink(String raink) {
	this.raink = raink;
}
public List<String> getContacts() {
	return contacts;
}
public void setContacts(List<String> contacts) {
	this.contacts = contacts;
}
public Student(int id, String firstName, String gender, int age, String dept, String city, String raink,
		List<String> contacts) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.gender = gender;
	this.age = age;
	this.dept = dept;
	this.city = city;
	this.raink = raink;
	this.contacts = contacts;
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", gender=" + gender + ", age=" + age + ", dept=" + dept
			+ ", city=" + city + ", raink=" + raink + ", contacts=" + contacts + "]";
}


 
}
