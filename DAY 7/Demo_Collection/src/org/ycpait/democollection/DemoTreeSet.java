package org.ycpait.democollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		
		Set<String> cities;
		cities = new TreeSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		
		//iterate using advanced for loop
		for(String city : cities) {
			System.out.println(cities);
		}
		
		//step-1
		Iterator<String> i;
		i= cities.iterator();
		
		//step-2
		while(i.hasNext()) {
			String city = i.next();
			System.out.println(city);
			
			if(city.equals("Pune"))
				i.remove();
		}
		  System.out.println(cities);
		}
}
