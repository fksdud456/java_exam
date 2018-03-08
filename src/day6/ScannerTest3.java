package day6;
import java.util.Scanner;
public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 숫자(정수)를 입력해 주세요 : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.printf("합 : %d%n", number1 + number2);// \n
		System.out.print("두 개의 숫자(실수)를 입력해 주세요 : ");
		double number3 = sc.nextDouble();
		double number4 = sc.nextDouble();
		System.out.printf("합 : %.2f%n", number3 + number4);
		sc.close();
	}
}






