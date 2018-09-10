package March2017.prob1Sol;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
    public static List<Student> obtainHonorRoll(List<Student> list) {
        //implement

    	return list.stream()
    			.filter(m->m.getGpa()>3.0)
    			.filter(k->k.getMajor().equals(Majors.CS))
    			.collect(Collectors.toList());
    }
}
