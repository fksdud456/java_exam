package day8;

import java.util.Scanner;

class CalculatorExpr {
	int num1;
	int num2;
	
	CalculatorExpr(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;					
	}
	
	int getAddition() {
		return num1 + num2;		
	}
	
	int getSubtraction() {
		int result;
		if(num1 > num2)
			result = num1 - num2;
		else
			result = num2 - num1;
		
		return result;				
	}
	
	int getMultiplication() {
		return num1*num2;		
	}
	
	double getDivision() {
		if(num2 == 0)
			return 0;
		
		return num1/num2;
	}
	
}
public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean continueNex = true;
		while(continueNex) {
			System.out.print("�� ���� ���ڸ� �Է��ϼ��� : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			CalculatorExpr ce = new CalculatorExpr(num1, num2);
			System.out.println("����� ���� : " + num1 + num2);
			System.out.println("���� : " + ce.getAddition());
			System.out.println("���� : " + ce.getSubtraction());
			System.out.println("����� ���� : " + num1 + num2);
			System.out.println("����� ���� : " + num1 + num2);
			
			
		}
		sc.close();
	}

}
