package day7;

class Book {
	String title;
	String author;
	int price;

	Book() {
		this("�ڹ��� ����", "���� ��", 0);
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	String getBookInfo() {
		return title + "\t\t" + author + "\t\t" + price;
	}

}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book();
		System.out.println(java.getBookInfo());

		Book a = new Book("a", "��ġ", 12000);
		System.out.println(a.getBookInfo());

		Book b = new Book("b", "�Ƕ�ġ", 12000);
		System.out.println(b.getBookInfo());

		Book c = new Book("c", "�ǶǶ�ġ", 9000);
		System.out.println(c.getBookInfo());

		Book d = new Book("d", "�ǶǶǶ�ġ", 23000);
		System.out.println(d.getBookInfo());

	}

}
