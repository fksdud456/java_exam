package day16;

class LocalTest {
	String name = "Java";
	void pr(final String s) {
		final int su = 100;
		System.out.println(s+ ":" + su);
		//method�ȿ� ���ǵ� local Ŭ������ �� �ȿ����� ��밡��. ����ó�� ���ǵ� �ĺ��� ��밡��
		class Local {
			//Inner class�ȿ��� ����ϴ� ������ final�� �����Ϸ��� �ڵ����� �ٿ���
			void pr(String ls) {
				System.out.println("s:"+ s);
				System.out.println("ls:"+ ls);
				System.out.println(name); 
				System.out.println(su);
			}
		}
		Local lt = new Local();
		lt.pr("Local Test");
	}
}

public class InnerTest2 {

	public static void main(String[] args) {
		LocalTest l = new LocalTest();
		l.pr("main call");
	}

}
