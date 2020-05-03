package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;







public class MapRecap {

	public static void main(String[] args) {
		
		
		//Create map of countries with capitals
		
		Map<String, String> hMap= new HashMap<>();
				
				hMap.put("USA", "Washington Dc");
				hMap.put("Russia", "Moscow");
				hMap.put("France", "Paris");
		        hMap.put("Iyaly", null);      //HashMap allows to store one null value.
		        hMap.put(null, "Casablanca"); // Also can store null Key.
		        hMap.put(null, "London");     //Duplicate key, previous value will be overwritten.
		        hMap.put("Germany", null);
		        System.out.println(hMap);
		        
		        
		//How to get all keys from a map? KeySet(), entrySet();
				Set<String> keys=hMap.keySet(); //Use loop or iterator to iterate over keys
				Iterator<String> it =keys.iterator();
				while(it.hasNext()) {
                    System.out.println(it.next());}
				
				System.out.println("---Keys using entry set -----");
				Set<Entry<String, String>> entries=hMap.entrySet();
				Iterator<Entry<String,String>>iter=entries.iterator();
				//lets get both key and value
				while(iter.hasNext()) {
				Entry<String,String> entry=iter.next();
				String myEntry=entry.getKey()+" "+entry.getValue();
				System.out.println(myEntry);
				}
				
				
				
	    // Create hashTable of countries with capitals
				
				Map<String, String> htable=new Hashtable<>();
				htable.put("USA", "Washington Dc");
				htable.put("Russia", "Moscow");
				htable.put("France", "Paris");
				htable.put("Tajikstan", "Dushanbe");
				 //htable.put("Iyaly", null);   ---> can not store null value =it will generate NullPointerException.
				  //hMap.put(null, "London");   ---> can not store null Key
				System.out.println(htable);
				
				//first part of the code
				createMap("City", "Chantilly");

				//second part of the code
				createMap("City", "Washington DC");

			}

			public static Map<String, String> createMap(String key, String value) {
				Map map=new HashMap<>();
				map.put(key, value);
				return map;
			}

	}


