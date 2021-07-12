package com.syntax.class31;


import java.util.*;
import java.util.Map.Entry;
public class tes {

	
	/*
	Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList. 
	Step 2: Create appleMap<String, Object> and add below pairs into it.  
	“Items”, “Apple”
	“Price”, 20.00
	“Quantity”, 10
	Step 3: Add appleMap to dataList. 
	Step 4: Create orangeMap<String, Object> and add below pairs into it. 
	“Items”, “Orange” 
	“Price”, 21.99
	“Quantity”, 10
	 * */

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			List<Map<String, Object>> dataList = new ArrayList<>();
			
			
			//Creating appleMap<String, Object>
			Map<String, Object> appleMap = new LinkedHashMap<>();
			appleMap.put("Items", "Apple");
			appleMap.put("Price", 20.00);
			appleMap.put("Quantity", 10.0);
			
			
			//adding appleMap to dataList
			dataList.add(appleMap);
			
			
			//Creating orangeMap<String, Object>
			Map<String, Object> orangeMap = new LinkedHashMap<>();
			orangeMap.put("Items", "Orange");
			orangeMap.put("Price", 21.99);
			orangeMap.put("Quantity", 10.0);
			
			
			//Adding orangeMap to dataList
			dataList.add(orangeMap);
			
			
			// Creating a loop from dataList. 
			double appleSubtotal = 0;
			
			double orangeSubTotal = 0;
			
			double totalPurchase = 0;
			
			
			for(Map<String,Object> map:dataList){
				// Retrieving each Key and storing them in a variable. We need to store keys in a Set Object(unique values)
				
				Set<Entry<String,Object>> entSet =map.entrySet();
				
				for(Entry<String, Object> kndV:entSet) {
					String key = kndV.getKey();
					if (map.get(key).equals("Apple")) {
						Double applePrice = (Double) map.get("Price");
						double appleQuantity = (double) map.get("Quantity");
						appleSubtotal = applePrice * appleQuantity;
					} else if (map.get(key).equals("Orange")) {
						double orangePrice = (double) map.get("Price");
						 double orangeQuantity = (double) map.get("Quantity");
						orangeSubTotal = orangePrice * orangeQuantity;
					}
					
					totalPurchase = appleSubtotal + orangeSubTotal;
					
					System.out.print(key + "" + kndV.getValue() +" ");
					
					
				}
				
				if(map.equals(appleMap)) {
					System.out.println("SubTotal: " + appleSubtotal);
				}else {
					System.out.println("SubTotal: " + orangeSubTotal);
				}				
					}
						System.out.println("Your Purchase total : "+totalPurchase);
				
		}
	}
	
	
	

