public class StringDemo {

	public static void main(String[] args) {
		
		String city = new String("Mumbai");
		System.out.println(city);//invokes toString() of String class.
		System.out.println(city.length());
		System.out.println(city.charAt(0));
		System.out.println(city.equals("Mumbai"));
		System.out.println(city.equals("mumbai"));
		System.out.println(city.equalsIgnoreCase("Mumbai"));
		System.out.println(city.substring(2));
		System.out.println(city.substring(2, 4));//start index is inclusive and 
		                                         // end index is exclusive o/p is mb
		System.out.println(city.compareToIgnoreCase("Thane"));
		
		String newcity = city.replace('M','P');
	    System.out.println(newcity);
		
	    System.out.println(city);
	    
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println("====================");
		System.out.println(s1.equals(s2)); // it gives me True because we check a content 
		System.out.println(s1 == s2); // it gives me False because we check their address.
		
		
		String s3 = "a";
		String s4 = "a";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);

	}

}
