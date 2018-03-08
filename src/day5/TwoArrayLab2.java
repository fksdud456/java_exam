package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][] array = {
				{'B', 'C', 'A', 'A'},
				{'C', 'C', 'B', 'B'},
				{'D', 'A', 'A', 'D'},
		};
		
		int[] count = new int[4];

		for (char[] tmp : array) {
			for (char data : tmp) {
				switch (data) {
				case 'A':
					count[0]++;
					break;
				case 'B':
					count[1]++;
					break;
				case 'C':
					count[2]++;
					break;
				case 'D':
					count[3]++;
					break;
				}
			}
		}

		char a = 'A';
		for (int i = 0; i < count.length; i++) {
			System.out.println((a++) + " 는 " + count[i] + "개 입니다.");
		}
		
	}

}
