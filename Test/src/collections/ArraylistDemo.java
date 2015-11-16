package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(535, "Sujit Majety", "sujit.majety@gmail.com", 2226246, "Hyderabad"));
		al.add(new Student(525, "Vinod", "vinod.@gmail.com", 2226246, "Hyderabad"));
		al.add(new Student(510, "Rajshekar", "raj@gmail.com", 2226246, "Hyderabad"));
		al.add(new Student(555, "Sushma", "sushma@gmail.com", 2226246, "Hyderabad"));
		al.add(new Student(590, "Sailaja", "sailaja@gmail.com", 2226246, "Hyderabad"));
		Collections.sort(al, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getRollNumber() > s2.getRollNumber())
					return 1;
				else
					return -1;

			}
		});
		for (Student student : al) {
			System.out.println("\n"+student);
		}
	}
}
