package com.syntax.class31;

import java.util.HashMap;



public class Test {
	public static void main (String[]args){
	    HashMap<String,Integer> map= new HashMap<>();
			    map.put("mango",10);
			    map.put("apple", 30); 
			    map.put("orange", 20);
                display(map);
			    map.clear();
	        System.out.println("efepovpospomvpos");
	        map.put("dedwe", 43);
	    display(map);
	 
	    
	    
	    
	    
	    
	    
	  } 
	   public static void display(HashMap<String,Integer>map){
	      
	     /* map.put("mango",10);
	      map.put("apple", 30); 
	      map.put("orange", 20);*/
	     
	     for(String  key:map.keySet()) {
	       Integer value= map.get(key);
	       System.out.println(key+" : "+value);
	     }
	     
	   }
}
