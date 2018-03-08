package day3;

public class ForLab3 {

	public static void main(String[] args) {
		
		for (int dan = 9; dan >= 5; dan--) {
			System.out.print(dan + "´Ü : ");
			for (int num = 1; num <= 9; num++) {
				System.out.print(dan + "x" + num + "=" + dan * num + "\t");
			}
			System.out.println();
		}
	}

}
