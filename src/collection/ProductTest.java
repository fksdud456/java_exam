package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class ProductTest {
	public static void main(String[] args) {
		TreeSet<Product> set = new TreeSet<>();

		addResult(set.add(new Product("p100", "TV", 20000)));
		addResult(set.add(new Product("p200", "Computer", 1000)));
		addResult(set.add(new Product("p100", "MP3", 700)));
		addResult(set.add(new Product("p300", "Audio", 100)));

		System.out.println(String.format("\n%-8s%-8s%-5s", "��ǰID", "��ǰ��", "����"));
		System.out.println("---------------------------------");
		for (Product data : set) {
			System.out.println(data);
		}
	}

	public static void addResult(boolean result) {
		if (result == true)
			System.out.println("���������� ����Ǿ����ϴ�.");
		else
			System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
	}
}
