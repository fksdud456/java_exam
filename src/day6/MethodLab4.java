package day6;
public class MethodLab4 {
	public static void main(String[] args) {
		printNum(maxNumArray(new int[] {10, 20, 30}));
		printNum(maxNumArray(new int[] {100, 500, 300, 200, 400}));
		printNum(maxNumArray(new int[] {1, 10, 3, 4, 5, 8, 7, 6, 9, 2}));
	}
	public static int maxNumArray(int[] maxArray){	// 입력된 배열 중 가잔 큰 원소값을 반환
		int maxNum = 0;
		for(int i=0; i<maxArray.length; i++){
			if(maxNum < maxArray[i])
				maxNum = maxArray[i];
		}
		return maxNum;
	}
	public static void printNum(int num){	// 입력된 값을 출력
		System.out.printf("가장 큰 값은 %d입니다.\n", num);
	}	
}
