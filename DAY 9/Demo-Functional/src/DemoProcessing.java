import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
		
		// Filter accept predicate lambda expression
		//<-----------------------------Stream--------------------->
		Stream<String> streamCities = cities.stream();//1
		Stream<String> filteredStream = streamCities.filter(c-> c.startsWith("M"));//2
		List<String> li = filteredStream.toList();//3
		System.out.println(li);
		
		//<-----------------------------Stream--------------------->
		Stream<String> streamcities = cities.stream();
		Stream<String> filteredstream = streamcities.filter(c -> c.length()>=5);
		List<String> li1 = filteredstream.toList();//3
		System.out.println(li1);
		
		 //This is most recommended way in production
		cities.stream()
		       .filter(c -> c.length()>=5)
		       .toList();
		
		 List<Integer> citiesLength=new ArrayList<>();
		 //Map accept Functional lambda expression
		 for(String city: cities) {
			 citiesLength.add(city.length());
		 }
		 System.out.println(cityl);
		 
		 
		 streamCities = cities.stream();//1
		 Stream<Integer> lengthStream = streamCities.map(s-> s.length());//2
		 lengthStream.toList();
		 System.out.println(cityl);
		 
		 //This is most recommended way in production
		 citiesLength = cities.stream()
		                      .map(s -> s.length())
		                      .toList();
	}

}
