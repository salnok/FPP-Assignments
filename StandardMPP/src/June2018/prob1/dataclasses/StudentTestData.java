package June2018.prob1.dataclasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import June2018prob1.Student;

public class StudentTestData {

	private static List<Student> students = new ArrayList<>();

	static {

		students.add(new Student(1, "Ameliy", "Smith", LocalDate.of(1990, 10, 10), Arrays.asList("FPP", "MPP", "WAP", "Algo"), 2013));
		students.add(new Student(2, "Olivia", "Jones", LocalDate.of(1990, 10, 2), Arrays.asList("MPP", "SWE", "Algo"), 2017));
		students.add(new Student(3, "George", "Williams", LocalDate.of(1995, 3, 3), Arrays.asList("FPP", "MPP", "WAP", "WAA", "MWA"), 2017));
		students.add(new Student(4, "Harry", "Taylor", LocalDate.of(1990, 12, 11), Arrays.asList("FPP", "MPP", "PP", "NET"), 2013));
		students.add(new Student(5, "Emma", "Brown", LocalDate.of(1992, 12, 21), Arrays.asList("MPP", "BD", "BDT"), 2013));
		students.add(new Student(6, "Jack", "Davies", LocalDate.of(1990, 10, 25), Arrays.asList("FPP", "MPP", "EA", "ASD"), 2013));
		students.add(new Student(7, "Sophia", "Evans", LocalDate.of(1995, 10, 10), Arrays.asList("FPP", "MPP", "WAP", "MWA"), 2013));
		students.add(new Student(8, "Noah", "Wilson", LocalDate.of(1990, 9, 1), Arrays.asList("FPP", "MPP", "WAP", "Algo"), 2017));
		students.add(new Student(9, "Isabella", "Thomas", LocalDate.of(1987, 7, 21), Arrays.asList("FPP", "MPP", "WAP", "Algo"), 2013));
		students.add(new Student(10, "Charlie", "Johnson", LocalDate.of(1990, 4, 19), Arrays.asList("FPP", "MPP", "WAP", "Algo"), 2013));
		students.add(new Student(11, "Emily", "Smith", LocalDate.of(2001, 10, 18), Arrays.asList("MPP", "BD", "ML"), 2013));
		students.add(new Student(12, "Isla", "Smith", LocalDate.of(1990, 10, 12), Arrays.asList("FPP", "MPP", "BD", "ML"), 2013));

	}

	public static List<Student> getList() {
		return students;
	}

}
