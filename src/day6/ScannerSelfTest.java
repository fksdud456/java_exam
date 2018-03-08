package day6;

import java.util.Scanner;

public class ScannerSelfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//CTRL + SHIFT + M --- ADD Import
		String a = sc.next();
		String b = sc.nextLine();
		int c = sc.nextInt();
		double d = sc.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	
		
		sc.close();
	}

}
