package day2;

public class OperLabAnd {
	public static void main(String[] args) {
		int grade = (int)(Math.random()*6)+1;
		if (grade>=4 && grade<=6){
			System.out.println(grade+"학년은 고학년입니다");
		}
		else {
			System.out.println(grade+"학년은 저학년입니다");
		}
	}
}
