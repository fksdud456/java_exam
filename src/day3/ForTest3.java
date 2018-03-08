package day3;

public class ForTest3 {

	public static void main(String[] args) {
		System.out.println("심플 구구단");
		
		int dan = (int)(Math.random() * 9) + 1; // 1~9 난수
		System.out.print(dan + "단 : ");
		for(int num = 1; num <= 9; num++) {
			System.out.print(dan*num + "\t"); //tab만큼 공백 
		}
		
	}
}
