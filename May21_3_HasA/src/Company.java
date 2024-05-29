
public class Company {
	String name;
	String location;
	int employee;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company(String name, String location, int employee) {
		super();
		this.name = name;
		this.location = location;
		this.employee = employee;
	}

	public void printInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("위치 : %s\n", location);
		System.out.printf("직원수 : %d명\n", employee);
	}
}
