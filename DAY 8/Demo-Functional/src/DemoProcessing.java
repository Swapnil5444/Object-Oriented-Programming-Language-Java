import java.util.ArrayList;
import java.util.List;

public class DemoProcessing {

	public static void main(String[] args) {
		
		List<String> cities;
		cities = new ArrayList<>();
		
		System.out.println(cities.size());
		cities.add("Mumbai");//adding element at last 
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Mysore");
		cities.add("Mangalore");
		
		
		cities.forEach(str -> System.out.println(str));
		//System.out.println(cities);
		
		ArrayList<String> anothercity;
		anothercity = new ArrayList<>();
		for(String s :cities) {
			if(s.startsWith("M")) {
				anothercity.add(s);
			}
		}
		
		System.out.println(anothercity);

		ArrayList<Integer> cityl;
		cityl= new ArrayList<>();
		for(String s :cities) {
			cityl.add(s.length());
		}
		
		System.out.println(cityl);
	}

}
