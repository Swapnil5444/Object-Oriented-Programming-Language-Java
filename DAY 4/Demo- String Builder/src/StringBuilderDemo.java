
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcd");
		System.out.println(sb.length());// it gives me length
		sb.insert(2, "jkl");
		System.out.println(sb);//it will replace 2 index to jkl.

	}

}
