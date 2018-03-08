package day4;
public class ArrayTest2 {
	public static void main(String[] args) {
		int score[ ] = new int[5];
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);	
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);	
		System.out.println(++score[0]);
		System.out.println(++score[1]);
		System.out.println(++score[2]);
		System.out.println(++score[3]);
		System.out.println(++score[4]);	
	}
}








