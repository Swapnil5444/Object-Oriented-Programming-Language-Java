import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {

	public static void main(String[] args) {
		
		Project p = new Project();
		
		Class c = p.getClass();
		System.out.println(c);
		
//		String name = c.getName();
//		System.out.println(name);
		
		Method[] m = c.getMethods();
		for(Method m1: m) {
			System.out.println(m1.getName());
		}
		
		String name ="Swapnil";
		Class cStr = name.getClass();
		Field[] f = cStr.getDeclaredFields();
		for(Field f1 : f) {
			System.out.println(f1.getName() + "\t \t \t"+Modifier.toString(f1.getModifiers()));
		}
		
		System.out.println("===========================================================");
		Method[] ms = cStr.getDeclaredMethods();
		for(Method m2 :ms) {
			System.out.println(Modifier.toString(m2.getModifiers())+ " "
		                  +m2.getReturnType()+" "+m2.getName());
		}
	}
}
