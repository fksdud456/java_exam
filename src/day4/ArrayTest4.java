package day4;
public class ArrayTest4 {
	public static void main(String[] args) {
		int nums[] = {10, 5, 7, 15, 12, 20, 14, 8, 25, 19};
		// 첫번째 원소
		System.out.println(nums[0]);
		// 마지막 원소
		System.out.println(nums[nums.length-1]);
		// 첫번째 원소부터 마지막 원소 순으로 한 행에 출력
		for(int i=0; i < nums.length;i++)
			System.out.print(nums[i] + "\t");
		System.out.println();
		// 마지막원소부터 첫번째원소 순으로 한 행에 출력
		for(int i=nums.length-1; i >= 0;i--)
			System.out.print(nums[i] + "\t");
		System.out.println();
		// 홀수번째 원소값만 한 행에 출력
		for(int i=0; i < nums.length;i+=2)
			System.out.print(nums[i] + "\t");
		System.out.println();
		int maxNum;
		// nums 에서 최고값을 추출하여 maxNum 저장
		maxNum = nums[0];
		for(int i=1; i < nums.length;i++)
			if(maxNum < nums[i])
				maxNum = nums[i];
		System.out.println("원소들 중에서 최고값 : " + maxNum);
		int minNum;
		// nums 에서 최소값을 추출하여 minNum 저장
		minNum = nums[0];
		for(int i=1; i < nums.length;i++)
			if(minNum > nums[i])
				minNum = nums[i];
		System.out.println("원소들 중에서 최소값 : " + minNum);
	}
}











