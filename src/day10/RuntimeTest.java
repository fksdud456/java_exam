package day10;

public class RuntimeTest {

	public static void main(String[] args) throws Exception{
		/*
		 * Singleton pattern
		 * 
		 * 접근제어자 떄문에 접근못하는 경우 err : not visible()
		 * 
		 * non-static 메서드도 많은데 생성자를 막아놓음
		 * Runtime r = new Runtime();
		 * 대신 Runtime객체를 생성해주는 static 메서드가 있음
		 * 
		 * runtime 객체는 JVM : JVM 사장.
		 * 주로 세스템자원을 활용하는 애들이 singleTon
		 * */
		Runtime r = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);
		r.exec("c:/windows/notepad.exe");
		
	}

}
