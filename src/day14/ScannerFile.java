/*
 * scanner(-) : 표준입력으로 받아올 땐, System.in
 * File, Readable, String, 등으로 받아올 수 있음 
 * Scanner(String객체).useDelimiter(", ")
 * sc.nextInt() >> ,기준으로 다음 int 가져옴
 * 
*/
package day14;

import java.io.File;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("c:/iotest/data.txt"));
		int sum = 0;
		int cnt = 0;
		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		System.out.println("sum = " + sum);
		System.out.printf("average = %.2f", (double) sum / cnt);
		sc.close();
	}
}
