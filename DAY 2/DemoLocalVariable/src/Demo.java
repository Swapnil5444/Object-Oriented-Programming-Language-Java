
public class Demo {

	public static void main(String[] args) {
		int age; //age is local to main method
		//System.out.println(age); ERROR -local variable must be initialize before accessing 
		
		int i;
		for(i=1;i<=5;i++) {
			
		}
		System.out.println(i);//ERROR bcz i is local to for loop                   

	}

}
