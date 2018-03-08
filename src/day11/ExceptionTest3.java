package day11;

import java.util.Random;

class TestException extends Exception {
	TestException(String message) {
		super(message);
	}
}

/*
 * b클래스, c클래스는 throws 해서 호출된 메서드로 예외처리 넘김 
 * a클래스에서 예외처리 try-catch
 * 예외 발생되면 다음 구문 수행 하지 않고 예외잡을 때까지 호출한 함수로 돌아감
 */
public class ExceptionTest3 {

	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		a();
		System.out.println("main() 수행종료");
	}

	static void a() {
		System.out.println("a() 수행시작");
		try {
			b();
		} catch (TestException e) {
			//System.out.println("오류발생 : " + e.getMessage());
			//return; //있을 때 없을 때
			/*e.printStackTrace();*/
			System.exit(0);
		}
		System.out.println("a() 수행종료");

	}

	static void b() throws TestException {
		System.out.println("b() 수행시작");
		c();
		System.out.println("b() 수행종료");
	}

	static void c() throws TestException {
		System.out.println("c() 수행시작");
		boolean flag = new Random().nextBoolean(); //랜덤으로 예외 발생시킬지 여부 설정
		if (flag) {
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>"); 
		} else {
			System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		}
		System.out.println("c() 수행종료");
	}

}
