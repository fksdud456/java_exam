package day4;

public class TwoArrayTest1 {

	public static void main(String[] args) {
		int[][] score = new int[5][3];
		
		System.out.println(score); // >>   [[~~~ 이 변수는 2차원배열의 참조값이다
		System.out.println(score[0]); // >> [~~~
		System.out.println(score[0][0]);

		System.out.println(score.length); // >>   [[~~~ 이 변수는 2차원배열의 참조값이다
		System.out.println(score[0].length); // >> [~~~
		System.out.println(score[0][0]);

	}

}
