package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlcoholTester {

	public static void main(String[] args) {
		AlcoholDTO alcohol1 = new AlcoholDTO("RoyalStag",1500,true,1,"Whiskey");
		AlcoholDTO alcohol2 = new AlcoholDTO("RoyalChallenge",2800,true,2,"IndianWhiskey");
		AlcoholDTO alcohol3 = new AlcoholDTO("BagPiper",3500,false,1,"Beer");
		AlcoholDTO alcohol4 = new AlcoholDTO("MCDowels",1000,true,2,"Whiskey");

		List<AlcoholDTO> list = new ArrayList<AlcoholDTO>();
		list.add(alcohol4);
		list.add(alcohol1);
		list.add(alcohol3);
		list.add(alcohol2);
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("Before sorting");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("After sorting");
		System.out.println(list);
	}

}
