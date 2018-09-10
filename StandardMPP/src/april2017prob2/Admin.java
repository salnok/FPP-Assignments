package april2017prob2;

public class Admin {
	//implement
	private Department[] depts = new Department[3];
	
	public Department[] getDep() {
		return depts;
	}

	public Admin (Department[] dep) {
		depts = dep;
	}
	public String hourlyCompanyMessage() {
		String ss = "";
		for(Department d :depts) {
			
			ss +=format(d.getName(),d.nextMessage());
			
		}
		return ss;
	}
	public String format(String name, String smg) {
		return String.format("%s : %s \n" , name,smg);
	}
}
