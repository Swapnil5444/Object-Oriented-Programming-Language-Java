package org.ycpait.lambda;

public class DemoLambda {
	
	public static void main(String[] args) {
		
		int a =10;
		
		Printable f = () -> {};
		
//		Taxable t = (double income) -> {return income * 0.20;};
		
//   	Taxable t = (income) -> {return income * 0.20;};
		
//		Taxable t =  income -> {return income * 0.20;};
		
//		Taxable t =  income -> return income * 0.20;
		
		Taxable t =  income -> income * 0.20;
		System.out.println(t.calculateTax(1000));
		
	//	StringJoiner sj = (String s1,String s2) -> {return s1+s2;};
		
	//	StringJoiner sj = ( s1, s2) -> {return s1+s2;};
		
		StringJoiner sj =  (s1,s2) ->  s1+s2;
		System.out.println(sj.join("Swapnil", "Rathod"));
		
		Searchable s = (String s1) -> {return false;};
		System.out.println(s.search(""));
		
		Length l = (String s2) -> {return s2.length();};
		System.out.println(l.len("SWAPNIl"));
	}

}
