package day8;

import java.util.Scanner;

class GradeExpr {
	int jumsu[];

	GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	void test() {
		jumsu[0] = 0;
	}

	double getAverage() {
		double avg = 0;

		for (int data : jumsu)
			avg += data;

		return avg / jumsu.length;
	}

	int getTotal() {
		int sum = 0;
		for (int data : jumsu)
			sum += data;

		return sum;
	}

	int getGoodScore() {
		int score = jumsu[0];
		for (int data : jumsu) {
			if (data > score)
				score = data;
		}

		return score;
	}

	int getBadScore() {
		int score = jumsu[0];
		for (int data : jumsu) {
			if (data < score)
				score = data;
		}
		return score;
	}

}

public class GradeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터의 개수를 입력하세요 : ");
		int dataNum = sc.nextInt();	
		int dataSet[] = new int[dataNum];
		System.out.print(dataSet.length + "개의 점수를 입력하세요 : ");
		for (int i = 0; i < dataSet.length; i++)
			dataSet[i] = sc.nextInt();

		sc.close();

		System.out.print("점수들 : ");
		for (int i = 0; i < dataSet.length; i++) {
			System.out.print(dataSet[i]);
			if (i != (dataSet.length - 1))
				System.out.print(", ");
		}
		
		System.out.println();
		GradeExpr ge = new GradeExpr(dataSet);
		System.out.println("총점 : " + ge.getTotal());
		System.out.printf("평균 : %.2f\n", ge.getAverage());
		System.out.println("최고 점수 : " + ge.getGoodScore());
		System.out.println("최저 점수 : " + ge.getBadScore());

	}

}
