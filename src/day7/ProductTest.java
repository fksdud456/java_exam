package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("��ũ����", 5, 10000);
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
		Product products[] = new Product[5];  // ���� ������ ������(4byte) ¥���� �������
		products[0] = new Product();
		products[1] = new Product("��ġ����", 3, 1000);
		products[2] = new Product("�Ѹ�����", 4, 2000);
		products[3] = new Product("�䳢����", 9, 6000);
		products[4] = new Product("��������", 16, 500000);

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
