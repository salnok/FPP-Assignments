package June2018prob1;

import java.time.LocalDate;
import java.util.List;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
    private LocalDate birthDate;
    private List<String> course;
    private int year;
    
	public Student(int id, String firstName, String lastName, LocalDate birthDate, List<String> course, int year) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.course = course;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public List<String> getCourse() {
		return course;
	}

	public int getYear() {
		return year;
	}
    
    	
}
