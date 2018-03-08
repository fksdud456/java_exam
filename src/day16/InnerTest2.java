package day16;

class LocalTest {
	String name = "Java";
	void pr(final String s) {
		final int su = 100;
		System.out.println(s+ ":" + su);
		//method안에 정의된 local 클래스는 이 안에서만 사용가능. 변수처럼 정의된 후부터 사용가능
		class Local {
			//Inner class안에서 사용하는 변수는 final을 컴파일러가 자동으로 붙여줌
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
