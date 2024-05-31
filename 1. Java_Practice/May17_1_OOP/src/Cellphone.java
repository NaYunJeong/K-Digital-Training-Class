
public class Cellphone {
	String model;
	String manufacture;
	int price;
	
	public void printInfo() {
		System.out.println(this.model);
		System.out.println(manufacture);
		System.out.printf("%,d원\n",price);
	}
	
	public void ringBell() {
		System.out.println("♩♬♪~♬");
	}
}
