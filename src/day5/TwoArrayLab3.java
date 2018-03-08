package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int[][] array = {
				{10, 20, 30, 40, 50},
				{5, 10, 15},
				{11, 22, 33, 44},
				{9, 8, 7, 6, 5, 4, 3, 2, 1}
		};
		
		int sum;
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int data : array[i])
				sum += data;
			
			System.out.println(i + 1 + "행의 합은 " + sum + "입니다.");
		}
	}

}
