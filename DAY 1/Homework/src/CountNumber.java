
public class CountNumber {

	public static void main(String[] args) {
		int number =1702;
		int count = 0;
		while(number!=0) {
			number= number/10;
			count++;
		}
       System.out.println(count);	
       }

}
