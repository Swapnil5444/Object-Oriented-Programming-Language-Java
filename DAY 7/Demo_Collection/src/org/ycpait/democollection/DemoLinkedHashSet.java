package org.ycpait.democollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		Set<String> cities;
		cities = new LinkedHashSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		
		System.out.println(cities);
	}
}
