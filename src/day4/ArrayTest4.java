package day4;
public class ArrayTest4 {
	public static void main(String[] args) {
		int nums[] = {10, 5, 7, 15, 12, 20, 14, 8, 25, 19};
		// ù��° ����
		System.out.println(nums[0]);
		// ������ ����
		System.out.println(nums[nums.length-1]);
		// ù��° ���Һ��� ������ ���� ������ �� �࿡ ���
		for(int i=0; i < nums.length;i++)
			System.out.print(nums[i] + "\t");
		System.out.println();
		// ���������Һ��� ù��°���� ������ �� �࿡ ���
		for(int i=nums.length-1; i >= 0;i--)
			System.out.print(nums[i] + "\t");
		System.out.println();
		// Ȧ����° ���Ұ��� �� �࿡ ���
		for(int i=0; i < nums.length;i+=2)
			System.out.print(nums[i] + "\t");
		System.out.println();
		int maxNum;
		// nums ���� �ְ��� �����Ͽ� maxNum ����
		maxNum = nums[0];
		for(int i=1; i < nums.length;i++)
			if(maxNum < nums[i])
				maxNum = nums[i];
		System.out.println("���ҵ� �߿��� �ְ� : " + maxNum);
		int minNum;
		// nums ���� �ּҰ��� �����Ͽ� minNum ����
		minNum = nums[0];
		for(int i=1; i < nums.length;i++)
			if(minNum > nums[i])
				minNum = nums[i];
		System.out.println("���ҵ� �߿��� �ּҰ� : " + minNum);
	}
}











