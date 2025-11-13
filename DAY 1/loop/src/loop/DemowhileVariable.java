package loop;

public class DemowhileVariable {

	public static void main(String[] args) {
		 int number =97;
	        int i=2;
	        boolean isPrime = true;
	        while(i<number){
	           	if(number % i == 0){
				isPrime = false;
	               		break;
	 	   	}
	                i++;
	         }
		 if(isPrime)
	                System.out.println("It is a Prime number");
	          else
			System.out.println("It is not a Prime number");
	     }


}


