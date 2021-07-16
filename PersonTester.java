package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class PersonTester {

	public static void main(String[] args) {
		PersonDTO dto1 = new PersonDTO(22,"teju","teju@gmail.com");
		PersonDTO dto2 = new PersonDTO(23,"sahana","sahana@gmail.com");
		PersonDTO dto3 = new PersonDTO(24,"anusha","anusha@gmail.com");
		PersonDTO dto4 = new PersonDTO(21,"rakshita","raksita@gmail.com");
		PersonDTO dto5 = new PersonDTO(25,"shree","shree@gmail.com");
		
		List<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(dto5);
		list.add(dto2);
		list.add(dto1);
		
		List<PersonDTO> list1 = new ArrayList<PersonDTO>();
		list1.add(dto3);
		list1.add(dto4);
		
		list1.addAll(list);
		System.out.println(list1);
		System.out.println(list1.size());
		
		
		boolean containsAll = list1.containsAll(list);
		System.out.println("contains : " +containsAll);
		
		PersonDTO dto6 = dto5;
		dto6 = dto3;
		boolean contains = list1.contains(dto6);
		System.out.println(contains);
		System.out.println("Before sorting");
		for(PersonDTO person : list) {
			
			System.out.println(person);
		}
		Collections.sort(list);
		System.out.println("After sorting");

		for(PersonDTO person:list) {
			
			System.out.println(person);
		}
	}

}
