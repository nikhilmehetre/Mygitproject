package com.abc.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer,String> myMap = new HashMap<Integer,String> ();   /no order mainteaind
		//HashMap<Integer,String> myMap = new LinkedHashMap<Integer,String> ();   //maintains order
		TreeMap<Integer,String> myMap = new TreeMap<Integer,String> ();   //maintains order by sorting 
		
		myMap.put(100, "Nikhil");
		myMap.put(500, "Mason");
		myMap.put(300, "Andrew");
		myMap.put(400, "Tony");
		System.out.println(myMap.size());
		System.out.println(myMap.get(200));
		myMap.remove(300);
		System.out.println(myMap.size());
		System.out.println(myMap.get(300));
		System.out.println(myMap);
		
		
		//my map values
		Set<Integer> keys = myMap.keySet();
		for (Iterator<Integer> iterator =keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println("key->"+key);
			System.out.println("value->"+myMap.get(key));
			
		}
		
	}

}
