package day4;

public class TwoArrayTest2 {

	public static void main(String[] args) {
		int[][] nums = { // 정방행렬
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 }
				};

		// 2행3열
		System.out.println(nums[1][2]);

		// 4행의 모든 데이터를 출력해 본다.
		for (int i = 0; i < nums[3].length; i++)
			System.out.print(nums[3][i] + "\t");

		System.out.println();
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i][2] + "\t");

		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++)
				System.out.print(nums[i][j] + "\t");

			System.out.println();
		}

		System.out.println("---------");		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i][i]);
		}

		System.out.println("---------");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i][nums.length - i -1]);
		}

		System.out.println("---------");		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j > 0 ; j--)
				sum+= nums[i][j];
		}
		System.out.println(sum);

	}

}
