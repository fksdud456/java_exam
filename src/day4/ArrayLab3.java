package day4;


public class ArrayLab3 {

	public static void main(String[] args) {
		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int) (Math.random() * 26) + 1;

		char strs[] = new char[10];
		char ch = 64;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 1 && nums[i] <= 26) {
				strs[i] = (char) (nums[i] + ch);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i == nums.length - 1)
				System.out.println();
			else
				System.out.print(", ");
		}
		
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]);
			if (i == strs.length - 1)
				System.out.println();
			else
				System.out.print(", ");
		}
	}

}
