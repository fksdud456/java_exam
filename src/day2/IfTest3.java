package day2;

public class IfTest3 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 101);
		/*
		 * 90~100 �̸� "x : A���" 80~89 �̸� "x : B���" 70~79 �̸� "x : C���" 60~69 �̸�
		 * "x : D���" 59 �����̸� "x : F���"
		 */
		if (90 <= score && score <= 100)
			System.out.println(score + " : A���");
		else if (80 <= score && score < 90)
			System.out.println(score + " : B���");
		else if (70 <= score && score < 80)
			System.out.println(score + " : C���");
		else if (60 <= score && score < 70)
			System.out.println(score + " : D���");
		else
			System.out.println(score + " : F���");

		System.out.println("��������");
	}
}
