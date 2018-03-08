package day11;
public class ExceptionTest1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작..");
		try  {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("연산 결과 : " + result);
			//예외가 발생할 수도 있는,  수행문장이 1개 이사
		}
		/*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("두 개의 프로그램 아규먼트를 입력하세ㅇ");
		}*/catch(ArithmeticException e) {
			System.out.println("두 번째 숫자는 0일 수 없어");
			/*System.out.println(e.getMessage());
			System.out.println(e);*/
			e.printStackTrace(); // 비동기로 메세지 보냄  
			return;
		}catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세");
			e.printStackTrace();
		}		catch (Exception e) {
			System.out.println("두 개의 프로그램 아규먼트를 입력하세ㅇ");
		}finally {// 0개 또는 1개 온다.
			System.out.println("이 블럭은 반드시 수행합니다요...");
		}
		System.out.println("main() 수행종료..");
		/*
		 * finally -- 이 블럭은 반드시.
		 * 마지막  -- main() 수행종료
		 * 둘의 차이점
		 * 
		 * ArithmeticException 에 return 추가했을 때 . 
		 * return 해도 finally 블럭은 수행함.
		 * 
		 * jvm이 수행하다가 try블럭의 2번째줄에서 exception발생
		 * 그럼 3,4번째 줄은 수행하지 않고 catch블럭 exception응로 가
		 * 
		 */	
		
		
		
	}

}
