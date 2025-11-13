import java.util.HashSet;
import java.util.Set;

import org.ycpait.studentmanagement.entity.Student;

public class DemoHashCodeEquals {

	public static void main(String[] args) {
		
		Set<Student> students = new HashSet<Student>();

		Student s1 = new Student("Amit",88);
		Student s2 = new Student("Ajay",98);
		
		students.add(s1);
		students.add(s2);
		
		System.out.println(students.size());
		System.out.println(students);
	}

}
