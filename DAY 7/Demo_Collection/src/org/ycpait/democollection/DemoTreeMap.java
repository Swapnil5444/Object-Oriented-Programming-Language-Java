package org.ycpait.democollection;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		
		Map<Integer,String> cities;
		cities = new TreeMap<Integer,String>();
		cities.put(22, "Mumbai");
		cities.put(33,"Kolkata");
		cities.put(11,"Delhi");
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.get(22));
		System.out.println(cities.containsKey(11));
		System.out.println(cities.containsValue("Mumbai"));
		
		//Duplicates key NOT allowed
		cities.put(11,"Bangalore");
		System.out.println(cities);
		
		//Duplicates value is allowed
	    cities.put(20,"Mumbai");
		System.out.println(cities);
		
		cities.remove(33);
		System.out.println(cities);
		cities.clear();
	}
}
