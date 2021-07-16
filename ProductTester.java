package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTester {

	public static void main(String[] args) {
		ProductDTO product = new ProductDTO("Lipstick","Lakme",500.00d,2);
		ProductDTO product1 = new ProductDTO("Comfact","Loreal",600.00d,1);
		ProductDTO product2= new ProductDTO("EyeLiner","Lakme",700.00d,3);
		ProductDTO product3= new ProductDTO("Kajal","Lakme",500.00d,1);
		ProductDTO product4 = new ProductDTO("Powder","Pounds",300.00d,2);

    List<ProductDTO> list = new ArrayList<ProductDTO>();
    list.add(product4);
    list.add(product3);
    list.add(product2);
    list.add(product);
    list.add(product1);
    System.out.println(list.size());
    System.out.println(list);
    
   System.out.println("Before sorting :");
   for(ProductDTO products : list) {
	   System.out.println(products);
   }   
    Collections.sort(list);
   
    System.out.println("After sorting");
    for(ProductDTO products : list) {
    	System.out.println(products);
    }
	

}
}
