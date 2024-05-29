
public class Person {
	String name;
	String gender;
	String phoneNum;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String gender, String phoneNum) {
		super();
		this.name = name;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(gender);
		System.out.println(phoneNum);
	}
	
	
}
