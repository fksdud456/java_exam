package day2;
public class TypeTest5 {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = num1;
		System.out.println(num1 + " : " + num2);
		num2 = 3.14;
		System.out.println(num2);
		num1 = (int)num2;
		System.out.println(num1);
	}
}
