package com.abc.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSetTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> names = new LinkedHashSet<String> ();
		TreeSet<String> names = new TreeSet<String>();
		names.add("Nikhil");
		names.add("Rhythm");
		names.add("Rhythm");
		names.add("Rhythm");
		names.add("Jyotsna");
		names.add("Mehetre");
		names.add("Maverick");
		
		System.out.println(names.size());
		//System.out.println(names.get(2));
		names.remove("Rhythm 	");
		names.add("Hriyan");
		System.out.println(names.size());
		//System.out.println(names.get(3));
		System.out.println("iterator--->");
		for (Iterator<String> count = names.iterator(); count.hasNext();) {
			String name = (String) count.next();
			System.out.println(name);
		}
	}

}
