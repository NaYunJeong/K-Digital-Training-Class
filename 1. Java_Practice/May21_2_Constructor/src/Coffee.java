
public class Coffee {
	String coffeeName;
	int coffeePrice;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String coffeeName, int coffeePrice) {
		super();
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}
	
	public void printInfo() {
		System.out.printf("커피 이름 : %s\n", coffeeName);
		System.out.printf("커피 가격 : %,d원\n", coffeePrice);
	}
}
