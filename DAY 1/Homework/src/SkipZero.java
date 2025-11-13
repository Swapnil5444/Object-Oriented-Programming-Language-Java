
public class SkipZero {

	public static void main(String[] args) {
		int num =1007;
		int digits =0;
		int num1 =0;
		int newnum=1;
		while(num>0) {
			digits = num %10;
			if(digits!=0) {
				num1 =  num1 + digits * newnum;
				newnum = newnum *10;
			}
			num = num/10;
		}
		System.out.println(num1);

	}

}
