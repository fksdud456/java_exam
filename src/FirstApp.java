public class FirstApp {	
	public static void main(String[] args) {		
		System.out.println("안녕하세요?");
		try {
			System.out.println(10/0);  // 몫 : /, 나머지 : %
		}catch(ArithmeticException e) { 
			System.out.println("예외발생으로 처리불가!"); 
		}
		System.out.println(100+200);
		System.out.println(100>200);
	}
}
