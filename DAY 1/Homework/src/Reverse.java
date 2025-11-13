
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num =4532;
      int reverse =0;
      while(num>0) {
    	  int digits = num %10;
    	  reverse = reverse *10 +digits;
    	  num = num/10;
      }
      System.out.println(reverse);
	}

}
