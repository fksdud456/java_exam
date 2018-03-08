package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("듀크인형", 5, 10000);
	}

	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getBalance() {
		return balance;
	}

	int getPrice() {
		return price;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product products[] = new Product[5];  // 방은 무조건 참조형(4byte) 짜리로 만들어짐
		products[0] = new Product();
		products[1] = new Product("또치인형", 3, 1000);
		products[2] = new Product("둘리인형", 4, 2000);
		products[3] = new Product("토끼인형", 9, 6000);
		products[4] = new Product("돼지인형", 16, 500000);

		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() 
					+ "\t" + products[i].getBalance() 
					+ "\t" + products[i].getPrice());
		}
		System.out.println("------------------------------------------");
		for (Product data : products) {
			System.out.println(data.getName() 
					+ "\t" + data.getBalance() 
					+ "\t" + data.getPrice());
		}

	}

}
