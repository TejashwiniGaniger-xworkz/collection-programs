package com.xworkz.groups;

import java.util.ArrayList;
import java.util.List;

public class TourismTesater {

	public static void main(String[] args) {

		TourismDTO dto1 = new TourismDTO("ChamundiHills",1000.00d,true,TypesTourism.TEMPLE,"MysorePak");
		TourismDTO dto2 = new TourismDTO("Maldives",2000.00d,true,TypesTourism.BEACH,"SeaFood");
		TourismDTO dto3 = new TourismDTO("Dandeli",1500.00d,true,TypesTourism.ADVENTURE,"Mandaki");
		TourismDTO dto4 = new TourismDTO("Murudeshawar",1000.00d,true,TypesTourism.TEMPLE,"MysorePak");
		TourismDTO dto5 = new TourismDTO("Goa",2500.00d,true,TypesTourism.BEACH,"Omlet");

		List<TourismDTO> list = new ArrayList<TourismDTO>();
         list.add(dto1);
         list.add(dto5);
         list.add(dto4);
         
         List<TourismDTO> list1= new ArrayList<TourismDTO>();
         list1.add(dto2);
         list1.add(dto3);
         
         list1.addAll(list);
         System.out.println(list1.size());
         
         boolean containsAll=list1.containsAll(list);
        System.out.println("containsAll :" + containsAll);
        
        TourismDTO dto6 = dto5;
        //dto6 = new TourismDTO();
        boolean contains = list1.contains(dto6);
        System.out.println(contains);
        
        //the method sort(List<T>) in the type collections is not applicable for the arguments(List<ToursimDTO>)
       // java.util.Collections.sort(list1); // List--> ToursimDTO -- >Compararble
        List<Integer> ageList =  new ArrayList<Integer>();
        ageList.add(76);
        ageList.add(54);
        ageList.add(22);
        
       
	}

}
