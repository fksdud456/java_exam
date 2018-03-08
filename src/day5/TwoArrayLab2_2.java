package day5;
public class TwoArrayLab2_2 {
	public static void main(String[] args) {
		char[][] arr = { { 'B', 'C', 'A', 'A' }, 
				         { 'C', 'C', 'B', 'B' }, 
				         { 'D', 'A', 'A', 'D' } 
				         };
		int numChar[] = new int[4];
		for (char[] check : arr) {
			for (char check1 : check) {
				numChar[check1 - 65]++;
			}
		}
		for (int i = 0; i < numChar.length; i++) {
			System.out.println((char) (i + 65) + "는" + numChar[i] + 
					"개 입니다.");
		}
	}
}


