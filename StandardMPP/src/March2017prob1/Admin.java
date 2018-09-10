package March2017prob1;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		return list.stream()
		.filter(g->g.getGpa()>3.0)
		.filter(d->d.getMajor().equals(Majors.CS))
		.collect(Collectors.toList());
		
	}
}
