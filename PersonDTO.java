package com.xworkz.groups;

import java.io.Serializable;

public class PersonDTO implements Serializable,Comparable<PersonDTO>{
	private int age;
	private String name;
	private String emailId;
	
	PersonDTO(){
		
	}

	public PersonDTO(int age, String name, String emailId) {
		super();
		this.age = age;
		this.name = name;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "PersonDTO [age=" + age + ", name=" + name + ", emailId=" + emailId + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public int  compareTo(PersonDTO dto) {
		int ageRef = dto.getAge();
		if(this.age == ageRef)
			return 0;
		if(this.age > ageRef)
			return +1;
		if(this.age < ageRef)
			return -1;
		return 0;
		

	}
}
