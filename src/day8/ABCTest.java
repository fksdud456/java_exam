package day8;

class A {
	A() {
		System.out.println("AŬ������ ��ü ����");
	}
}
class B extends A {
	B(int num) {
		
		System.out.println("BŬ������ ��ü ����");
	}
}

class C extends B {
	C() {
		super(10) ; 
		//�����Ϸ��� ������ �̰� �־���
		
		
		System.out.println("CŬ������ ��ü ����");
	}
}

public class ABCTest {

	public static void main(String[] args) {
		new C();

	}

}

