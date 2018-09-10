package June2018prob1;

import java.util.List;
import java.util.stream.Collectors;

import June2018.prob1.dataclasses.StudentTestData;

public class Prob1 {

	// Returns a string of the full names (firstName + " " + lastName)
	// of those students who were enrolled in 2013 and took the "Algo" course.
	// Full names in this string should be separated using ", " as a separator
	public static String findStudents(List<Student> students) {
		//implement
		return students.stream().filter(stud ->stud.getYear() == 2013 && stud.getCourse().contains("Algo"))
				.map(stud -> stud.getFirstName() +" "+ stud.getLastName())
				.collect(Collectors.joining(", "));
	}

	// Returns a long value of the total number of students whose firstName
	// contains one of the characters 'a' or 'A' and who were born in October.
	public static long getTotalStudents(List<Student> students) {
		//implement
		
		return students.stream()
				.filter(stud ->  stud.getBirthDate().getMonth().getValue()==10)
				.map(stud ->stud.getFirstName().toUpperCase())
				.filter(fname ->fname.contains("A"))
				.count();
	}

	public static void main(String[] args) {
		testFindStudents();
		testGetTotalStudents();
	}

	// Expected output: Ameliy Smith, Isabella Thomas, Charlie Johnson
	public static void testFindStudents() {
		List<Student> students = StudentTestData.getList();
		System.out.println(findStudents(students));
	}

	// Expected output: 5
	public static void testGetTotalStudents() {
		List<Student> students = StudentTestData.getList();
		System.out.println(getTotalStudents (students));
	}

}
