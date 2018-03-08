package day6;
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("테스트입니당%n");		
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3' );
		System.out.printf("%b\n", true);
		System.out.printf("%f %e\n", 100.0, 100.0);
		System.out.printf("%.2f\n", 123.5678);
		System.out.printf("|%s|\n", "자바");
		System.out.printf("|%10s|", "자바");
		System.out.printf("|%-10s|", "자바");
		System.out.printf("%,d원\n", 1000000);			
	}
}













