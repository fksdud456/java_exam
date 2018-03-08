package day14;
public class IntegerTest {
	public static void main(String[] args) {
		String s1 = Integer.toBinaryString(12);
		String s2 = Integer.toBinaryString(88);
	    
		System.out.printf("%s\n", s1+8);
		System.out.printf("%s\n", s2+8);
		
		/*int num1 = Integer.parseInt(s1 ,2);
		int num2 = Integer.parseInt(s2, 2);*/
		int num1 = Integer.parseInt(s1,2);
		int num2 = Integer.parseInt(s2,2);
		
		System.out.printf("%d\n", num1+8);
		System.out.printf("%d\n", num2+8);
		
		
		
		
		
		
		
		
		
		
	}
}
